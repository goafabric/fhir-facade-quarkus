package org.goafabric.fhir.adapter.remote;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;
import org.goafabric.fhir.crossfunctional.HttpInterceptor;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;
import java.util.Base64;

public class PersonServiceRemoteAdapterConfiguration implements ClientHeadersFactory {
    @ConfigProperty(name = "adapter.personservice.user")
    String user;

    @ConfigProperty(name = "adapter.personservice.password")
    String password;

    @Override
    public MultivaluedMap<String, String> update(MultivaluedMap<String, String> multivaluedMap, MultivaluedMap<String, String> multivaluedMap1) {
        final MultivaluedMap<String, String> result = new MultivaluedMapImpl<>();
        result.add("Authorization", "Basic " + Base64.getEncoder().encodeToString(
                (new String(Base64.getDecoder().decode(user)) + ":" + new String(Base64.getDecoder().decode(password))).getBytes()));
        result.add("X-TenantId", HttpInterceptor.getTenantId());
        result.add("X-Auth-Request-Preferred-Username", HttpInterceptor.getUserName());
        return result;
    }
}
