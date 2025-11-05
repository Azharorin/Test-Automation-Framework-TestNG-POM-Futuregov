package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {
    @Test
    public void userLogin() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.doclick();
        loginpage.doLogin("azharalamorin@gmail.com", "Abc@12345");
        String headerprofile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).getText();
        String actualHeader = "My Profile";
        Assert.assertTrue(headerprofile.equals(actualHeader));

    }
}
