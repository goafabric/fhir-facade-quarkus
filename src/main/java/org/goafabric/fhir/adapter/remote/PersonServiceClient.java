package org.goafabric.fhir.adapter.remote;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.goafabric.fhir.adapter.Person;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
@RegisterClientHeaders(PersonServiceRemoteAdapterConfiguration.class)
public interface PersonServiceClient {
    @GET
    @Path("getById/{id}")
    Person getById(@PathParam("id") String id);

    @GET
    @Path("findAll")
    List<Person> findAll();

    @GET
    @Path("findByFirstName")
    List<Person> findByFirstName(@QueryParam("firstName") String firstName);

    @GET
    @Path("findByLastName")
    List<Person> findByLastName(@QueryParam("lastName") String lastName);

    @POST
    @Path("save")
    @Consumes(MediaType.APPLICATION_JSON)
    Person save(@Valid Person person);

    @GET
    @Path("sayMyName")
    Person sayMyName(@QueryParam("name") String name);

}
