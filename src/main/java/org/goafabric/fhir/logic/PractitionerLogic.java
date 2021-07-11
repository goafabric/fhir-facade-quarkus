package org.goafabric.fhir.logic;

import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.param.StringParam;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.StringType;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class PractitionerLogic {
    @Read
    public Practitioner getPractitioner(final IdType idType) {
        if (!"1".equals(idType.getIdPart())) {
            throw new IllegalStateException("Practitioner not found");
        }

        return createPractitioner(idType);
    }


    @Search
    public List<Practitioner> findPractitioner(StringParam given,
                                     StringParam name) {
        return Arrays.asList(createPractitioner(new IdType()));
    }

    private Practitioner createPractitioner(IdType idType) {
        final Practitioner Practitioner = new Practitioner();
        Practitioner.setId(idType);
        Practitioner.setName(
                Arrays.asList(new HumanName()
                        .setGiven(Arrays.asList(new StringType("Monty")))
                        .setFamily("Burns"))
        );
        return Practitioner;
    }
}
