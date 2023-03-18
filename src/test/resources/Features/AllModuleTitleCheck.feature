Feature: User Should see the all module and submodules

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click all_rightSubmodule

  Scenario: User should see the submodule under all
    And User should see 1 menu submodules
    Then verify menu submodules
      | Trending                  |
      | Digital Content & Devices |
      | Shop By Department        |
      | Programs & Features       |
      | Help & Settings           |

  Scenario: User should see the submodule under all
    And user should click "Prime Video"
    And User should see 2 menu submodules
    Then verify menu submodules
      | Prime Video     |
      | More To Explore |

  Scenario: User should see the submodule under all
    And user should click "Amazon Music"
    And User should see 3 menu submodules
    Then verify menu submodules
      | Stream Music |
      | Buy Music    |

  Scenario: User should see the submodule under all
    And user should click "Echo & Alexa"
    And User should see 4 menu submodules
    Then verify menu submodules
      | Echo & Alexa        |
      | Smart Home Devices  |
      | Content & Resources |
