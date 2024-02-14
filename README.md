# Spring Boot project using N-layered architecture

## Environment
Java and Maven are managed by SDKMAN. To install the defined versions in `.sdkmanrc` file run the command:
```shell
sdk env install
```

## Database
### Migrations
The general concept is to execute the migrations before the application initialization when 
deploying the service in the cloud.
Running database migrations on application startup has some drawbacks:  
- The startup is slower to the point where schedulers like #Kubernetes may kill them (pay attention to liveness vs. readiness probes)  
- The application must run on a more privileged DB user supporting schema updates  
- Other instances may be blocked until the first one completes migrations
- If you don't have redundancy, you get downtime during migration
That being said, consider running migration automatically prior to deployment
#### Definition
Depending on the selected tool for database migrations there are different folders to store them
- Flyway - 
- Liquibase - they are in the same directory as the changelog file
#### Execution
Database migrations
#### Build
```shell
docker build -t liquibase-migrations:<tag_version> -f docker/db-migrations/Dockerfile.liquibase .
```

