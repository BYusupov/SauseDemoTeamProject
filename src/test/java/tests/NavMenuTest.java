package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavMenuPage;


public class NavMenuTest extends BaseTest {

    private NavMenuPage page;
    HomePage homePage;
    BasePage basePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new NavMenuPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
    }

    @Test(testName = "Navigation menu")
    public void test304() {
        // log in
        homePage.testErik01();

        // When user clicks the button it should display following buttons:
        page.navBtn.click();

        //  for (WebElement each : page.getNavBtns()) {
        basePage.waitForElementVisibility(page.navMenus);
        String actual = page.navMenus.getText();
        String expected = "ALL ITEMS\n" +
                "ABOUT\n" +
                "LOGOUT\n" +
                "RESET APP STATE";


        Assert.assertEquals(actual, expected);



    }


}


