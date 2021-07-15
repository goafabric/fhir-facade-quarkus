package org.goafabric.fhir.logic;

import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import org.goafabric.fhir.adapter.PersonServiceAdapter;
import org.goafabric.fhir.crossfunctional.DurationLog;
import org.goafabric.fhir.logic.mapper.PatientMapper;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Patient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@DurationLog
public class PatientLogic {
    @Inject
    PersonServiceAdapter personServiceAdapter;

    public Patient getPatient(final IdType idType) {
        if (!"1".equals(idType.getIdPart())) {
            throw new ResourceNotFoundException("patient not found");
        }

        //personServiceAdapter.sayMyName("Homer"); //just for showcasing
        
        return PatientMapper.map(
                personServiceAdapter.findByFirstName("Homer").get(0));
    }

    public List<Patient> findPatient(StringParam given,
                                     StringParam name) {
        return PatientMapper.map(
                personServiceAdapter.findByFirstName("Homer"));
    }

}
