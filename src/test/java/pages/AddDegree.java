package pages;

import abstractComponent.AbstractComponents;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDegree extends AbstractComponents {
    public WebDriver driver;
    @FindBy(xpath = "//input[@placeholder=\"type the name of your school, college, or university name\"]")
    public WebElement institution_nameText;
    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
    public WebElement degreeDropdown;
    @FindBy(xpath = "//input[@placeholder=\"Major or Concentration\"]")
    public WebElement majorGroupTextArea;
    @FindBy(xpath = "//*[@id=\":r3:\"]/li[8]")
    public WebElement mastersTXT;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/form/div[1]/div/div[2]/div/div[2]/div/div")
    public WebElement examDropDown;
    @FindBy(xpath = "//*[@id=\":r8:\"]/li[2]")
    WebElement examTEXT;
    @FindBy(css = "body > div.MuiDialog-root.MuiModal-root.css-qciayt > div.MuiDialog-container.MuiDialog-scrollBody.css-r7nd6y > div > form > div.MuiDialogContent-root.MuiDialogContent-dividers.css-1r09u4m > div > div:nth-child(5) > div > div > div > div > div")
    public WebElement resultDropdown;
    @FindBy(xpath = "//div//ul//li[text()=\"Pass\"]/.")
    public WebElement passTxt;
    @FindBy(xpath = "//div/em[text()=\"example: 2023 or 2025 (expected)\"]/.")
    public WebElement passingYearDropdownArrow;
    @FindBy(xpath = "//div/ul/li[text()=\"2030\"]")
    public WebElement dropdownPassingYear_Value;
    @FindBy(xpath = "//input[@placeholder=\"example: 1,2,3\"]")
    public WebElement durationInYearTextField;
    @FindBy(xpath = "//input[@placeholder=\"Your achievements\"]")
    public WebElement yourAchievementsTextArea;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement submitBtn;

    public AddDegree(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void add_Degree() {
        institution_nameText.sendKeys("AIUB");
        degreeDropdown.click();
        mastersTXT.click();
      /*  JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("arguments[0].scrollIntoView(true);", examDropDown)*/
        ;
        examDropDown.click();
        examTEXT.click();
        majorGroupTextArea.sendKeys("CSE");
        resultDropdown.click();
        waitForElementToAppearBy(passTxt); // wait until visible
        passTxt.click();
        passingYearDropdownArrow.click();
        dropdownPassingYear_Value.click();
        durationInYearTextField.sendKeys("5");
        waitForElementToAppearBy(yourAchievementsTextArea);
        yourAchievementsTextArea.sendKeys("Gold Medalist");


    }
}
