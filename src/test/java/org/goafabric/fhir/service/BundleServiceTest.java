package org.goafabric.fhir.service;

import io.quarkus.test.junit.QuarkusTest;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class BundleServiceTest {

    @Test
    public void getBundle() {
        given()
          .when().get(ServerConfiguration.ROOT_PATH + "/Bundle/1")
          .then()
             .statusCode(200);
    }


}