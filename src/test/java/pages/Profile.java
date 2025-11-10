package pages;

import abstractComponent.AbstractComponents;
import org.apache.hc.core5.http.Header;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile extends AbstractComponents {
    @FindBy(xpath = "//input[@aria-invalid='false']")
    WebElement nameTextField;
    @FindBy(xpath ="//input[@id=\":r3:\"]")
    WebElement headTextField;
    public WebDriver driver;


    public Profile(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this
        );
    }

    public void updateProfile() {
        nameTextField.sendKeys(Keys.CONTROL, "a");
        nameTextField.sendKeys(Keys.BACK_SPACE);
        nameTextField.sendKeys("ROGER");
        headTextField.sendKeys(Keys.CONTROL, "a");
        headTextField.sendKeys(Keys.BACK_SPACE);
        headTextField.sendKeys("FEDERER");
    }


}



