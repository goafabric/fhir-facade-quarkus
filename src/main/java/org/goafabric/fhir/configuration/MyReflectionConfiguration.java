package org.goafabric.fhir.configuration;

import ca.uhn.fhir.context.FhirVersionEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets={ FhirVersionEnum.class, org.hl7.fhir.r4.hapi.ctx.FhirR4.class})
public class MyReflectionConfiguration {
}