package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterContainer_SayfaninAlti  extends Parent{
    public FooterContainer_SayfaninAlti() {
        PageFactory.initElements(GWD.getDriver(), this);

    }



















    @FindBy(linkText = "Sitemap")
    public WebElement siteMap;



}
