@Payment
Feature: payment list of products
  As a user i want to pay the list of products in the car

  Background:
    Given i enter the URL "https://www.demoblaze.com/index.html"
    When i click to login button
    And i enter the username "YtestYtest"
    And i enter the password "testtest24"
    And i click login
    Then i verify that i connected successfully to my account with the message "Welcome YtestYtest"

    Given i click to phone button and i choose "Sony xperia z5"
    When i click to laptop and i choose "Sony vaio i7"
    And i click to monitor and i choose "ASUS Full HD"
    Then i click to cart button  verify that the three products are added successfully to the cart "Sony xperia z5" and "Sony vaio i7" and "ASUS Full HD"

  @DemoBlaze_Payment
  Scenario Outline: payment the product with data
    Given i click placeOrder button
    When i enter the name "<name>" the country "<country>" and the city "<city>"
    And i enter the cardNumber "<cardNumber>" the month "<month>" and the year "<year>"
    And i click purchase button
    Then i validate the payment with the message "Thank you for your purchase!" and i click OK


    Examples:
      | name     | country | city  | cardNumber | month | year |
      | X tester | Tunisia | Tunis | 0123456789 | June  | 2026 |









