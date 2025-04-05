@owner:Allahrakha-Shaikh
@Regression
@InputScreen
Feature: Input Feature
  This feature is having scenarios to test the AgriChain Input Page

  Background:
    Given User is on the Input Page

  @HM_01 @Regression @Sanity
  Scenario Outline: Verify the output while user enter valid input
    When  User enter valid input as "<validInput>"
    And   User Click on the Submit Button
    Then  Verify user should able to navigate to the output page
    Then  Valid output should be shown
    Examples:
      |validInput         |
      |         abcabwe   |
      |         eeeee     |
