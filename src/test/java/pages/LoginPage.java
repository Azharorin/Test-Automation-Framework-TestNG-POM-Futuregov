package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class LoginPage {

    WebDriver driver;
    //@FindBy(xpath="(//a[contains(text(),'Sign in')]")
    @FindBy(xpath = "/html/body/div[2]/div/div/header/div/div/div/button")
    WebElement btn;
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameTxt;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTxt;
    @FindBy(xpath = "//input[@name='login']")
    WebElement signinBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doclick() {
        btn.click();
    }

    public void doLogin(String email, String password) {
        usernameTxt.sendKeys(email);
        passwordTxt.sendKeys(password);
        signinBtn.click();

    }
}

