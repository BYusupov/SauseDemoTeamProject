package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;

import java.util.List;

public class HomeTest extends BaseTest {

    HomePage homePage;


    @BeforeMethod
    public void setUp() {
        homePage = new HomePage(driver);
    }

    @Test(testName = "US 301 - verify standard user can log in with right password")
    public void testErik01() {
        homePage.testErik01();
    }

    @Test(testName = "US 302 - error message = Epic sadface: Sorry, this user has been locked out displays")
    public void testErik02() {
        homePage.testErik02();
        String expected = "Epic sadface: Sorry, this user has been locked out.";
        String actual = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test(testName = "US305 - Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy")
    public void testOksana() {
        homePage.testErik01();
        String expected = "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actual = homePage.getText(homePage.footerNaming);
        Assert.assertEquals(expected, actual);

    }

    @Test(testName = "US 306 - Filter options")
    public void US306() {
        homePage.testErik01();
        homePage.filter.click();

    }

    @Test(testName = "US 303 - Display same images")
    public void testErik03() {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys(ConfigReader.readProperty("password"));
        driver.findElement(By.id("login-button")).click();
//        homePage.testErik01();
        String expected = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        List<WebElement> images = driver.findElements(By.xpath("//a//img"));

        for (WebElement each : images) {
            Assert.assertEquals(each.getAttribute("src"),expected);

        }
    }
}





