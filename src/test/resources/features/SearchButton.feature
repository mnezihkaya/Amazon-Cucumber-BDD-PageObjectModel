Feature: As a user, I should be able to Search the product on the mainPage.

  Scenario: verify user can use the search feature
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click search area and write "selenium" and click submitButton
    Then verify title "Amazon.com : selenium"
