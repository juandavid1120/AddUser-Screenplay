Feature: Automation testing using Screenplay pattern.
    As an automation tester
    I need to practice automation testing using Screenplay patter
    for learn about serenity BDD framework

  Scenario Outline: Fill a user registration form using mandatory fields
    Given the user is on landing page of Tools QA
    When him browse to registration form
    And him has filled it and submitted
    |userRole|<userRole>|
    |employeName|<employeName>|
    |username|<username>|
    |status|<status>|
    |password|<password>|
    And browse the page and search for the user
    Then the user will see a registration information
Examples:
    |userRole|employeName|username|status|password|
    |Admin   |Alice Duval|Juancho240996|Enabled|Juancho1234!|

