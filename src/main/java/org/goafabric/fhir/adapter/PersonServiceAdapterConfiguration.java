package org.goafabric.fhir.adapter;

import lombok.SneakyThrows;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.goafabric.fhir.adapter.mock.PersonServiceMockAdapter;
import org.goafabric.fhir.adapter.remote.PersonServiceClient;
import org.goafabric.fhir.adapter.remote.PersonServiceRemoteAdapter;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;
import java.net.URI;

public class PersonServiceAdapterConfiguration {

    @ConfigProperty(name = "profiles.active", defaultValue = "")
    String profilesActive;

    @ConfigProperty(name = "adapter.personservice.url")
    String baseUri;

    @Produces
    @ApplicationScoped
    @SneakyThrows
    public PersonServiceAdapter personServiceAdapter() {
        System.out.println(profilesActive);
        if ("mock".equals(profilesActive)) {
            return new PersonServiceMockAdapter();
        } else if ("remote".equals(profilesActive)) {
            return new PersonServiceRemoteAdapter(
                    RestClientBuilder.newBuilder().baseUri(new URI(baseUri)).build(PersonServiceClient.class));
            //return new PersonServiceRemoteAdapterWrapper();
        } else {
            throw new IllegalStateException("unknown profile");
        }
    }
}

