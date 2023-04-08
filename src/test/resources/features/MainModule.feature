Feature: As a user, I should be able to click customerService

  Scenario Outline:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click "<module>"
    Then  verify title "<title>"
    Examples:
      | module           | title                                                     |
      | Amazon Basics    | Amazon.com: Amazon Basics                                 |
      | Customer Service | Help & Contact Us - Amazon Customer Service               |
      | Best Sellers     | Amazon.com Best Sellers: The most popular items on Amazon |
      | Prime            | Amazon.com: Amazon Prime                                  |
