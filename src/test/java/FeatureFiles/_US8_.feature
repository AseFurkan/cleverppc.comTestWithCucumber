Feature:
#  Scenario: https://cleverppc.com/prestashop4/
  Scenario:Sending an e-mail to the website team as a user

    When zNavigate to Website
    Then zClick contactUs button
    And zSelect Subject Heading
    And  zEnter email
