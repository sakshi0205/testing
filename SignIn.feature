Feature: AdminSignIn Page

Scenario: Invalid Email 
Given admin is on 'AdminSignIn' Page
When admin enters invalid Email
Then display 'Values cannot be empty' 

Scenario: Invalid Password
Given admin is on 'AdminSignIn' Page
When admin enters invalid Password
Then display 'Value cannot be empty' 

Scenario: Invalid Checkbox
Given admin is on 'AdminSignIn' Page
When admin enters invalid Checkbox
Then display 'This is not admin page'

Scenario: Valid Details
Given admin is on 'AdminSignIn' Page
When admin enters valid details
Then display 'AdminHome' Page
