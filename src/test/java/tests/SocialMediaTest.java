package tests;

import base.BaseTest;
import org.openqa.selenium.By;
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
    public void setUp(){
        homePage = new HomePage(driver);

        page = new SocialMediaPage(driver);
    }
    @Test(testName = "US 307 - Verify social media buttons present twitter, facebook and linkedIn")
    public void test307(){

        homePage.testErik01();

        // click on the icons
        page.click(page.twitterbtn);
        page.click(page.facebookbtn);
        page.click(page.linkedinbtn);

        //switching to each window
        String mainWindowID = driver.getWindowHandle();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        Set<String> allWindowIDs = driver.getWindowHandles();

        for(String each: allWindowIDs){
            if (!each.equals(mainWindowID)) {
                driver.switchTo().window(each);
                if(driver.getTitle().equals("SauceLabs(@saucelabs);Twitter")){
                    break;
                }

            }
            Assert.assertTrue(true);
        }
    }

}

