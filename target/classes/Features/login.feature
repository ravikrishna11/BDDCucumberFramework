Feature: Free CRM Login Feature

#With out examples keyword
#Scenario: Free CRM Login Test Scenario

#Given user is already on login page
#When title of the login page is Free CRM
# Then user enters "ravikrishnameka11@gmail.com" and "Ravi@11"
#Then user clicks on the login button
#Then user is on the home page


#With examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on the login button
Then user is on the home page
Then Close the browser

Examples:
	| username                     | password |
	| ravikrishnameka11@gmail.com  | Ravi@11  |
	| tom						   | tom123   |
