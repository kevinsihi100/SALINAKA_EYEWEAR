Feature: Eye-ware search_item
  Scenario: search Item and check out
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    Then click on Shop
    Then select some random Item from the eye-ware list
    Then select the eye-ware size
    Then select the eye-ware color
    Then click on add to basket option
    Then go to my basket option
    Then click on check out button
    And user need login to continue shopping
    Then click on next step
    And Enter the shopping details
    Then click on next
    Then click on payment method
    Then click on confirm Button
    And Close the Browser