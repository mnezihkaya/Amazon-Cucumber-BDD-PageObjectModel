Feature: User Should see language options

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When user hover over the language module

  Scenario:Learn  More module test
    And user Should see learnMore Link
    And  user should click learnMore Link
    Then verify title "About the Spanish Language Experience  - Amazon Customer Service"

  Scenario:Change country region Test
    And user Should see Change Country Region Link
    And  user should click Change Country Region Link
    Then verify title "Go to website"
    And select country "Turkey (Türkiye)"
    Then Verify country selected "Turkey (Türkiye)"


  #   Scenario Outline: User should see the message "You are shopping on Amazon.com"
  #   When the language is "<language>" user should see "<message>"
  #   And user should see Amazon.com
  #   Examples:
  #  | message             | language |
  #  | You are shopping on | English  |
  #  | Estás comprando en  | español  |


