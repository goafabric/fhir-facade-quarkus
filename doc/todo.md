#Todo

Caused by: com.oracle.graal.pointsto.constraints.UnsupportedFeatureException: com.oracle.graal.pointsto.constraints.UnresolvedElementException: Discovered unresolved type during parsing: org.apache.jena.riot.Lang. To diagnose the issue you can use the --allow-incomplete-classpath option. The missing type is then reported at run time when it is accessed the first time.
Detailed message:
Trace:
at parsing ca.uhn.fhir.context.FhirContext.newRDFParser(FhirContext.java:642)
Call path from entry point to ca.uhn.fhir.context.FhirContext.newRDFParser():
at ca.uhn.fhir.context.FhirContext.newRDFParser(FhirContext.java:642)