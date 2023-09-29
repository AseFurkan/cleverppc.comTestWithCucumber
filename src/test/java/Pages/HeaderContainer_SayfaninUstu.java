package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderContainer_SayfaninUstu  extends Parent{
    public HeaderContainer_SayfaninUstu() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id = "contact-link")
    public WebElement contactUs;









































    @FindBy(linkText = "Sign in")
    public WebElement signIn;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;
    @FindBy (xpath = "//span[text()='Team yedi']")
    public WebElement myAccount;
    @FindBy(xpath = "//a[@title='Dresses']")
    public WebElement dress;









}
