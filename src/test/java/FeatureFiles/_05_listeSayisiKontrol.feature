Feature:

  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And Click to dresses

  Scenario:us_5

    And  Kullanıcı, oluşan listenin üst kısımda yer alan Dresses There are X products. ifadesindeki X'in "5" olduğunu doğrulamalıdır.
    Then Kullanıcı, oluşan listenin alt kısımda yer alan  X'in "5" olduğunu doğrulamalıdır.
    And  Kullanıcı, listede yer alan ürünleri sayarak Satır sayısı, Resim  doğrulamalıdır