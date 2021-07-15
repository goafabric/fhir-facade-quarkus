/*
package org.goafabric.fhir.configuration;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.hl7.fhir.r4.model.*;

@RegisterForReflection(targets= {
        //Base classes
        ca.uhn.fhir.context.FhirVersionEnum.class,
        org.hl7.fhir.utilities.xhtml.XhtmlNode.class,
        ca.uhn.fhir.rest.api.server.IFhirVersionServer.class,
        ca.uhn.fhir.rest.api.MethodOutcome.class,

        //Service Classes needed for Metadata
        org.goafabric.fhir.service.PatientService.class,
        org.goafabric.fhir.service.PractitionerService.class,
        org.goafabric.fhir.service.BundleService.class,

        //Parameter classes
        ca.uhn.fhir.rest.param.StringParam.class,

        //R4 Context and Base classes
        org.hl7.fhir.r4.hapi.ctx.FhirR4.class,
        org.hl7.fhir.r4.model.OperationOutcome.class,
        org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent.class,
        org.hl7.fhir.r4.model.OperationOutcome.IssueTypeEnumFactory.class,
        org.hl7.fhir.r4.model.OperationOutcome.IssueSeverityEnumFactory.class,

        org.hl7.fhir.r4.model.CapabilityStatement.class,

        //R4 model classes
        Address.class,
        Attachment.class,
        BackboneElement.class,
        BackboneType.class,

        Bundle.class,
        Bundle.BundleEntryComponent.class,
        Bundle.BundleLinkComponent.class,
        Bundle.BundleEntrySearchComponent.class,
        Bundle.BundleEntryRequestComponent.class,
        Bundle.BundleEntryResponseComponent.class,

        CodeableConcept.class,
        ContactPoint.class,
        DateType.class,
        Identifier.class,
        HumanName.class,
        Organization.class,

        Patient.class,
        Patient.PatientLinkComponent.class,
        Patient.PatientCommunicationComponent.class,
        Patient.ContactComponent.class,

        Practitioner.class,
        Practitioner.PractitionerQualificationComponent.class,

        Reference.class,
        Resource.class,
        StructureDefinition.class,
        Type.class
        })
public class ReflectionConfigurationR4Small {
}

 */