package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SocialMediaPage;
import java.util.ArrayList;
import java.util.Set;

public class SocialMediaTest extends BaseTest {
    private SocialMediaPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver.findElement(By.linkText("Saucedemo")).click();
        page = new SocialMediaPage(driver);
    }
    @Test(testName = "US 307 - Verify social media buttons present twitter, facebook and linkedIn")
    public void test307() {

        // verify twitter, fb an In present
        Assert.assertTrue(page.twitterbtn.isDisplayed());
        Assert.assertTrue(page.facebookbtn.isDisplayed());
        Assert.assertTrue(page.linkedinbtn.isDisplayed());

    }
}

