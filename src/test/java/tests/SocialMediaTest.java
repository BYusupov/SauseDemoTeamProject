package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SocialMediaPage;

import java.util.ArrayList;
import java.util.Set;

public class SocialMediaTest extends BaseTest {
    private SocialMediaPage page;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)

    public void setUp() {

        homePage = new HomePage(driver);


        driver.findElement(By.linkText("Saucedemo")).click();

        page = new SocialMediaPage(driver);
    }

    @Test(testName = "US 307 - Verify social media buttons present twitter, facebook and linkedIn")
    public void test307() {

        homePage.testErik01();

        // another version
//        for (WebElement eachMedia : page.mediaIcons) {
//            eachMedia.getText();
//            Assert.assertTrue(eachMedia.isDisplayed());


        // click on the icons
        page.click(page.twitterbtn);
        page.click(page.facebookbtn);
        page.click(page.linkedinbtn);

        //switching to each window
        String mainWindowID = driver.getWindowHandle();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        Set<String> allWindowIDs = driver.getWindowHandles();

        // verify twitter, fb an In present
        Assert.assertTrue(page.twitterbtn.isDisplayed());
        Assert.assertTrue(page.facebookbtn.isDisplayed());
        Assert.assertTrue(page.linkedinbtn.isDisplayed());

    }
}

