Feature: HelloSignIn module verification
  Scenario: Accessibility of HelloSignIn module
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click HelloSignIn module and navigate sign in page
    Then verify title "Amazon Sign-In"