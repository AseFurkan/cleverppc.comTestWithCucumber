package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CenterContainer extends Parent {
    public CenterContainer() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "id_contact")
    public WebElement subjectHeading;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(name = "id_order")
    public WebElement orderReference;
    @FindBy(name = "id_product")
    public WebElement productSelect;
    @FindBy(id = "message")
    public WebElement message;
    @FindBy(id = "submitMessage")
    public WebElement send;
    @FindBy(css = "[class*='success']")
    public WebElement success;
    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    public WebElement allDresses1;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShop;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement shoppingCart;
    @FindBy(css = "[class='right-block'] [class='product-name']")
    public List<WebElement> quickView;
    @FindBy(xpath = "//*[@title='Add to cart']")
    public List<WebElement> addToCart;
    @FindBy(css = "[class*='continue btn']")
    public WebElement continueBtn;
    @FindBy(css = "[title='View my shopping cart']")
    public WebElement cartBtn;
    @FindBy(css = "[class='cart_description'] a")
    public List<WebElement> checkoutProductName;
    @FindBy(css = "[ data-title='Quantity'] [class*='quantity_i']")
    public List<WebElement> quantity;
    @FindBy(css = "[title*='my addresses']")
    public WebElement adresses;
    @FindBy(css = "[title='Add an address']")
    public WebElement addAnAddress;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "postcode")
    public WebElement zip;
    @FindBy(id = "id_state")
    public WebElement state;
    @FindBy(id = "phone")
    public WebElement phone;
    @FindBy(id = "alias")
    public WebElement myAddress;

    @FindBy(id = "submitAddress")
    public WebElement saveBtn;
    @FindBy(css = "[class='addresses'] strong")
    public WebElement adressText;
    @FindBy(id = "button_order_cart")
    public WebElement checkOut;
    @FindBy(css = "[class*='navigation clearfix'] [title*='checkout']")
    public WebElement proceedToCheckout;
    @FindBy(name = "processAddress")
    public WebElement proceedToCheckout2;
    @FindBy(css = "[id='address_delivery'] [class*='firstname']")
    public WebElement adressControlText;
    @FindBy(css = "[id^='delivery']")
    public WebElement shipmentMethod;
    @FindBy(id = "uniform-cgv")
    public WebElement iAgree;
    @FindBy(id = "paypal-standard-btn")
    public WebElement paypal;
    @FindBy(css = "[class='message']")
    public WebElement unSuccessMessage;
    @FindBy(name = "processAddress")
    public WebElement proceedToCheckout3;
    @FindBy(css = "[class='heading-counter']")
    public WebElement productsCount;
    @FindBy(css = "[id*='_bottom']+[class*='count']")
    public WebElement productsCount2;
    @FindBy(css = "[title='Women']")
    public WebElement women;
    @FindBy(css = "[class='last']>span")
    public WebElement dresses;
    @FindBy(css = "[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    public WebElement summerDresses;
    @FindBy(xpath = "//a[@class='product-name']")
    public WebElement dress;
    @FindBy(xpath = "//button[@class='exclusive']//span")
    public WebElement add;
    @FindBy(xpath = "//span[@class='title']")
    public WebElement product;
    @FindBy(name = "processCarrier")
    public WebElement processCarrier;
    @FindBy(id = "ccbill-standard-btn")
    public WebElement creditcart;
    @FindBy(xpath = "//body[text()='Invalid request (1).']")
    public WebElement creditcartwarming;
    @FindBy(xpath = "(//div[@class='col-xs-12'])[1]")
    public WebElement PayBankWire;
    @FindBy(id = "total_price")
    public WebElement totalPrice;
    @FindBy(id = "amount")
    public WebElement amount;
    @FindBy(xpath = "//span[text()='I confirm my order']")
    public WebElement confirmbutton;
    @FindBy(css = "[class='alert alert-success']")
    public WebElement orderComplete;
    @FindBy(css = "[class='product-image-container']")
    public List<WebElement> images;
    /////
    @FindBy(css="[class='login']")
    public WebElement login;
    @FindBy(xpath="//input[@type='email'][1]")
    public WebElement loginEmail;
    @FindBy(id="uniform-id_gender1")
    public WebElement loginGender;

    @FindBy(css="[id='customer_firstname']")
    public WebElement customerfirstname;

    @FindBy(css="[id='customer_lastname']")
    public WebElement customerlastname;

    @FindBy(css="[id='passwd']")
    public WebElement passwd;

    @FindBy(css="[id='days']")
    public WebElement birthdays;

    @FindBy(css="[id='months']")
    public WebElement months;

    @FindBy(css="[id='years']")
    public WebElement years;

    @FindBy(css="[id='submitAccount']")
    public WebElement register;


    @FindBy(id = "email")
    public WebElement Email;
    @FindBy(id= "passwd")
    public WebElement Password;
    @FindBy(css = "[id='SubmitLogin']")
    public WebElement Sublogin;
    @FindBy(xpath= "(//*[text()='T-shirts'])[2]")
    public WebElement tshirts;
    @FindBy(css = "a[class='product-name']")
    public WebElement productname;
    @FindBy(css = "[title='Sitemap']")
    public WebElement sitemap;
    @FindBy(xpath = "//a[text()='My addresses']")
    public WebElement Myaddress;
    @FindBy(css = "[title='Add an address']")
    public WebElement Addaddress;
    @FindBy(css = "[id='company']")
    public WebElement company2;
    @FindBy(css = "[id='address1']")
    public WebElement address1;
    @FindBy(css = "[id='address2']")
    public WebElement address2;
    @FindBy(css = "[id='city']")
    public WebElement city;
    @FindBy(css = "option[value='32']")
    public WebElement state2;
    @FindBy(css = "[id='postcode']")
    public WebElement postcode;
    @FindBy(css = "[id='phone']")
    public WebElement phone2;
    @FindBy(css = "[id='phone_mobile']")
    public WebElement mobphone;
    @FindBy(css = "[id='alias']")
    public WebElement alias;
    @FindBy(css = "[id='submitAddress']")
    public WebElement subaddress;


}
