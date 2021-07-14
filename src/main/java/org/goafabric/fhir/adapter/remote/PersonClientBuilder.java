package org.goafabric.fhir.adapter.remote;

import io.quarkus.runtime.Startup;
import lombok.SneakyThrows;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.goafabric.fhir.crossfunctional.BaseUrlBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
@Startup
public class PersonClientBuilder {
    private final ConcurrentHashMap<String, PersonServiceClient> clients = new ConcurrentHashMap<>();

    @Inject
    BaseUrlBean baseUrlBean;

    @ConfigProperty(name = "adapter.timeout")
    Long timeout;

    @SneakyThrows
    public PersonServiceClient getClient() {
        PersonServiceClient personServiceClient = clients.get(baseUrlBean.getUrl());
        if (personServiceClient == null) {
            personServiceClient = RestClientBuilder.newBuilder()
                    .connectTimeout(timeout, TimeUnit.MILLISECONDS)
                    .readTimeout(timeout, TimeUnit.MILLISECONDS)
                    .baseUri(new URI(baseUrlBean.getUrl())).build(PersonServiceClient.class);
            clients.put(baseUrlBean.getUrl(), personServiceClient);
        }
        return personServiceClient;
    }

}
