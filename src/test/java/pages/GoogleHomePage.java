package pages;

import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class GoogleHomePage {
    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
