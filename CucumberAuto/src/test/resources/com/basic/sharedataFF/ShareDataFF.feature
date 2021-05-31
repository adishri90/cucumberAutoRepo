Feature: Create account of Facebook11
As a user, I need to open Facebook page and do the validations

Scenario: Validate first name field111
Given User needs to be on Facebook login page
When User enters user "Adarsh" first name
Then User checks user name "Adarsh" is present

Scenario: Validate create user multiple fields112
Given User needs to be on Facebook login page
When User enters user "Ruchi" first name
Then User checks user name "Ruchi" is present 
And User enters "1234" password