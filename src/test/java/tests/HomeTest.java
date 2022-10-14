package tests;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp(){
        page = new HomePage(driver);
    }

    @Test(testName = "Google title test")
    public void test01(){
        page.assertEquals(driver.getTitle(), "Google");
    }

    @Test(testName = "Google title test")
    public void burkhon(){
        System.out.println("Burkhon");
    }

    @Test(testName = "US308 - Checkout:Your Information")
    public void testAlex01() {

//        Alert alert = driver.switchTo().alert();
//        alert.accept();
        page.shoppingCartBtn.click();
        page.checkoutBtn.click();
        page.firstNameField.isDisplayed();
        page.lastNameField.isDisplayed();
        page.zipField.isDisplayed();
    }
    @Test(testName = "US 309 - Add to cart")
    public void testAlex02() {
    page.addToCart.click();
    page.shoppingCartBtn.click();
    Assert.assertEquals(page.itemInCart.getText(), "Sauce Labs Backpack");
    }
    @Test(testName = "US 310 - Remove from cart")
    public void testAlex03() {
        page.addToCart.click();
        page.shoppingCartBtn.click();
        page.removeBtn.click();
    }

}
