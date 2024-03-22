Feature: User Login

  As a user, I should be able to log in to the web store to manage my account information,
  shopping, and access other features.

  Scenario: Successful login to the web store
    Given I am a web visitor
    When I navigate to the Lidl homepage
    Then I should be on "https://www.lidl.com/"
    When I click the "Sign In" button on the homepage
    And I enter my email "polya3hus@gmail.com" and password "LidlPassword123"
    And I click the "Sign In" button on the login page
    Then I should confirm that the login is successful
