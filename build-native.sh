#!/bin/bash
git pull
time mvn -B clean install -P docker-image-native

docker pull goafabric/fhir-facade-quarkus:2.0.0-SNAPSHOT && docker run --name fhir-facade-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus:2.0.0-SNAPSHOT -Xm32m


