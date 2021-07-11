#docker compose
go to /src/deploy/docker and do "./stack up"

#run native image
docker pull goafabric/fhir-facade-quarkus:1.0.0-SNAPSHOT && docker run --name calle-service-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus:1.0.0-SNAPSHOT

#run native image arm64
docker run --name calle-service-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus-arm64v8:1.0.0-SNAPSHOT
                                           
#build
mvn -B clean install -P docker-image-native,docker-image-native-arm64 && \
docker run --name calle-service-quarkus --rm -p50700:50700 goafabric/fhir-facade-quarkus-arm64v8:1.0.0-SNAPSHOT
