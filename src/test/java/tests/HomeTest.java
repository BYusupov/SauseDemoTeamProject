package tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;

public class HomeTest extends BaseTest {

    HomePage page;


    @BeforeMethod
    public void setUp() {
        page = new HomePage(driver);
    }

    @Test(testName = "US 301 - verify standard user can log in with right password")
    public void testErik01() {

        page.testErik01();

    }

    @Test(testName = "US 302 - error message = Epic sadface: Sorry, this user has been locked out displays")
    public void testErik02() {

        String expected = "Epic sadface: Sorry, this user has been locked out displays";
        String actual = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test(testName = "US305 - Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy")
    public void testOksana() {
        String expected = "US305 - Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actual = page.getText(page.footerNaming);
        Assert.assertEquals(expected, actual);

    }

    @Test(testName = "US 306 - Filter options")
    public void US306() {

    }
}





