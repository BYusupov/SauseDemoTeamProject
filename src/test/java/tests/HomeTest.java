package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp() {
        page = new HomePage(driver);
    }

    @Test(testName = "Google title test")
    public void test01() {
        page.assertEquals(driver.getTitle(), "Google");
    }

    @Test(testName = "Google title test")
    public void burkhon() {
        System.out.println("Burkhon");
    }


    @Test(testName = "US305 - Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy")
    public void testOksana() {
        String expected = "US305 - Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actual = page.getText(page.footerNaming);
        Assert.assertEquals(expected, actual);

    }
}
