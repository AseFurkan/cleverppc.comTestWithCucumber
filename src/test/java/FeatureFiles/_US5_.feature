Feature:Control of the number of products listed

  Background:
    When Navigate to Website

  @Products @Regression
  Scenario: Product List check
    When Click to dresses
    Then Check for a message at the top of the page for products count
    And Make sure the X in the expression is "5".
    And Check for a message at the bottom of the page for products count
    Then Verify there is "5" at the bottom
     And Count the number of products on the page and verify there are "5" products

