Feature: User Should see the all module and submodules

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click all_rightSubmodule

  Scenario: User should see the submodule under all menu1
    And User should see 1 menu submodules
    Then verify menu submodules
      | Trending                  |
      | Digital Content & Devices |
      | Shop By Department        |
      | Programs & Features       |
      | Help & Settings           |

  Scenario: User should see the submodule under all menu2
    And user should click "Prime Video"
    And User should see 2 menu submodules
    Then verify menu submodules
      | Prime Video     |
      | More To Explore |

  Scenario: User should see the submodule under all menu3
    And user should click "Amazon Music"
    And User should see 3 menu submodules
    Then verify menu submodules
      | Stream Music |
      | Buy Music    |

  Scenario: User should see the submodule under all menu4
    And user should click "Echo & Alexa"
    And User should see 4 menu submodules
    Then verify menu submodules
      | Echo & Alexa        |
      | Smart Home Devices  |
      | Content & Resources |

  Scenario: User should see the submodule under all menu5
    And user should click "Fire tablets"
    And User should see 5 menu submodules
    Then verify menu submodules
      | Fire Tablets        |
      | Content & Resources |

  Scenario: User should see the submodule under all menu6
    And user should click "Fire TV"
    And User should see 6 menu submodules
    Then verify menu submodules
      | Amazon Fire Tv      |
      | Content & Resources |


  Scenario: User should see the submodule under all menu7
    And user should click "Kindle E-readers & Books"
    And User should see 7 menu submodules
    Then verify menu submodules
      | Fire Kindle E-Readers          |
      | Kindle Store                   |
      | Fire Kindle E-Apps & Resources |


  Scenario: User should see the submodule under all menu8
    And user should click "Audible Books & Originals"
    And User should see 8 menu submodules
    Then verify menu submodules
      | Audible Books & Originals |


  Scenario: User should see the submodule under all menu9
    And user should click "Amazon Photos"
    And User should see 9 menu submodules
    Then verify menu submodules
      | Amazon Photos |
      | Amazon Prints |

  Scenario: User should see the submodule under all menu10
    And user should click "Amazon Appstore"
    And User should see 10 menu submodules
    Then verify menu submodules
      | Amazon Appstore |

  Scenario: User should see the submodule under all menu11
    And user should click "Clothing, Shoes, Jewelry & Watches"
    And User should see 11 menu submodules
    Then verify menu submodules
      | Amazon Clothing, Shoes, Jewelry & Watches |
      | More To Explore                           |

  Scenario: User should see the submodule under all menu12
    And user should click "Amazon Fresh"
    And User should see 12 menu submodules
    Then verify menu submodules
      | Amazon Fresh |

  Scenario: User should see the submodule under all menu13
    And user should click "Books"
    And User should see 13 menu submodules
    Then verify menu submodules
      | Books                     |
      | Audible Books & Originals |
      | Kindle Books              |
      | More To Explore           |
      | Digital Downloads         |

  Scenario: User should see the submodule under all menu14
    And user should click "Movies, Music & Games"
    And User should see 14 menu submodules
    Then verify menu submodules
      | Movies, Music & Games |

  Scenario: User should see the submodule under all menu15
    When user click the seeAll button to expand
    And user should click "Electronics"
    And User should see 15 menu submodules
    Then verify menu submodules
      | Electronics |

  Scenario: User should see the submodule under all menu16
    When user click the seeAll button to expand
    And user should click "Computers"
    And User should see 16 menu submodules
    Then verify menu submodules
      | Computers |

  Scenario: User should see the submodule under all menu17
    When user click the seeAll button to expand
    And user should click "Smart Home"
    And User should see 17 menu submodules
    Then verify menu submodules
      | Smart Home |

  Scenario: User should see the submodule under all menu18
    When user click the seeAll button to expand
    And user should click "Home, Garden & Tools"
    And User should see 18 menu submodules
    Then verify menu submodules
      | Home, Garden & Pets     |
      | Tools, Home Improvement |
      | More To Explore         |

  Scenario: User should see the submodule under all menu19
    When user click the seeAll button to expand
    And user should click "Pet Supplies"
    And User should see 19 menu submodules
    Then verify menu submodules
      | Pet Supplies |

  Scenario: User should see the submodule under all menu20
    When user click the seeAll button to expand
    And user should click "Food & Grocery"
    And User should see 20 menu submodules
    Then verify menu submodules
      | Grocery & Wine |

  Scenario: User should see the submodule under all menu21
    When user click the seeAll button to expand
    And user should click "Beauty & Health"
    And User should see 21 menu submodules
    Then verify menu submodules
      | Beauty, Health & Personal Care |
      | Deals & Prime Exclusives       |
      | Household, Health & Baby Care  |

  Scenario: User should see the submodule under all menu22
    When user click the seeAll button to expand
    And user should click "Toys, Kids & Baby"
    And User should see 22 menu submodules
    Then verify menu submodules
      | Toys, Kids & Baby |
      | Clothing & Shoes  |

  Scenario: User should see the submodule under all menu23
    When user click the seeAll button to expand
    And user should click "Handmade"
    And User should see 23 menu submodules
    Then verify menu submodules
      | Handmade        |
      | Featured Stores |

  Scenario: User should see the submodule under all menu24
    When user click the seeAll button to expand
    And user should click "Sports"
    And User should see 24 menu submodules
    Then verify menu submodules
      | Sports |

  Scenario: User should see the submodule under all menu25
    When user click the seeAll button to expand
    And user should click "Outdoors"
    And User should see 25 menu submodules
    Then verify menu submodules
      | Outdoors |

  Scenario: User should see the submodule under all menu26
    When user click the seeAll button to expand
    And user should click "Automotive & Industrial"
    And User should see 26 menu submodules
    Then verify menu submodules
      | Automotive              |
      | Industrial & Scientific |

  Scenario: User should see the submodule under all menu27
    When user click the seeAll button to expand
    And user should click "Industrial and Scientific"
    And User should see 27 menu submodules
    Then verify menu submodules
      | Industrial And Scientific |


  Scenario: User should see the submodule under all menu28
    And user should click "Whole Foods Market"
    And User should see 28 menu submodules
    Then verify menu submodules
      | Whole Foods Market |

  Scenario: User should see the submodule under all menu29
    And user should click "Pharmacy"
    And User should see 29 menu submodules
    Then verify menu submodules


  Scenario: User should see the submodule under all menu30
    When user click the seeAllProgramsAndFeatures button to expand
    And user should click "Clinic"
    And User should see 30 menu submodules
    Then verify menu submodules


  Scenario: User should see the submodule under all menu31
    When user click the seeAllProgramsAndFeatures button to expand
    And user should click "Amazon Physical Stores"
    And User should see 31 menu submodules
    Then verify menu submodules
      | Amazon Physical Stores |






