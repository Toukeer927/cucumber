@sprint1
Feature: search for amazon and create account
@open
Scenario: search senario
Given User open chrome
Then Search for Amazon
Then user click on to login button


@SiginStepDefinition
Scenario: Check create account Scenario

Given User click on create account
Then user enter username
Then user enter mobile number
Then user enter optional Email
Then user enter password
And user click on the continue button