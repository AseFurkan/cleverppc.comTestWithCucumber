Feature:
# AC07_Checkout
#          1. Kullanıcı, "US06_AddToCart" adlı Test Case'de belirtilen adımları tamamlamış olmalıdır (Sepette ürün olmalıdır / Önkoşul).
#          2. Alışveriş sepeti simgesine (Cart) tıklanabilmelidir.
#          3. "Checkout" butonuna tıklanabilmelidir.
#          4. "US03_AddAddr" adlı hikaye'de oluşturulan adres seçilebilmelidir. (Eğer hesaba ait bir adres yoksa, "US03_AddAddr" adlı hikaye'de belirtilen adımları uygulamak gereklidir).
#          5. Shipment method varsayılan olarak seçili olmalı ve Kullanım Şartları Sözleşmesi kabul edilmelidir ("I Agree...").
#          6. "Proceed to checkout" butonuna tıklanabilmelidir.
#          7. "PayPal ile ödeme" butonuna tıklanmalıdır ve "Şu anda bir şeylerin yolunda gitmediği görülüyor. Lütfen daha sonra tekrar deneyin." olumsuz mesajı doğrulanmalıdır.
#          8. Geri gidilmeli (NavigateTo.back), "Kredi Kartı ile ödeme" butonuna tıklanmalı ve "Invalid request (1)." olumsuz mesajı doğrulanmalıdır.
#          9. Geri gidilmeli (NavigateTo.back), "Banka Havalesi ile ödeme" butonuna tıklanabilmelidir.
#          10. Mesaj kısmında gösterilen tutarın, vergi dahil ürünlerin tutarı ve kargo tutarının toplamına eşit olduğu doğrulanmalıdır.
#          11. "I confirm my order" butonuna tıklanabilmelidir.
#          12. Ödeme onaylanmalı ve "Your order on Xu Clothing is complete." mesajı ile ödemenin gerçekleştiği doğrulanmalıdır.
#          13. Çıkan Mesajdaki sipariş numarası kaydedilebilmelidir.
  Background:
    When Navigate to Website
    Then Enter username and password and click login button
    And Click to dresses
    Then kullanici rastgele urun secsin
    Then urunlerin sepette oldugunu dogrula

  Scenario:us-7
    When sepete git
    Then Click Checkout and select adress
    And Select shipment method and click agree button
    Then Click paypal and navigate to back when see warming
    Then Click credit card and navigate to back when see warming
    And Click bank wire and camparing price
    Then Click I confirm my order and successful

