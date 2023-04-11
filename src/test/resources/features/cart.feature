Feature: Verify cart Logo was clickable
  Scenario: verify if cart logo work
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When user should click cart button
    Then verify title "Amazon.com Shopping Cart"