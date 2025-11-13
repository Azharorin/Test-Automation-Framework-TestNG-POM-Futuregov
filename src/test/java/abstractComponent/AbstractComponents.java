package abstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'My Profile')]\n")
    public WebElement linkText;//Edit deatils
    @FindBy(xpath = "//p[contains(text(),'Edit Details')]")
    public WebElement editDetailsLinkText;
    @FindBy(xpath = "//button//p[@class=\"MuiTypography-root MuiTypography-body2 css-18ri92r\"]")
    public WebElement addDegreeLinkText;

    public AbstractComponents(WebDriver driver) {
        this.driver = driver;

    }

    public void waitForElementToAppearBY(By findby) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
    }

    public void waitForElementToAppearBy(WebElement findBY) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(findBY));

    }

    public void click_Profile() {
        linkText.click();
        //edit deatils click
        //editDetailsLinkText.click();

    }

    public void add_DegreeInfo() {
        waitForElementToAppearBy(addDegreeLinkText); // wait until visible
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addDegreeLinkText);
        ///using javascript to click for the element click interceptable excpetion
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addDegreeLinkText);


    }


}


