package org.goafabric.fhir.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.api.AddProfileTagEnum;
import ca.uhn.fhir.context.api.BundleInclusionRule;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsResourceProvider;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.api.Constants;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.server.ETagSupportEnum;
import ca.uhn.fhir.rest.server.FifoMemoryPagingProvider;
import ca.uhn.fhir.rest.server.IPagingProvider;
import ca.uhn.fhir.rest.server.interceptor.IServerInterceptor;
import org.goafabric.fhir.logic.PractitionerLogic;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Practitioner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A demo JaxRs Practitioner Rest Provider
 */
@Path(PractitionerService.PATH)
@Produces({ MediaType.APPLICATION_JSON, Constants.CT_FHIR_JSON, Constants.CT_FHIR_XML })
@ApplicationScoped
public class PractitionerService extends AbstractJaxRsResourceProvider<Practitioner> {
	@Inject
	PractitionerLogic PractitionerLogic;

	/**
	 * The HAPI paging provider for this server
	 */
	public static final IPagingProvider PAGE_PROVIDER;

	static final String PATH = "/Practitioner";
	private static final ConcurrentHashMap<String, List<Practitioner>> Practitioners = new ConcurrentHashMap<String, List<Practitioner>>();

	static {
		PAGE_PROVIDER = new FifoMemoryPagingProvider(10);
	}

	public PractitionerService() {
		super(FhirContext.forR4(), PractitionerService.class);
	}


	@Override
	public AddProfileTagEnum getAddProfileTag() {
		return AddProfileTagEnum.NEVER;
	}

	@Override
	public BundleInclusionRule getBundleInclusionRule() {
		return BundleInclusionRule.BASED_ON_INCLUDES;
	}

	@Override
	public ETagSupportEnum getETagSupport() {
		return ETagSupportEnum.DISABLED;
	}

	/** THE DEFAULTS */

	@Override
	public List<IServerInterceptor> getInterceptors_() {
		return Collections.emptyList();
	}

	private Practitioner getLast(final List<Practitioner> list) {
		return list.get(list.size() - 1);
	}

	@Override
	public IPagingProvider getPagingProvider() {
		return PAGE_PROVIDER;
	}

	@Override
	public Class<Practitioner> getResourceType() {
		return Practitioner.class;
	}

	@Override
	public boolean isDefaultPrettyPrint() {
		return true;
	}

	@Read
	public Practitioner getPractitioner(@IdParam final IdType idType) {
		return PractitionerLogic.getPractitioner(idType);
	}

	@Search
	public List<Practitioner> findPractitioner(
			@OptionalParam(name = Practitioner.SP_GIVEN) StringParam given,
			@OptionalParam(name = Practitioner.SP_FAMILY) StringParam name) {
		return PractitionerLogic.findPractitioner(name, given);
	}

}
