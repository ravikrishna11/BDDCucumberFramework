Feature: Free CRM Company Feature

Scenario: Free CRM Create New Company

Given user is already on login page
When title of the login page is Free CRM
Then user enters username and password
| ravikrishnameka11@gmail.com | Ravi@11 |

Then user clicks on the login button
Then user is on the home page
Then user move to new company page
Then user filling company details cname and industry
| IBM | Software |
Then Close the browser