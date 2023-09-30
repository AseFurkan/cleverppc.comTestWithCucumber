Feature:User Login

  @Accounts @Smoke @Regression
  Scenario:Login
    When Navigate to Website
    Then Enter username and password and click login button
    When User should login successfully
