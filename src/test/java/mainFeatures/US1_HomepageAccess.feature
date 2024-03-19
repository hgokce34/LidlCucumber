Feature: Lidl Homepage Access


  Scenario: Accessing the Lidl Homepage and Verifying the URL
    Given I am a web visitor
    When I navigate to the Lidl homepage
    Then I should be on "https://www.lidl.com/"
