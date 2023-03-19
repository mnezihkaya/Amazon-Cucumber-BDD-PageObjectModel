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

  Scenario: User should see the submodule under all
    And user should click "Fire tablets"
    And User should see 5 menu submodules
    Then verify menu submodules
      | Fire Tablets        |
      | Content & Resources |

  Scenario: User should see the submodule under all
    And user should click "Fire TV"
    And User should see 6 menu submodules
    Then verify menu submodules
      | Amazon Fire Tv      |
      | Content & Resources |


  Scenario: User should see the submodule under all
    And user should click "Kindle E-readers & Books"
    And User should see 7 menu submodules
    Then verify menu submodules
      | Fire Kindle E-Readers          |
      | Kindle Store                   |
      | Fire Kindle E-Apps & Resources |


  Scenario: User should see the submodule under all
    And user should click "Audible Books & Originals"
    And User should see 8 menu submodules
    Then verify menu submodules
      | Audible Books & Originals |


  Scenario: User should see the submodule under all
    And user should click "Amazon Photos"
    And User should see 9 menu submodules
    Then verify menu submodules
      | Amazon Photos |
      | Amazon Prints |

  Scenario: User should see the submodule under all
    And user should click "Amazon Appstore"
    And User should see 10 menu submodules
    Then verify menu submodules
      | Amazon Appstore |

  Scenario: User should see the submodule under all
    And user should click "Clothing, Shoes, Jewelry & Watches"
    And User should see 11 menu submodules
    Then verify menu submodules
      | Amazon Clothing, Shoes, Jewelry & Watches |
      | More To Explore                           |

  Scenario: User should see the submodule under all
    And user should click "Clothing, Shoes, Jewelry & Watches"
    And User should see 12 menu submodules
    Then verify menu submodules
      | Amazon Fresh |

  Scenario: User should see the submodule under all
    And user should click "Books"
    And User should see 12 menu submodules
    Then verify menu submodules
      | Books                     |
      | Audible Books & Originals |
      | Kindle Books              |
      | More To Explore           |
      | Digital Downloads         |

  Scenario: User should see the submodule under all
    And user should click "Movies, Music & Games"
    And User should see 13 menu submodules
    Then verify menu submodules
      | Movies, Music & Games                    |






