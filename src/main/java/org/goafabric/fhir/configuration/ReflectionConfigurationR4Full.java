package org.goafabric.fhir.configuration;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.hl7.fhir.r4.model.*;

@RegisterForReflection(targets= {
        //Base classes
        ca.uhn.fhir.context.FhirVersionEnum.class,
        org.hl7.fhir.utilities.xhtml.XhtmlNode.class,

        //Parameter classes
        ca.uhn.fhir.rest.param.StringParam.class,

        //R4 Context classes
        org.hl7.fhir.r4.hapi.ctx.FhirR4.class,

        //R4 model classes
        /*
        Address.class,
        Attachment.class,
        BackboneElement.class,
        BackboneType.class,
        CodeableConcept.class,
        ContactPoint.class,
        DateType.class,
        Identifier.class,
        HumanName.class,
        Organization.class,
        Reference.class,
        Resource.class,
        StructureDefinition.class,
        Type.class
        */


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
        PaymentNotice.class,
        PaymentReconciliation.class,
        Period.class,
        Person.class,
        PlanDefinition.class,
        Population.class,
        PositiveIntType.class,
        Practitioner.class,
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
        })
public class ReflectionConfigurationR4Full {
}