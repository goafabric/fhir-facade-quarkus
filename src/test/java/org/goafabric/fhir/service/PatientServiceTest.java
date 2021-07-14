package org.goafabric.fhir.service;

import io.quarkus.test.junit.QuarkusTest;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PatientServiceTest {

    @Test
    public void getPatient() {
        given()
          .when().get(ServerConfiguration.ROOT_PATH + "/Patient/1")
          .then()
             .statusCode(200);
    }


}