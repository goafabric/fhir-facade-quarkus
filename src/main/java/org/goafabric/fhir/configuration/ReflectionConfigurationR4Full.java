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

        //New R4 Classes in 5.6+
        //org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory.class,
        //org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory.class,

        //R4 Context and Base classes
        org.hl7.fhir.r4.hapi.ctx.FhirR4.class,
        org.hl7.fhir.r4.model.OperationOutcome.class,
        org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent.class,
        org.hl7.fhir.r4.model.OperationOutcome.IssueTypeEnumFactory.class,
        org.hl7.fhir.r4.model.OperationOutcome.IssueSeverityEnumFactory.class,
        
        org.hl7.fhir.r4.model.CapabilityStatement.class,

        //R4 Metadata classes
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent.class,
        org.hl7.fhir.r4.model.CapabilityStatement.DocumentModeEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.DocumentModeEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityModeEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteractionEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicyEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatusEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatusEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicyEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteractionEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityModeEnumFactory.class,
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKindEnumFactory.class,

        //R4 model all classes
        Account.class,
        ActivityDefinition.class,
        Address.class,
        AdverseEvent.class,
        Age.class,
        AllergyIntolerance.class,
        Annotation.class,
        Appointment.class,
        AppointmentResponse.class,
        Attachment.class,
        AuditEvent.class,
        BackboneElement.class,
        BackboneType.class,
        Base.class,
        Base64BinaryType.class,
        BaseBinary.class,
        BaseDateTimeType.class,
        BaseExtension.class,
        BaseNarrative.class,
        BaseReference.class,
        BaseResource.class,
        Basic.class,
        Binary.class,
        BiologicallyDerivedProduct.class,
        BodyStructure.class,
        BooleanType.class,

        Bundle.class,
        Bundle.BundleEntryComponent.class,
        Bundle.BundleLinkComponent.class,
        Bundle.BundleEntrySearchComponent.class,
        Bundle.BundleEntryRequestComponent.class,
        Bundle.BundleEntryResponseComponent.class,

        CanonicalType.class,
        CapabilityStatement.class,
        CarePlan.class,
        CareTeam.class,
        CatalogEntry.class,
        ChargeItem.class,
        ChargeItemDefinition.class,
        Claim.class,
        ClaimResponse.class,
        ClinicalImpression.class,
        CodeableConcept.class,
        CodeSystem.class,
        CodeType.class,
        Coding.class,
        Communication.class,
        CommunicationRequest.class,
        Comparison.class,
        CompartmentDefinition.class,
        Composition.class,
        ConceptMap.class,
        Condition.class,
        Configuration.class,
        Consent.class,
        Constants.class,
        ContactDetail.class,
        ContactPoint.class,
        Contract.class,
        Contributor.class,
        Count.class,
        Coverage.class,
        CoverageEligibilityRequest.class,
        CoverageEligibilityResponse.class,
        DataRequirement.class,
        DateTimeType.class,
        DateType.class,
        DecimalType.class,
        DetectedIssue.class,
        Device.class,
        DeviceDefinition.class,
        DeviceMetric.class,
        DeviceRequest.class,
        DeviceUseStatement.class,
        DiagnosticReport.class,
        Distance.class,
        DocumentManifest.class,
        DocumentReference.class,
        DomainResource.class,
        Dosage.class,
        Duration.class,
        EffectEvidenceSynthesis.class,
        Element.class,
        ElementDefinition.class,
        Encounter.class,
        Endpoint.class,
        EnrollmentRequest.class,
        EnrollmentResponse.class,
        Enumeration.class,
        Enumerations.class,
        EnumFactory.class,
        EpisodeOfCare.class,
        EventDefinition.class,
        Evidence.class,
        EvidenceVariable.class,
        ExampleScenario.class,
        ExplanationOfBenefit.class,
        Expression.class,
        ExpressionNode.class,
        Extension.class,
        ExtensionHelper.class,
        Factory.class,
        FamilyMemberHistory.class,
        FhirPublication.class,
        Flag.class,
        Goal.class,
        GraphDefinition.class,
        Group.class,
        GuidanceResponse.class,
        HealthcareService.class,
        HumanName.class,
        ICoding.class,
        Identifier.class,
        IdType.class,
        ImagingStudy.class,
        Immunization.class,
        ImmunizationEvaluation.class,
        ImmunizationRecommendation.class,
        ImplementationGuide.class,
        InstantType.class,
        InsurancePlan.class,
        IntegerType.class,
        Invoice.class,
        Library.class,
        Linkage.class,
        ListResource.class,
        Location.class,
        MarkdownType.class,
        MarketingStatus.class,
        Measure.class,
        MeasureReport.class,
        Media.class,
        Medication.class,
        MedicationAdministration.class,
        MedicationDispense.class,
        MedicationKnowledge.class,
        MedicationRequest.class,
        MedicationStatement.class,
        MedicinalProduct.class,
        MedicinalProductAuthorization.class,
        MedicinalProductContraindication.class,
        MedicinalProductIndication.class,
        MedicinalProductIngredient.class,
        MedicinalProductInteraction.class,
        MedicinalProductManufactured.class,
        MedicinalProductPackaged.class,
        MedicinalProductPharmaceutical.class,
        MedicinalProductUndesirableEffect.class,
        MessageDefinition.class,
        MessageHeader.class,
        Meta.class,
        MetadataResource.class,
        MolecularSequence.class,
        Money.class,
        MoneyQuantity.class,
        NamingSystem.class,
        Narrative.class,
        NutritionOrder.class,
        Observation.class,
        ObservationDefinition.class,
        OidType.class,
        OperationDefinition.class,
        OperationOutcome.class,
        Organization.class,
        OrganizationAffiliation.class,
        ParameterDefinition.class,
        Parameters.class,

        Patient.class,
        Patient.PatientLinkComponent.class,
        Patient.PatientCommunicationComponent.class,
        Patient.ContactComponent.class,
        
        PaymentNotice.class,
        PaymentReconciliation.class,
        Period.class,
        Person.class,
        PlanDefinition.class,
        Population.class,
        PositiveIntType.class,
        Practitioner.class,
        Practitioner.PractitionerQualificationComponent.class,
        PractitionerRole.class,
        PrimitiveType.class,
        Procedure.class,
        ProdCharacteristic.class,
        ProductShelfLife.class,
        ProfilingWrapper.class,
        Property.class,
        Provenance.class,
        Quantity.class,
        Questionnaire.class,
        QuestionnaireResponse.class,
        Range.class,
        Ratio.class,
        Reference.class,
        RelatedArtifact.class,
        RelatedPerson.class,
        Request.class,
        RequestGroup.class,
        ResearchDefinition.class,
        ResearchElementDefinition.class,
        ResearchStudy.class,
        ResearchSubject.class,
        Resource.class,
        ResourceFactory.class,
        ResourceType.class,
        RiskAssessment.class,
        RiskEvidenceSynthesis.class,
        SampledData.class,
        Schedule.class,
        SearchParameter.class,
        ServiceRequest.class,
        SidType.class,
        Signature.class,
        SimpleQuantity.class,
        Slot.class,
        Specimen.class,
        SpecimenDefinition.class,
        StringType.class,
        StructureDefinition.class,
        StructureMap.class,
        Subscription.class,
        Substance.class,
        SubstanceAmount.class,
        SubstanceNucleicAcid.class,
        SubstancePolymer.class,
        SubstanceProtein.class,
        SubstanceReferenceInformation.class,
        SubstanceSourceMaterial.class,
        SubstanceSpecification.class,
        SupplyDelivery.class,
        SupplyRequest.class,
        Task.class,
        TerminologyCapabilities.class,
        TestReport.class,
        TestScript.class,
        TimeType.class,
        Timing.class,
        TriggerDefinition.class,
        Tuple.class,
        Type.class,
        TypeDetails.class,
        UnsignedIntType.class,
        UriType.class,
        UrlType.class,
        UsageContext.class,
        UuidType.class,
        ValueSet.class,
        VerificationResult.class,
        VisionPrescription.class

        //R4 model basic classes
        /*
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
         */
        })
public class ReflectionConfigurationR4Full {
}