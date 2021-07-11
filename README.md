#docker compose
go to /src/deploy/docker and do "./stack up"

#run native image
docker pull goafabric/fhir-facade-quarkus:1.0.8-SNAPSHOT && docker run --name calle-service-quarkus --rm -p50900:50900 goafabric/fhir-facade-quarkus:1.0.8-SNAPSHOT

#run native image arm64
docker run --name calle-service-quarkus --rm -p50900:50900 goafabric/fhir-facade-quarkus-arm64v8:1.0.8-SNAPSHOT

