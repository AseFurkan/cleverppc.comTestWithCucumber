package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CenterColumn extends Parent {

    public CenterColumn() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
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
    public WebElement company;
    @FindBy(css = "[id='address1']")
    public WebElement address1;
    @FindBy(css = "[id='address2']")
    public WebElement address2;
    @FindBy(css = "[id='city']")
    public WebElement city;
    @FindBy(css = "option[value='32']")
    public WebElement state;
    @FindBy(css = "[id='postcode']")
    public WebElement postcode;
    @FindBy(css = "[id='phone']")
    public WebElement phone;
    @FindBy(css = "[id='phone_mobile']")
    public WebElement mobphone;
    @FindBy(css = "[id='alias']")
    public WebElement alias;
    @FindBy(css = "[id='submitAddress']")
    public WebElement subaddress;


}
