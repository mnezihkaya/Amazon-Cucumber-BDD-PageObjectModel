Feature: User Should see language options

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."

  Scenario:Learn  More module test
    When user hover over the language module
    And user Should see learnMore Link
    And  user should click learnMore Link
    Then verify title "About the Spanish Language Experience  - Amazon Customer Service"

  Scenario:Change country region Test
    When user hover over the language module
    And user Should see Change Country Region Link
    And  user should click Change Country Region Link
    Then verify title "Go to website"
    And select country "Turkey"


       #And User should see the two radio option
      #And User should see the message "You are shopping on Amazon.com"
      #And User should see the "Change country/region." link