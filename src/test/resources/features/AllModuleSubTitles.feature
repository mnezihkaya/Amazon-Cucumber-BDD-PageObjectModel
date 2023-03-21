Feature: As a user, I should be able to Search the product on the mainPage.

  Background:
    Given user should on mainPage
    And verify title "Amazon.com. Spend less. Smile more."
    When User click all_rightSubmodule

  Scenario: User Should see the submodule under all
    And user should see the all menu 1 subtitles of submodules
    Then verify menu subtitles expectedSubmodules
      | Best Sellers                       |
      | New Releases                       |
      | Movers & Shakers                   |
      | Prime Video                        |
      | Amazon Music                       |
      | Echo & Alexa                       |
      | Fire Tablets                       |
      | Fire TV                            |
      | Kindle E-readers & Books           |
      | Audible Books & Originals          |
      | Amazon Photos                      |
      | Amazon Appstore                    |
      | Clothing, Shoes, Jewelry & Watches |
      | Amazon Fresh                       |
      | Books                              |
      | Movies, Music & Games              |
      | Electronics                        |
      | Computers                          |
      | Smart Home                         |
      | Home, Garden & Tools               |
      | Pet Supplies                       |
      | Food & Grocery                     |
      | Beauty & Health                    |
      | Toys, Kids & Baby                  |
      | Handmade                           |
      | Sports                             |
      | Outdoors                           |
      | Automotive & Industrial            |
      | Industrial and Scientific          |
      | Whole Foods Market                 |
      | One Medical                        |
      | Pharmacy                           |
      | RxPass from Amazon Pharmacy        |
      | Clinic                             |
      | Amazon Physical Stores             |
      | Subscribe & Save                   |
      | Luxury Stores                      |
      | Make Money with Amazon             |
      | Home Services                      |
      | Gifting & Registry                 |
      | Gift Cards                         |
      | Credit & Payment Products          |
      | Shop By Interest                   |
      | Amazon Custom                      |
      | Amazon Outlet                      |
      | Amazon Subscription Boxes          |
      | Amazon Live                        |
      | International Shopping             |
      | Small & Medium Businesses          |
      | Climate Pledge Friendly            |
      | Amazon Second Chance               |
      | Your Account                       |
      | English                            |
      | United States                      |
      | Sign in                            |




