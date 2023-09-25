package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class FooterContainer_SayfaninAlti  extends Parent{
    public FooterContainer_SayfaninAlti() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
