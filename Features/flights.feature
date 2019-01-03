@SampleFeature
Feature: User registration to reserve flights 
A a site visitor 
I want to go to registration page ,and my personal information, and 
@SampleFeatureScenario1
Scenario: Register a user successfully 

Given as a user I am in registration page
When I enter first name. last name. user id. password. and confirm password 
And I click on submit button 
Then I recived a user registration confirmation 