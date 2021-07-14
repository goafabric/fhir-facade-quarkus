package org.goafabric.fhir.adapter.remote;

import lombok.RequiredArgsConstructor;
import org.goafabric.fhir.adapter.Person;
import org.goafabric.fhir.adapter.PersonServiceAdapter;

import java.util.List;

@RequiredArgsConstructor
public class PersonServiceRemoteAdapter implements PersonServiceAdapter {
    final PersonServiceClient personServiceClient;

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
