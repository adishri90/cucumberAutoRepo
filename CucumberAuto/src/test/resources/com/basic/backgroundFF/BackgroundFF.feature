Feature: Create account of Facebook1
As a user, I need to open Facebook page and do the validations

Background: common login steps
Given User needs to be on Facebook login page

Scenario: Validate first name field11
When User enters user first name
Then User checks user name is present
Then close browser

Scenario: Validate create user multiple fields12
When User enters user first name
Then User checks user name is present 
And User enters password
Then close browser