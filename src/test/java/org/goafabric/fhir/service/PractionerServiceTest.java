package org.goafabric.fhir.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PractionerServiceTest {

    @Test
    public void getPractitioner() {
        given()
          .when().get("/Practitioner/1")
          .then()
             .statusCode(200);
    }


}