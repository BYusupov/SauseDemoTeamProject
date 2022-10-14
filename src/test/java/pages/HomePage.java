package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sample")
    public WebElement sampleElement;

    @FindBy(xpath = "//div[@class=\"footer_copy\"]")
    public WebElement footerNaming;


    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement filter;

    public void testErik01() {

        driver.findElement(By.id("user-name")).sendKeys(ConfigReader.readProperty("username"));
        driver.findElement(By.id("password")).sendKeys(ConfigReader.readProperty("password"));
        driver.findElement(By.id("login-button")).click();

    }

}


