package org.goafabric.fhir.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsResourceProvider;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.api.MethodOutcome;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.goafabric.fhir.logic.BundleLogic;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.IdType;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path(BundleService.PATH)
@ApplicationScoped
public class BundleService extends AbstractJaxRsResourceProvider<Bundle> {
    static final String PATH = ServerConfiguration.ROOT_PATH + "/Bundle";

    @Inject
    BundleLogic bundleLogic;

    public BundleService() {
        super(FhirContext.forR4());
    }

    @Override
    public Class<Bundle> getResourceType() {
        return Bundle.class;
    }

    @Read
    public Bundle getBundle(@IdParam final IdType idType) {
        return bundleLogic.getBundle(idType);
    }

    @Create
    public MethodOutcome createBundle(@ResourceParam Bundle bundle) {
        return bundleLogic.createBundle(bundle);
    }
}
