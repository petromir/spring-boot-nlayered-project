# Spring Boot project using N-layered architecture

## Environment
Java and Maven are managed by SDKMAN. To install the defined versions in `.sdkmanrc` file run the command:
```shell
sdk env install
```

## Database
### Migrations
Database changes are tracked and executed using a third-party tool - Flyway or Liquibase. Each of these tools solves 
this problem very well, so you don't have to implement in-house solution  
#### Definition
Database migrations are defined in their default place depending on the selected tool
#### Execution
The general concept is to execute the migrations before the application initialization when
deploying the service in the cloud.
Running database migrations on application startup has some drawbacks:
- The startup is slower to the point where schedulers like Kubernetes may kill them (pay attention to liveness vs. readiness probes)
- The application must run on a more privileged DB user supporting schema updates
- Other instances may be blocked until the first one completes migrations
- If you don't have redundancy, you get downtime during migration
  That being said, consider running migration automatically prior to deployment

```shell
docker run -e DB_USERNAME=root -e DB_PASSWORD=password -e DB_URL=jdbc:postgresql://db:5432/spring_boot_nlayered_service liquibase-migrations:0.0.2
```
#### Build
```shell
docker build -t liquibase-migrations:<tag_version> -f docker/db-migrations/Dockerfile.liquibase .
```

