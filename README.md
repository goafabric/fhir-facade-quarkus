#docker compose
go to /src/deploy/docker and do "./stack up"

#run native image
docker pull goafabric/fhir-facade-quarkus:2.0.1-SNAPSHOT && docker run --name fhir-facade-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus:2.0.1-SNAPSHOT

#run native image arm64
docker pull goafabric/fhir-facade-quarkus-arm64v8:2.0.1-SNAPSHOT && docker run --name fhir-facade-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus-arm64v8:2.0.1-SNAPSHOT
                                           
#build
mvn -B clean install -P docker-image-native,docker-image-native-arm64 && \
docker run --name fhir-facade-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus-arm64v8:2.0.1-SNAPSHOT
