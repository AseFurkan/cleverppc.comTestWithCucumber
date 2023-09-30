Feature:Order and Payment

  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And User should login successfully
    And Click to dresses
    Then Add "3" random items to cart
    Then Verify that the products are in the cart

  @Products @Checkout @Payment @Smoke @Regression
  Scenario:Order and Payment

    When Click to Cart
    Then Click Checkout and select adress
    And Select shipment method and click agree button
    Then Click paypal and navigate to back when see warming
    Then Click credit card and navigate to back when see warming
    And Click bank wire and camparing price
    Then Click I confirm my order and successful