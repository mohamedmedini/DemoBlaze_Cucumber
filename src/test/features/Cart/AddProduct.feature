@AddProduct
Feature: Add product to the cart
  As a user i want add product to the cart

  Background:
    Given i enter the URL "https://www.demoblaze.com/index.html"
    When i click to login button
    And i enter the username "YtestYtest"
    And i enter the password "testtest24"
    And i click login
    Then i verify that i connected successfully to my account with the message "Welcome YtestYtest"

  @DemoBlaze_Cart
  Scenario: Add product
    Given i click to phone button and i choose "Sony xperia z5"
    When i click to laptop and i choose "Sony vaio i7"
    And i click to monitor and i choose "ASUS Full HD"
    Then i click to cart button  verify that the three products are added successfully to the cart "Sony xperia z5" and "Sony vaio i7" and "ASUS Full HD"