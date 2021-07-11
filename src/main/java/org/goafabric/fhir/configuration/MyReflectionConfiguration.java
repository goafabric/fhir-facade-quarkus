package org.goafabric.fhir.configuration;

import ca.uhn.fhir.context.FhirVersionEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets={
        FhirVersionEnum.class,
        org.hl7.fhir.r4.hapi.ctx.FhirR4.class,
        org.hl7.fhir.r4.model.StructureDefinition.class,
        org.hl7.fhir.r4.model.BackboneType.class,
        org.hl7.fhir.r4.model.CareTeam.class})
public class MyReflectionConfiguration {
}