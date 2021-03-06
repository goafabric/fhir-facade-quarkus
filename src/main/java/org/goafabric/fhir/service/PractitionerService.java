package org.goafabric.fhir.service;

import ca.uhn.fhir.jaxrs.server.AbstractJaxRsResourceProvider;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.param.StringParam;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.goafabric.fhir.logic.PractitionerLogic;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Practitioner;

import javax.inject.Inject;
import javax.ws.rs.Path;
import java.util.List;

/**
 * A demo JaxRs Practitioner Rest Provider
 */
@Path(PractitionerService.PATH)
public class PractitionerService extends AbstractJaxRsResourceProvider<Practitioner> {
	static final String PATH = ServerConfiguration.ROOT_PATH + "/Practitioner";

	@Inject
	PractitionerLogic practitionerLogic;

	public PractitionerService() {
		super(ServerConfiguration.getFhirContextR4());
	}

	@Override
	public Class<Practitioner> getResourceType() {
		return Practitioner.class;
	}

	@Read
	public Practitioner getPractitioner(@IdParam final IdType idType) {
		return practitionerLogic.getPractitioner(idType);
	}

	@Search
	public List<Practitioner> findPractitioner(
			@OptionalParam(name = Practitioner.SP_GIVEN) StringParam given,
			@OptionalParam(name = Practitioner.SP_FAMILY) StringParam name) {
		return practitionerLogic.findPractitioner(name, given);
	}

}
