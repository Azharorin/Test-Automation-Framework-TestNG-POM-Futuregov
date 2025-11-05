package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.get("https://platform.futurenation.gov.bd/");
        // driver.get("https://idp.futurenation.gov.bd/auth/realms/future-nation-web/protocol/openid-connect/auth?client_id=future-nation&redirect_uri=https%3A%2F%2Fplatform.futurenation.gov.bd&response_type=code&scope=openid+profile+email&state=501ea0e6e0164306bba9d6010abdbef3&code_challenge=DYqSS7LvwxRugzrqcZdV-zJlp-5bhZAQTApr-3Atdcs&code_challenge_method=S256&response_mode=query");
    }

    @AfterTest
    public void closeDriver() {
        //driver.quit();
    }
}
