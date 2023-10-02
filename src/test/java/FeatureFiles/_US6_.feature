Feature:Control of products added to the basket

  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And User should login successfully

  @Products @Cart @Regression
  Scenario: Positive product control
    And Click to dresses
    Then Add "3" random items to cart
    And Verify that the products are in the cart