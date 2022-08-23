# Page Object model Test automation framework using Selenium with Java, TestNG and Maven
This is a sample project to demonstrate what is Selenium WebDriver Framework with Page Object Model with Page Factory design pattern. This framework is created with Selenium WebDriver (Java), Maven, TestNG, WebDriverManager, Extent Reports.

## Prerequisite software
- [Download & Install JDK](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Download & Install IntelliJ IDEA Community Version](https://www.jetbrains.com/idea/download/#section=windows)

## Create a new or open an existing Java(gradle) project
- [Please visit this link to know about how to open a new Java(gradle) project using IntelliJ IDEA](https://www.jetbrains.com/help/idea/getting-started-with-gradle.html#create_project)

## Setting the JAVA_HOME Variable in Windows
- [Setting the JAVA_HOME Variable in Windows](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)

## Dependencies
#### Gradle Dependencies - This framework has been designed with following maven dependencies as defined further in the build.gradle
| Dependency         | Version |  Purpose   |
|--------------------|---------|-----|
| Selenium WebDriver | 4.3.0   | It automates the testing of web application.    |
| TestNG             | 7.5     |  To run the tests as a suite.   |
| Webdrivermanager   |   5.2.2      |  WebDriverManager is a library which allows to automate the management of the drivers (e.g. chromedriver, geckodriver, etc.) required by Selenium WebDriver.   |
| Apache POI	        |      5.2.2   |  To read and write .xls excel files (e.g. test data files)   |
| Extent Reports	    | 2.41.2  | To genarate Enhanced html reports after test run.    |

## Test Classes
I have a test class named as "OrderCycleTest" under src/test/java/com/test where the following annotations are used:

@BeforeMethod-
- Setup the chromedriver binaries using below: WebDriverManager.chromedriver().setup();
- Initialize the WebDriver driver
- Maximize the browser the window
- Initizlize implicit page load timeout
- Launch base url

@DataProvider
- Pass values to the test methods as arguments using .xml file

@Test-
- Initialize the page objects.
- Validation steps by calling the page objects.

@AfterMethod
- Quit the WebDriver instance

# Test Scenarios
Here the following scenario is covered:
#### Scenario: Customer checkout a product as a registered user

- Given: Customer login to www.saucedemo.com
- When: Customer adds to cart a product by clicking on the "ADD TO CART" button
- And: Customer clicks on the add to cart icon on the top right corner of the home page
- Then: System navigates customer to checkout page
- And: Customer clicks on the "CHECKOUT" button
- Then: System navigates customer to information page
- And: Customer fills-out the information form
- Then: System navigates customer to checkout overview page
- And: Customer clicks on the "FINISH" button
- Then: System navigates customer to order complete confirmation page
- And: Customer clicks on the "BACK HOME" button
- Then: System navigates customer to home page

# Run Test Cases
To run the test cases, go to the desired package where all the test cases (java classes) are written and right click on
the desired java class and click on Run

# Helpful Resources
- [How To Create Gradle Project With Selenium](https://www.softwaretestinghelp.com/gradle-project-with-selenium/)
- [selenium.dev](https://www.selenium.dev/documentation/webdriver/)
- [TestNG](https://testng.org/doc/)
- [Selenium and TestNG](https://testng.org/doc/selenium.html#modeling)
- [Page Object Model (POM) With Page Factory](https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/)
