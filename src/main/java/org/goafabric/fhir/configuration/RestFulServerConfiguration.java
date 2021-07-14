/*
package org.goafabric.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.HardcodedServerAddressStrategy;
import ca.uhn.fhir.rest.server.RestfulServer;
import io.quarkus.runtime.Startup;
import org.goafabric.fhir.crossfunctional.TenantIdInterceptor;
import org.goafabric.fhir.service.PatientService;
import org.goafabric.fhir.service.PractitionerService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;

@ApplicationScoped
@Startup
public class RestFulServerConfiguration extends RestfulServer {
    @Inject
    PatientService patientService;

    @Inject
    PractitionerService practitionerService;

    @Override
    protected void initialize() throws ServletException {
        super.initialize();

        setFhirContext(FhirContext.forR4());
        setResourceProviders(patientService, practitionerService);
        setServerAddressStrategy(new HardcodedServerAddressStrategy("/fhir/*"));

        //registerInterceptor(new ExceptionHandler());
        registerInterceptor(new TenantIdInterceptor());
    }
}

 */
