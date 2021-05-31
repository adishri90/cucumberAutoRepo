Feature: Create account of Facebook2
As a user, I need to open Facebook page and do the validations

Scenario Outline: Validate create user multiple fields21
Given User needs to be on Facebook login page
When User enters user "<user>" first name
Then User checks user name "<user>" is present 
And User enters "<password>" password
Then close browser
Examples:

|	user	   |	password	|
|	Adarsh	 |	1234	|
|	Ruchi	   |	4567	|