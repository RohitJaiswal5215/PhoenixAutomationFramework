


Objective

The objective of this repository is to design and implement a comprehensive
 end-to-end software testing framework that covers UI Automation (Selenium + TestNG),
 API Automation (REST Assured), and BDD Testing (Cucumber with TestNG). 
This project demonstrates best practices in test design, reporting, and 
execution using modern tools like Maven, Extent Reports, and GitHub CI/CD.
 It also includes Performance and Security Test Plans to ensure scalability and 
robustness of the application under test. Together, these deliverables showcase a 
full-stack testing strategy aligned with industry standards for QA and software development lifecycle.



orangehrm-automation: UI Automation (Selenium + TestNG)
- Built with Java + Selenium WebDriver + TestNG + Maven.  
- Page Object Model (POM) for maintainability.  
- Automated key workflows:
  - Login UI  
  - Open Dashboard  
  - Add Emploee & List Employee
- Extent Reports integration for HTML reporting.  


restassured-testng: API Automation (REST Assured + TestNG)
- Automated employee API test suite.  
- Validated endpoints:
  - `GET /employees` → Verify status `200` & response structure.  
  - `POST /create` → Validate new employee creation.  
  - `PUT /update/{id}` → Ensure updates are applied correctly.  
  - `DELETE /delete/{id}` → Confirm deletion.  
- JSON Schema Validation.  
- Data-driven testing for multiple inputs.  
- Reports integrated with Extent Reports.  


employee-bdd-framework: Cucumber Framework (BDD + Selenium)
- Implemented BDD with Cucumber + Selenium + Maven.  
- Wrote feature files in Gherkin syntax covering:  
  - Login scenarios (valid/invalid credentials).  
  - Product browsing and selection.  
  - Checkout workflows.  
- Used Step Definitions + Hooks for reusability.  
- Generated Cucumber HTML & JSON reports.  



Tech Stack Used
- Languages: Java  
- Frameworks: Selenium, TestNG, REST Assured, Cucumber  
- Build Tool: Maven  
- Reporting: Extent Reports, TestNG Reports, Cucumber Reports  
- Other Tools: JMeter, OWASP ZAP, GitHub, Postman  



Setup & Execution Guide

This repository contains three independent testing projects:

Project1 – UI Automation (Selenium + TestNG)

Project2 – API Automation (REST Assured + TestNG)

Project3 – Cucumber Framework (BDD + Selenium + TestNG)

Each project is self-contained with its own pom.xml and dependencies. Follow the instructions below for setup and execution.

 1. Prerequisites

Before running the projects, ensure you have the following installed:

Java JDK 11+ → Download

Maven 3.8+ → Download

Git → Download

IDE (Spring Tool Suite / Eclipse / IntelliJ IDEA recommended)

Browser & Driver ( Chrome + ChromeDriver for Selenium tests)

Verify installations:

java -version
mvn -version
git --version

 2. Clone Repository

Clone the repository to your local machine:

git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>

3. Project Setup
🔹 Project1 – UI Automation (Selenium + TestNG)

Navigate to project folder:

cd Project1-UI-Automation


Install dependencies:

mvn clean install


Run tests with TestNG:

mvn test -DsuiteXmlFile=testng.xml

Reports generated at:

target/surefire-reports/
test-output/


🔹 Project2 – API Automation (REST Assured + TestNG)

Navigate to project folder:

cd Project2-API-Automation


Install dependencies:

mvn clean install

Run API test suite:

mvn test

Reports available at:

target/surefire-reports/


🔹 Project3 – Cucumber Framework (BDD + Selenium + TestNG)

Navigate to project folder:

cd Project3-Cucumber-Framework

Install dependencies:

mvn clean install

Run Cucumber features:

mvn test

Reports generated at:

target/cucumber-reports/
test-output/


 4. Additional Test Plans

Performance Testing → see PerformanceTestPlan.md

Security Testing → see SecurityTestPlan.md



Each project is independent and can be executed separately.

Use Extent Reports / Allure Reports (configured in respective projects) for detailed execution logs.

Update config.properties / drivers paths if running on a new environment.

