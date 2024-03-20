Feature: Lidl
  Background: Go to hp and login successfully
    Given i navigate to lidl homepage

  Scenario: Update My Account
    Then i click on signIn button on homepage
    Then I enter username and password
      | sarah@conner.com |
      | Sarah.C123       |
    Then i click on myAccount to edit my account
    And i enter to change my firstname and lastname
      | h  |
      | r |
    Then i click on save button
    And i should see and verify the updated message