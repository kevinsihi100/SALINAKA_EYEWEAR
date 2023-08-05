Feature: Eye-ware Login/Register with valid credentials
  Scenario Outline: SignUp with valid credentials
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    Then Click on SignUp
    Then Enter Full Name '<Full_Name>'
    Then Enter Email-ID '<Email_Id>'
    Then Enter PassWord '<PassWord>'
    Then click on signUP button
    And Close the Browser


    Examples:
      | Full_Name   |  | Email_Id              |  | PassWord  |
      | Nishant1172 |  | 17sonupatel@gmail.com |  | India1707 |

