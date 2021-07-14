package org.goafabric.fhir.adapter.remote;

import org.goafabric.fhir.adapter.Person;
import org.goafabric.fhir.adapter.PersonServiceAdapter;

import javax.enterprise.inject.spi.CDI;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class PersonServiceRemoteAdapter implements PersonServiceAdapter {

    private final ConcurrentHashMap<String, PersonServiceClient> clients = new ConcurrentHashMap<>();

    public Person getById(String id) {
        return getClient().getById(id);
    }

    public List<Person> findByFirstName(String firstName) {
        return getClient().findByFirstName(firstName);
    }

    public Person sayMyName(String name) {
        return getClient().sayMyName(name);
    }

    private PersonServiceClient getClient() {
        return CDI.current().select(PersonClientBuilder.class).get().getClient();
    }

}
