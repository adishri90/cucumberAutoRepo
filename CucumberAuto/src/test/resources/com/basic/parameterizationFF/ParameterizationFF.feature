Feature: Create account of Facebook10
As a user, I need to open Facebook page and do the validations

Scenario: Validate first name field101
Given User needs to be on Facebook login page
When User enters user "Adarsh" first name
Then User checks user name "Adarsh" is present
Then close browser

Scenario: Validate create user multiple fields102
Given User needs to be on Facebook login page
When User enters user "Ruchi" first name
Then User checks user name "Ruchi" is present 
And User enters "1234" password
Then close browser