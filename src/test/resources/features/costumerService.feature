Feature: As a user, I should be able to click customerService

  Scenario:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click "Customer Service"
    Then  verify title "Help & Contact Us - Amazon Customer Service"