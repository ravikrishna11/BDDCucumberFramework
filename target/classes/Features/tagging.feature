@FunctionalTest
Feature: Free CRM Application

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create deals
Given This is a deal test case

@RegressionTest
Scenario: Create task
Given This is a task test case

@SmokeTest
Scenario: Create case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given clicking on left panel links

@SmokeTest @RegressionTest
Scenario: Search a deal
Given This is search deal test case

@SmokeTest
Scenario: Search a contact
Given This is search contact test case

@SmokeTest @RegressionTest
Scenario: Search a task
Given This is search task test case

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is search case test case

@SmokeTest @End2End
Scenario: Search a call
Given This is search call test case

@SmokeTest @End2End
Scenario: Search a email
Given This is search email test case

@SmokeTest @End2End
Scenario: Search a docs
Given This is search docs test case

@SmokeTest @End2End
Scenario: Search a forms
Given This is search forms test case

@End2End
Scenario: Validate a report
Given This is report test case

@End2End
Scenario: Application lagout
Given This is logout test case