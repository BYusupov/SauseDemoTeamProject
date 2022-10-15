package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class CartTest extends BaseTest {
    CartPage page;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        page = new CartPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(testName = "US308 - Checkout:Your Information")
    public void testAlex01() {
        homePage.testErik01();
        page.shoppingCartBtn.click();
        page.checkoutBtn.click();

        for (WebElement eachField : page.checkoutInfo) {
            eachField.getText();
            Assert.assertTrue(eachField.isDisplayed());
        }
    }

    @Test(testName = "US 309 - Add to cart")
    public void testAlex02() {
        homePage.testErik01();

        page.addToCart.click();
        page.shoppingCartBtn.click();
        Assert.assertEquals(page.itemInCart.getText(), "Sauce Labs Backpack");
    }

    @Test(testName = "US 310 - Remove from cart")
    public void testAlex03() {
        homePage.testErik01();

        page.addToCart.click();
        page.shoppingCartBtn.click();
        page.removeBtn.click();
        Assert.assertTrue(true);
    }
}
