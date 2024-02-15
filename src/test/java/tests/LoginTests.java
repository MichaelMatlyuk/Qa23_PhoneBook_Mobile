package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class LoginTests extends AppiumConfig {
    @Test
    public void loginSuccess(){
       boolean result = new SplashScreen(driver)
                .checkCurrentVersion("Version 1.0.0")
                .fillEmail("misha123@gmail.com")
                .fillPassword("Polaris@!090300")
                .submitLogin()
                .isContactListDisplay("Contact list");
        Assert.assertTrue(result);
    }
}
