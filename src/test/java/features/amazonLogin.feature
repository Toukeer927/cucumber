@AmazonTest

Feature: Registration form
@open


Scenario Outline: Test user Login with different credentials
    Given Open Chrome and navigate to Login page
    When valid "<username>" and "<password>" is entered
    Then User should be logged in successfully

Examples:
    | username   | password |
    | test@gmail.com| Demo@111 |
    