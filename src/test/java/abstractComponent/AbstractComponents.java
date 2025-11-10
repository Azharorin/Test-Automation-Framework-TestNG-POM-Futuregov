package abstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'My Profile')]\n")
    public WebElement linkText;
    @FindBy(xpath="//p[contains(text(),'Edit Details')]")
    public WebElement editDetailsLinkText;

    public AbstractComponents(WebDriver driver) {
        this.driver= driver;

    }

    public void waitForElementToAppearBY(By findby){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
        }

        public void waitForElementToAppearBy(WebElement findBY){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBY));

        }

        public void click_Profile(){
        linkText.click();
        editDetailsLinkText.click();

        }

}


