
@test
Feature: User should be able to login successfully
  Background:
    Given user is on home page

    Scenario: user Should log in successfully
    When user enters username and  password
      And user clicks on login button
    Then user should navigate to login page


  Scenario Outline:  user should not be able to login with invalid username and invalid password
    When user enters invalid  "<invalid Username>"
    And user enters  "<Invalid Password>"
    And  user clicks on login button
    Then User should not be able to login successfully and see "<related message>"

    Examples:
      | invalid Username | Invalid Password | related message          |
      | Admin            |                  | Password cannot be empty |
      | invalid          |                  | Password cannot be empty |
#      |                  | admin123         | Username cannot be empty |
#      |                  | invalid          | Username cannot be empty |
#      |                  |                  | Username cannot be empty |
#      | Admin            | wrong            | Invalid credentials      |
#      | wrong            | admin123         | Invalid credentials      |
#      | wrong            | wrong            | Invalid credentials      |
