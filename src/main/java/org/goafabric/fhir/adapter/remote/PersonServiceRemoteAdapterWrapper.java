package org.goafabric.fhir.adapter.remote;

import lombok.experimental.Delegate;
import org.goafabric.fhir.adapter.PersonServiceAdapter;

import javax.inject.Inject;

public class PersonServiceRemoteAdapterWrapper implements PersonServiceAdapter {
    @Inject
    @Delegate
    PersonServiceRemoteAdapter personServiceAdapter;
}
