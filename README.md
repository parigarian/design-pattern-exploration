# Discount System

This project calculated discount on the given bill based on various rules. 
It also demonstrated how various Object Oriented Design Patterns in configuring various rules using strate

## Class Diagram
Following diagram illustrated the class diagram of data model to hold bill, item details, customer details etc.
![GitHub Logo](/class-diagram-2.png)
Format: ![Alt Text](url)

Following diagram illustrated the class diagram of logical or service layer
![GitHub Logo](/class-diagram-1.png)
Format: ![Alt Text](url)

## Requirement
  - JDK 1.8
  - Apache Maven 3.x
  - SonarQube

## Technologies
- Java 8
- JUnit

## Code & Tests Coverage
The project comes with JaCoCo plugin to use with Sonar integration that enables it to cover code as well as tests via a valid SonarQube installation. 

### Setting it up

#### Running tests
```sh
$ mvn clean test
```
#### Local Sonar Environment
```sh
$ mvn clean install sonar:sonar
```
#### External Sonar Environment
```sh
$ mvn clean install -Dsonar.host.url=<url>
```
