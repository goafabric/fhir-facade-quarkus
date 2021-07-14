package org.goafabric.fhir.adapter.remote;

import org.goafabric.fhir.adapter.Person;
import org.goafabric.fhir.adapter.PersonServiceAdapter;

import java.util.List;

public class PersonServiceRemoteAdapter implements PersonServiceAdapter {
    @Override
    public Person getById(String id) {
        throw new UnsupportedOperationException("nop");
    }

    @Override
    public List<Person> findByFirstName(String firstName) {
        throw new UnsupportedOperationException("nop");
    }

    @Override
    public Person sayMyName(String name) {
        throw new UnsupportedOperationException("nop");
    }
}
