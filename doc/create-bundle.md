POST
http://localhost:50700/fhir/Bundle/

Content-Type
application/json

Body
{
"resourceType": "Bundle",
"entry": [
{
"fullUrl": "Patient/1",
"resource": {
"resourceType": "Patient",
"id": "1",
"name": [
{
"family": "Simpson",
"given": [
"Homer"
]
}
]
}
},
{
"fullUrl": "Practitioner/1",
"resource": {
"resourceType": "Practitioner",
"id": "1",
"name": [
{
"family": "Burns",
"given": [
"Monty"
]
}
]
}
}
]
}