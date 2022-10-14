package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest extends BaseTest {
    CartPage page;

    @BeforeMethod
    public void setUp() {
        page = new CartPage(driver);
    }

    @Test(testName = "US308 - Checkout:Your Information")
    public void testAlex01() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        page.shoppingCartBtn.click();
        page.checkoutBtn.click();
        page.firstNameField.isDisplayed();
        page.lastNameField.isDisplayed();
        page.zipField.isDisplayed();
    }

    @Test(testName = "US 309 - Add to cart")
    public void testAlex02() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        page.addToCart.click();
        page.shoppingCartBtn.click();
        Assert.assertEquals(page.itemInCart.getText(), "Sauce Labs Backpack");
    }

    @Test(testName = "US 310 - Remove from cart")
    public void testAlex03() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        page.addToCart.click();
        page.shoppingCartBtn.click();
        page.removeBtn.click();
    }
}
