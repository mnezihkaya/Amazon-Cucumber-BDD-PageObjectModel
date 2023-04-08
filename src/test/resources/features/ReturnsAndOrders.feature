Feature: Returns and Orders button verification
  Scenario: Accessibility of the returns and orders button
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click ReturnsAndOrders and navigate sign in page
    Then verify title "Amazon Sign-In"