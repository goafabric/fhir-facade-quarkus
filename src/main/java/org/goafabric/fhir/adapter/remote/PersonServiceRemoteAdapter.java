package org.goafabric.fhir.adapter.remote;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.goafabric.fhir.adapter.Person;
import org.goafabric.fhir.adapter.PersonServiceAdapter;
import org.goafabric.fhir.crossfunctional.BaseUrlBean;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
public class PersonServiceRemoteAdapter implements PersonServiceAdapter {
    final BaseUrlBean baseUrlBean;

    public Person getById(String id) {
        return getClient().getById(id);
    }

    public List<Person> findByFirstName(String firstName) {
        return getClient().findByFirstName(firstName);
    }

    public Person sayMyName(String name) {
        return getClient().sayMyName(name);
    }

    @SneakyThrows
    private PersonServiceClient getClient() {
        return RestClientBuilder.newBuilder()
                .baseUri(new URI(baseUrlBean.getUrl())).build(PersonServiceClient.class);
    }
}
