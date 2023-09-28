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
    public List< WebElement> addToCart;
    @FindBy(css = "[class*='continue btn']")
    public  WebElement continueBtn;
    @FindBy(css = "[title='View my shopping cart']")
    public  WebElement cartBtn;
    @FindBy(css = "[class*='description'] [class*='name'] a")
    public  List<WebElement> checkoutProductName;

}
