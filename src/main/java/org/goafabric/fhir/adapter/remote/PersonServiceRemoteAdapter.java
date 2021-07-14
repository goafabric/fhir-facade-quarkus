package org.goafabric.fhir.adapter.remote;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.goafabric.fhir.adapter.Person;
import org.goafabric.fhir.adapter.PersonServiceAdapter;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
public class PersonServiceRemoteAdapter implements PersonServiceAdapter {
    @Inject
    @RestClient
    PersonServiceClient personServiceClient;

    @Override
    public Person getById(String id) {
        return personServiceClient.getById(id);
    }

    @Override
    public List<Person> findByFirstName(String firstName) {
        return personServiceClient.findByFirstName(firstName);
    }

    @Override
    public Person sayMyName(String name) {
        return personServiceClient.sayMyName(name);
    }
}
