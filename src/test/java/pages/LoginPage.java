package pages;

import abstractComponent.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponents {

    public WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/div/div/header/div/div/div/button")
    WebElement btn;
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameTxt;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTxt;
    @FindBy(xpath = "//input[@name='login']")
    WebElement signinBtn;
     @FindBy(xpath="//*[@id=\"input-error\"]")
    public WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doclick() {
        btn.click();
    }

    public Profile doLogin(String email, String password) {
        usernameTxt.sendKeys(email);
        passwordTxt.sendKeys(password);
        signinBtn.click();
        Profile profile = new Profile(driver);
        return profile;

    }

    public void goTo() {
        driver.get("https://platform.futurenation.gov.bd/");
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}

