@activity4
Feature: Login Test
Scenario: Testing login without examples
Given the user is on the home page
When user enters with username "admin" and with password "password"
And clicks submit Button
Then get confirmation message as "Welcome Back, Admin!" and confirms it
