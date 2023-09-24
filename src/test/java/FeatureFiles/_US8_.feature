Feature:Sending an e-mail to the website team as a user

  @Contact @Support @Regression
  Scenario:Sending an e-mail to the website team as a user
    When Navigate to Website
    Then Click contactUs button
    And  Select Subject Heading
    Then Enter e-mail as "team7@gmail.com" in the input
    And  Enter order reference  as "mehmet"
    Then Upload image
    When  Enter the sentence "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim" in the message box
    Then Click Send button
    And Success message should be displayed

