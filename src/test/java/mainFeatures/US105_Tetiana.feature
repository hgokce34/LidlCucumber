Feature:

  Scenario:
    Given I navigate to Lidl page
    And I close the cookies and green notification of choosing  a store
    Then I press sing in link
    And I enter a valid email and password
    |kris@gmail.com|
    |Qwerty123456@|
    And  I press sing in button
    And I press on my account and choose my account
    Then I press on account management link
    And  I choose delete account button
    And I should see the confirmation message of deleting account
    And I press delete button
    Then I should see the last confirmation notice about deleting account