# Spring Boot - Spring Data JPA Custom Finder Methods

## Project Overview
This project demonstrates the implementation of custom finder methods using Spring Data JPA in a Spring Boot application.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Project Structure
- **Entity:** Vaccine.java
- **Repository:** IVaccineRepo.java
- **Service:** IvaccineService.java, VaccineService.java
- **Main Application:** NareshSpringJpaRepositoryCustomFinderApplication.java

## Custom Finder Methods

The project demonstrates the following repository methods:

1. `findByCost()` - Find vaccines by exact cost.
2. `findByCostGreaterThanEqual()` - Find vaccines with cost greater than or equal to a given value.
3. `findByCostBetween()` - Find vaccines within a cost range.
4. `findByVaccineCompanyIs()` - Find vaccines by company name.
5. `findByVaccineNameInAndCostBetween()` - Find vaccines matching a collection of names within a specified cost range.

## Key Concepts
- JPA Entity Mapping
- Repository Layer
- Service Layer
- Dependency Injection
- Query Derivation
- Custom Finder Methods

## How to Run
1. Clone this repository.
2. Open the project in Spring Tool Suite or IntelliJ IDEA.
3. Configure your database connection.
4. Run the Spring Boot application.

## Author
Naresh