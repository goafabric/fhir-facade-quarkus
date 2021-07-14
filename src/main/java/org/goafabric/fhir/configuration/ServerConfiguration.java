package org.goafabric.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsConformanceProvider;
import ca.uhn.fhir.rest.server.IResourceProvider;
import io.quarkus.runtime.Startup;
import org.goafabric.fhir.service.BundleService;
import org.goafabric.fhir.service.PatientService;
import org.goafabric.fhir.service.PractitionerService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.CDI;
import javax.ws.rs.Path;
import java.util.concurrent.ConcurrentHashMap;

@Path(ServerConfiguration.ROOT_PATH) //needed for Metadata Endpoint
//@Produces({ MediaType.APPLICATION_JSON, Constants.CT_FHIR_JSON, Constants.CT_FHIR_XML })
@Startup
@ApplicationScoped
public class ServerConfiguration extends AbstractJaxRsConformanceProvider {
	private static final String SERVER_VERSION = "1.0.0";
	private static final String SERVER_DESCRIPTION = "FHIR Facade";
	private static final String SERVER_NAME = "FHIR Facade";

	public static final String ROOT_PATH = "/fhir";
	
	public ServerConfiguration() {
		super(FhirContext.forR4(), SERVER_DESCRIPTION, SERVER_NAME, SERVER_VERSION);
	}

	@Override
	protected ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider> getProviders() {
		ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider> map = new ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider>();
		map.put(ServerConfiguration.class, this);
		addProvider(map, PatientService.class);
		addProvider(map, PractitionerService.class);
		addProvider(map, BundleService.class);
		return map;
	}

	private void addProvider(ConcurrentHashMap<Class<? extends IResourceProvider>, IResourceProvider> map, Class clazz) {
		map.put(clazz, (IResourceProvider) CDI.current().select(clazz).get());
	}

	public String getBaseForServer() {
		return "/";
	}
}
