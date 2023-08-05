Feature: Eye-ware search_item using featured option
  Scenario: search Item using featured option
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    Then click on Featured option
    Then select random Item from the eye-ware list
    Then select the eye-ware size
    Then select the eye-ware color
    Then click on add to basket option
    And product on basket List
    Then remove from basket List
    And Close the Browser