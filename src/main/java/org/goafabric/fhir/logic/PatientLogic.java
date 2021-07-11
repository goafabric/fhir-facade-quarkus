package org.goafabric.fhir.logic;

import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.param.StringParam;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.StringType;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class PatientLogic {
    @Read
    public Patient getPatient(final IdType idType) {
        if (!"1".equals(idType.getIdPart())) {
            throw new IllegalStateException("patient not found");
        }

        return createPatient(idType);
    }


    @Search
    public List<Patient> findPatient(StringParam given,
                                     StringParam name) {
        return Arrays.asList(createPatient(new IdType()));
    }

    private Patient createPatient(IdType idType) {
        final Patient patient = new Patient();
        patient.setId(idType);
        patient.setName(
                Arrays.asList(new HumanName()
                        .setGiven(Arrays.asList(new StringType("Homer")))
                        .setFamily("Simpson"))
        );
        return patient;
    }
}
