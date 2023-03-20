Feature: As a user, I should be able to Search the product on the mainPage.

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."

  Scenario Outline: verify user can see the color change feature
    And verify color change when hover on the searchButton "<beforeColor>" and "<afterColor>"

    Examples:
      | beforeColor | afterColor |
      | #febd69     | #f3a847    |

  Scenario Outline: verify user can use the search feature
    When User click search area and write "<Search_Word>" and click submitButton
    Then verify title "<Title>"

    Examples:
      | Search_Word | Title                 |
      | selenium    | Amazon.com : selenium |
      | vitamin     | Amazon.com : vitamin  |
      | iphone      | Amazon.com : iphone   |


