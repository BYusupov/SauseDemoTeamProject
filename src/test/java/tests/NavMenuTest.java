package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavMenuPage;


public class NavMenuTest extends BaseTest {

    private NavMenuPage page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new NavMenuPage(driver);
    }

    @Test(testName = "Navigation menu")
    public void test304() {
        // log in
        page.usernameInput.sendKeys("standard_user");
        page.passwordInput.sendKeys("secret_sauce");
        page.loginBtn.click();

        // When user clicks the button it should display following buttons:
        page.navBtn.click();

      //  for (WebElement each : page.getNavBtns()) {
            String actual =  page.navBtns.get(0).getText() + "\n" +
        page.navBtns.get(1).getText() + "\n" +
        page.navBtns.get(2).getText() + "\n" +
        page.navBtns.get(3).getText();
                    String expected = "ALL ITEMS\n" +
                    "ABOUT\n" +
                    "LOGOUT\n" +
                    "RESET APP STATE";
            Assert.assertEquals(actual, expected);

        }


    }


