Feature:CreateAddress
  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And User should login successfully

  @Addresses @Regression
  Scenario: Add a new addres to the User Account
    And Click on the Sitemap
    Then Click on the Address
    And Click on the Add A New Adres button
    And Filling in mandatory information
    Then  Address should be added successfully
