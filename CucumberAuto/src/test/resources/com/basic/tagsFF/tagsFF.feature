@Important

Feature: Create account of Facebook12
As a user, I need to open Facebook page and do the validations

@Smoke
Scenario: Validate first name field1121
Given User needs to be on Facebook login page
When User enters user "Adarsh" first name
Then User checks user name "Adarsh" is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields2122
Given User needs to be on Facebook login page
When User enters user "Ruchi" first name
Then User checks user name "Ruchi" is present 
And User enters "1234" password
Then close browser

Scenario: Validate first name field3123
Given User needs to be on Facebook login page
When User enters user "Adarsh" first name
Then User checks user name "Adarsh" is present
Then close browser

@Regression
Scenario: Validate create user multiple fields4124
Given User needs to be on Facebook login page
When User enters user "Ruchi" first name
Then User checks user name "Ruchi" is present 
And User enters "1234" password
Then close browser

@Smoke
Scenario: Validate first name field5125
Given User needs to be on Facebook login page
When User enters user "Adarsh" first name
Then User checks user name "Adarsh" is present
Then close browser