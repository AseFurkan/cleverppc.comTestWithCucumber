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

    @FindBy (css = "[title='Women']")
    public WebElement women;

    @FindBy (css = "[class='last']>span")
    public WebElement dresses;

    @FindBy(css= "[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    public WebElement summerDresses;

    @FindBy (xpath= "//a[@class='product-name']")
    public WebElement dress;

    @FindBy (xpath = "//button[@class='exclusive']//span")
    public WebElement add;

    @FindBy (xpath = "//span[@class='title']")
    public WebElement product;
}
