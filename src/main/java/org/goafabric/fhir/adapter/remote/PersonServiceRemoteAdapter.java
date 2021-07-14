package org.goafabric.fhir.adapter.remote;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.goafabric.fhir.adapter.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class PersonServiceRemoteAdapter {
    @RestClient
    @Inject
    PersonServiceClient personServiceClient;

    public Person getById(String id) {
        return personServiceClient.getById(id);
    }

    public List<Person> findByFirstName(String firstName) {
        return personServiceClient.findByFirstName(firstName);
    }

    public Person sayMyName(String name) {
        return personServiceClient.sayMyName(name);
    }
}
