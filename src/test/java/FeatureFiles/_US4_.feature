Feature:Adding products to the basket

  Scenario:Adding products to the basket
    Given Navigate to Website
    When Click women button
    Then  Click dresses button
    And Click summerDresses button
    When  Click dress button
    Then Click add
    And product should be displayed