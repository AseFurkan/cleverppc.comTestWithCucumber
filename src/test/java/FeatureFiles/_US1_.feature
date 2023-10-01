Feature:User Recording

  @Accounts @Smoke @Regression
  Scenario: Sign in scenario

    Given I am on the homepage
    When I click on Sign in button
    Then i should see Create an Account section

