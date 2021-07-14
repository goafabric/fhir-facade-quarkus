package org.goafabric.fhir.adapter;

import lombok.SneakyThrows;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.goafabric.fhir.adapter.mock.PersonServiceMockAdapter;
import org.goafabric.fhir.adapter.remote.PersonServiceRemoteAdapter;
import org.goafabric.fhir.crossfunctional.BaseUrlBean;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;

public class PersonServiceAdapterConfiguration {

    @ConfigProperty(name = "profiles.active", defaultValue = "")
    String profilesActive;

    @ConfigProperty(name = "adapter.personservice.url")
    String baseUri;

    @ConfigProperty(name = "adapter.timeout")
    Long timeout;

    @ConfigProperty(name = "multi.tenancy.enabled", defaultValue = "false")
    Boolean multiTenancyEnabled;

    @Produces
    @ApplicationScoped
    @SneakyThrows
    public PersonServiceAdapter personServiceAdapter() {
        if ("mock".equals(profilesActive)) {
            return new PersonServiceMockAdapter();
        } else if ("remote".equals(profilesActive)) {
            return new PersonServiceRemoteAdapter(new BaseUrlBean(baseUri, multiTenancyEnabled));
        } else {
            throw new IllegalStateException("unknown profile");
        }
    }
}

