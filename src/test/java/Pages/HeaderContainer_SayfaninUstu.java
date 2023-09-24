package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class HeaderContainer_SayfaninUstu {
    public HeaderContainer_SayfaninUstu() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
