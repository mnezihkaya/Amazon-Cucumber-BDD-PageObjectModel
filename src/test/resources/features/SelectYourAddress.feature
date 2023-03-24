Feature: UserShould see the Select your address Module

  Scenario: User Should check the functionality of the module
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When user should click Select your address module
    And enter zipcode and submit apply button.
      | 19460 |
    And click Change button
