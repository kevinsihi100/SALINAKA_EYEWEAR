Feature: eye-wear shopping

  Background:
    Given open the Browser
    Then Enter the URL "https://salinaka-ecommerce.web.app/"
    And Close the Browser
  @signup
  Scenario Outline: signup
    Then Click on SignUp
    Then Enter Full Name '<Full_Name>'
    Then Enter Email-ID '<Email_Id>'
    Then Enter PassWord '<PassWord>'
    Then click on signUP button

    Examples:
      | Full_Name   |  | Email_Id              |  | PassWord  |
      | Nishant1172 |  | 17sonupatel@gmail.com |  | India1707 |

  @signIn
  Scenario: SignIn with valid credentials
    Then Click on SignIn
    Then Enter Email-ID '<Email_Id>'
    Then Enter PassWord '<PassWord>'
    Then click on signIn button

  @shop
  Scenario: search Item and check out
    Then click on Shop
    Then select some random Item from the eye-ware list
    Then select the eye-ware size
    Then select the eye-ware color
    Then click on add to basket option
    Then go to my basket option
    Then click on check out button
    Then click on next step
    And Enter the shopping details
    Then click on next
    Then click on payment method
    Then click on confirm Button
    And Close the Browser