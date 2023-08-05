Feature: Eye-ware Login with valid credentials
  Scenario Outline: SignIn with valid credentials
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    Then Click on SignIn
    Then Enter Email-ID '<Email_Id>'
    Then Enter PassWord '<PassWord>'
    Then click on signIn button
    And Close the Browser


    Examples:
      | Email_Id              |  | PassWord  |
      | 17sonupatel@gmail.com |  | India1707 |
      | 1172nishant@gmail.com |  | India1707 |

