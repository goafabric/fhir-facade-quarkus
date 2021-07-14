package org.goafabric.fhir.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsResourceProvider;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.param.StringParam;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.goafabric.fhir.logic.PatientLogic;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import java.util.List;

/**
 * A demo JaxRs Patient Rest Provider
 */
@Path(PatientService.PATH)
//@Produces({ MediaType.APPLICATION_JSON, Constants.CT_FHIR_JSON, Constants.CT_FHIR_XML })
@ApplicationScoped
public class PatientService extends AbstractJaxRsResourceProvider<Patient> {
	static final String PATH = ServerConfiguration.ROOT_PATH + "/Patient";

	@Inject
	PatientLogic patientLogic;

	public PatientService() {
		super(FhirContext.forR4());
	}

	@Override
	public Class<Patient> getResourceType() {
		return Patient.class;
	}

	@Read
	public Patient getPatient(@IdParam final IdType idType) {
		return patientLogic.getPatient(idType);
	}

	@Search
	public List<Patient> findPatient(
			@OptionalParam(name = Patient.SP_GIVEN) StringParam given,
			@OptionalParam(name = Patient.SP_FAMILY) StringParam name) {
		return patientLogic.findPatient(name, given);
	}

}
