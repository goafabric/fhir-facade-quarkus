package org.goafabric.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsConformanceProvider;
import ca.uhn.fhir.rest.api.Constants;
import ca.uhn.fhir.rest.server.IResourceProvider;
import io.quarkus.runtime.Startup;
import org.goafabric.fhir.service.PatientService;
import org.goafabric.fhir.service.PractitionerService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.ConcurrentHashMap;

@Path("")
@Produces({ MediaType.APPLICATION_JSON, Constants.CT_FHIR_JSON, Constants.CT_FHIR_XML })
@Startup
@ApplicationScoped
public class ServerConfiguration extends AbstractJaxRsConformanceProvider {
	private static final String SERVER_VERSION = "1.0.0";
	private static final String SERVER_DESCRIPTION = "FHIR Facade";
	private static final String SERVER_NAME = "FHIR Facade";
	
    @Inject PatientService patientService;
	@Inject PractitionerService practitionerService;

	public ServerConfiguration() {
		super(FhirContext.forR4(), SERVER_DESCRIPTION, SERVER_NAME, SERVER_VERSION);
	}

	@Override
	protected ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider> getProviders() {
		ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider> map = new ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider>();
		map.put(ServerConfiguration.class, this);
		map.put(PatientService.class, patientService);
		map.put(PractitionerService.class, practitionerService);
		return map;
	}

	public String getBaseForServer() {
		return "/";
	}
}
