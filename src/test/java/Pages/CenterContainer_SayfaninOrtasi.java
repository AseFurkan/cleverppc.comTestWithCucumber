package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CenterContainer_SayfaninOrtasi   extends Parent{
    public CenterContainer_SayfaninOrtasi() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id = "id_contact")
    public WebElement subjectHeading;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "id_order")
    public WebElement orderReference;
    @FindBy(id ="message")
    public WebElement message;
    @FindBy(id = "submitMessage")
    public WebElement send;
    @FindBy(css = "[class*='success']")
    public WebElement success;
}
