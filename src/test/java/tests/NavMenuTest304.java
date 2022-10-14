package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavMenuPage304;
import utils.ConfigReader;


public class NavMenuTest304 extends BaseTest {

    private NavMenuPage304 page;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new NavMenuPage304(driver);
        page.usernameInput.sendKeys(ConfigReader.readProperty("username"));
        page.passwordInput.sendKeys(ConfigReader.readProperty("password"));
        page.loginBtn.click();
    }

    @Test(testName = "Navigation menu")
    public void test304() {
        // When user clicks the button it should display following buttons:
        page.navBtn.click();

        int index = page.navBtns.size();
        String actual = page.navBtns.get(index).getText();
        String expected = "ALL ITEMS\n" +
                "ABOUT\n" +
                "LOGOUT\n" +
                "RESET APP STATE";
        Assert.assertEquals(actual, expected);
    }

}
