package org.goafabric.fhir.service;

import io.quarkus.test.junit.QuarkusTest;
import org.goafabric.fhir.configuration.ServerConfiguration;
import org.junit.jupiter.api.Test;

import java.util.Base64;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PatientServiceTest {

    @Test
    public void getPatient() {
        given()
                .auth().basic(new String(Base64.getDecoder().decode("YWRtaW4=")), new String(Base64.getDecoder().decode("YWRtaW4=")))
                .when().get(ServerConfiguration.ROOT_PATH + "/Patient/1")
                .then()
                .statusCode(200);
    }


}