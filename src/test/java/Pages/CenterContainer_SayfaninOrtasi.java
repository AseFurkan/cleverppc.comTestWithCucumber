package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CenterContainer_SayfaninOrtasi extends Parent {
    public CenterContainer_SayfaninOrtasi() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


















































    @FindBy(id = "id_contact")
    public WebElement subjectHeading;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "id_order")
    public WebElement orderReference;
    @FindBy(id = "message")
    public WebElement message;
    @FindBy(id = "submitMessage")
    public WebElement send;
    @FindBy(css = "[class*='success']")
    public WebElement success;
    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    public WebElement allDresses1;
    @FindBy(xpath = "(//a[@title='Add to cart'])[2]")
    public WebElement allDresses2;
    @FindBy(xpath = "(//a[@title='Add to cart'])[3]")
    public WebElement allDresses3;
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
    @FindBy(css = "[class='checker'] span")
    public WebElement iAgree;
    @FindBy(id = "paypal-standard-btn")
    public WebElement paypal;
    @FindBy(css = "[class='message']")
    public WebElement unSuccessMessage;
    @FindBy(name = "processAddress")
    public WebElement proceedToCheckout3;

}
