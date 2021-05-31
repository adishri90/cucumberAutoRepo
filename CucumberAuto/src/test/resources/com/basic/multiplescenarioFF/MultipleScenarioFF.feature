Feature: Create account of Facebook9
As a user, I need to open Facebook page and do the validations

Scenario: Validate first name field91
Given User needs to be on Facebook login page
When User enters user first name
Then User checks user name is present
Then close browser

Scenario: Validate create user multiple fields92
Given User needs to be on Facebook login page
When User enters user first name
Then User checks user name is present 
And User enters password
Then close browser