#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

	Scenario: Making an appointment without provide username and password
		Given I want to click Make Appointment button
    Then I click login button

  @tag1
  Scenario Outline: Making an appointment with correct username and password
    Given I want to click Make Appointment button
    Then I fill out the username input with value <username>
    And I fill out the password input with value <password>
    Then I click login button
    And I verify Make Appointment label

    Examples: 
      | username | password           | 
      | John Doe | ThisIsNotAPassword | 
