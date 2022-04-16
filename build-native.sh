#!/bin/bash
git pull
time mvn -B clean install -P docker-image-native

docker pull goafabric/fhir-facade-quarkus:1.1.1 && docker run --name fhir-facade-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus:1.1.1 -Xm32m


