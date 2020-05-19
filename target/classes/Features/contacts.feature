Feature: Free CRM Contacts Feature

Scenario Outline: Free CRM Create New Contact

Given user is already on login page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on the login button
Then user is on the home page
Then user moves to new contact page
Then user fill contact details "<firstname>" and "<lastname>"
Then Close the browser

Examples:
	| username                     | password | firstname | lastname  |
	| ravikrishnameka11@gmail.com  | Ravi@11  | virender  | sehwag    |
	| ravikrishnameka11@gmail.com  | Ravi@11  | sachin    | tendulkar |
