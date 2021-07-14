/*
package org.goafabric.fhir.adapter;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.goafabric.fhir.adapter.mock.PersonServiceMockAdapter;
import org.goafabric.fhir.adapter.remote.PersonServiceRemoteAdapter;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;

public class PersonServiceAdapterConfiguration {

    @ConfigProperty(name = "profiles.active", defaultValue = "")
    String profilesActive;

    @Produces
    @ApplicationScoped
    public PersonServiceAdapter personServiceAdapter() {
        System.out.println(profilesActive);
        if ("mock".equals(profilesActive)) {
            return new PersonServiceMockAdapter();
        } else if ("remote".equals(profilesActive)) {
            return new PersonServiceRemoteAdapter(
                    null);
                    //RestClientBuilder.newBuilder().build(PersonServiceClient.class));
            //return new PersonServiceRemoteAdapterWrapper();
        } else {
            throw new IllegalStateException("unknown profile");
        }
    }
}

 */
