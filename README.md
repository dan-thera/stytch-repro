# stytch-repro
## Repro Steps
1. `mvn spring-boot:run` to run the server
2. Call the endpoint `<base-url>/test` with a JWT as the bearer token 
3. Check BE logs for error

Follow the instructions in `application.properties` to switch between the two different "methods" for setting up this authentication, neither of which are working.
