# Discount Calculation System

This project calculated discount on the given bill based on various rules. 

It also demonstrated how various Object Oriented Design Patterns are used and enumerated as following
  1) Strategy pattern is injecting various strategies of combinging discounting rules.
  2) Rules are abstracted with single interface so as combinging them parallely or serially as required.
  3) Single main class namely DiscountCalculator is used by external modules to calculate discount and entire web of logic is hidden      behind this main class.

## Class Diagram
Following diagram illustrated the class diagram of data model to hold bill, item details, customer details etc.

![GitHub Logo](/class-diagram-2.png)


Following diagram illustrated the class diagram of logical or service layer

![GitHub Logo](/class-diagram-1.png)


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
$ mvn clean package sonar:sonar
```
#### External Sonar Environment
```sh
$ mvn clean package -Dsonar.host.url=<url>
```
## Improvement Areas
1) Using xml for rules configuration and their execution
2) Developing and using a standard format for rules execution something on the likes of various rules engine
3) Integration and other test cases for edge scenarios

## Sonar Report

Given following is the project sonar report

![GitHub Logo](/sonar-report.png)

