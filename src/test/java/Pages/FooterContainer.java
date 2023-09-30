package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterContainer extends Parent{
    public FooterContainer() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
    @FindBy(linkText = "Sitemap")
    public WebElement siteMap;



}
