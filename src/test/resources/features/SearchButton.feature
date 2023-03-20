Feature: As a user, I should be able to Search the product on the mainPage.

  Scenario Outline: verify user can use the search feature
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    And verify color change when hover on the searchButton
    When User click search area and write "<Search_Word>" and click submitButton
    Then verify title "<Title>"
    Examples:
      | Search_Word | Title                 |
      | selenium    | Amazon.com : selenium |
      | vitamin     | Amazon.com : vitamin  |
      | iphone      | Amazon.com : iphone   |
