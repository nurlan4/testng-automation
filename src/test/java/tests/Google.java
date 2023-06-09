package tests;

import org.junit.Assert;
import org.junit.Test;
import utilites.Driver;

public class Google {
    @Test
    public void google(){
        Driver.getDriver().get("https://www.google.com/");
        Driver.quit();
    }
}
