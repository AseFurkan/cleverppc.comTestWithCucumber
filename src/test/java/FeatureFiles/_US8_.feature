Feature:Sending an e-mail to the website team as a user

  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And User should login successfully
    And Click to dresses
    Then Add "3" random items to cart
    Then Verify that the products are in the cart
    When Click to Cart
    Then Click Checkout and select adress
    And Select shipment method and click agree button
    Then Click paypal and navigate to back when see warming
    Then Click credit card and navigate to back when see warming
    And Click bank wire and camparing price
    Then Click I confirm my order and successful


  @Contact @Support @Regression
  Scenario:ContactUs

    Then Click contactUs button
    And  Select Subject Heading
    And  Select Order Reference
    And  Select Product
    Then Upload image
    When  Enter the sentence "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim" in the message box
    Then Click Send button
    And Success message should be displayed

