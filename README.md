# Selenium Cucumber TestNG Automation Framework

## Overview
This project contains a basic Selenium automation framework developed using Java, Cucumber, and TestNG.  
It is intended to demonstrate how BDD-style automation tests can be structured using feature files and step definitions.

The framework was created as part of practice and can also be used for interview assignments or internal demonstrations.

## Technologies Used
- Java 11
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- ChromeDriver
- Git

## Project Structure
src
├── main
│ └── java
│
└── test
├── java
│ ├── stepdefinitions // Step definition classes
│ ├── runner // Cucumber TestNG runner
│ └── utils // Utility classes
│
└── resources
└── features // Feature files

## How to Run the Tests

### Prerequisites
- Java 11 should be installed and configured
- Maven should be available in the system path
- Google Chrome browser installed
- Matching ChromeDriver version

Run using TestNG
-----------------
Open the project in Eclipse or IntelliJ

Navigate to the TestRunner class

Right-click and select Run As → TestNG Test

Reports
---------------
Execution details can be seen in the console.
A basic Cucumber HTML report is generated in the following location: target/cucumber-report.html

Author
Bharath S
