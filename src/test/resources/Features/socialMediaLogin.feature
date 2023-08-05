Feature: Eye-ware Login with valid credentials
  Scenario: SignIn with socialMediaAccount
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    Then Click on SignIn
    Then click on continue with facebook
    Then click on continue with google
    Then click on continue with GitHub
    And Close the Browser