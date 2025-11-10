package testrunner;

import config.Setup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ErrorValidation extends Setup {
    @Test
    public void errorValidationCheck() throws IOException {
        loginPage = launchApplication();
        loginPage.doclick();
        loginPage.doLogin("azharalamorin@gmail.com", "Abc@12345112");
        Assert.assertEquals("Invalid username or password.", loginPage.getErrorMessage());


    }

}
