package org.goafabric.fhir.service;

import io.quarkus.test.junit.QuarkusTest;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.junit.jupiter.api.Test;

import java.util.Base64;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PractionerServiceTest {

    @Test
    public void getPractitioner() {
        given()
                .auth().basic(new String(Base64.getDecoder().decode("YWRtaW4=")), new String(Base64.getDecoder().decode("YWRtaW4=")))
                .when().get(ServerConfiguration.ROOT_PATH + "/Practitioner/1")
                .then()
                .statusCode(200);
    }


}