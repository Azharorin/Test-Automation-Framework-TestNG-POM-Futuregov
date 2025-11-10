package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Profile;

import java.io.IOException;

public class TestRunner extends Setup {
    @Test
    public void userLogin() throws IOException {
        loginPage = launchApplication();

        Profile profile = loginPage.doLogin("azharalamorin@gmail.com", "Abc@12345");
        String headerprofile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).getText();
        String actualHeader = "My Profile";
        Assert.assertTrue(headerprofile.equals(actualHeader));
        profile.click_Profile();
        profile.updateProfile();


    }
}
