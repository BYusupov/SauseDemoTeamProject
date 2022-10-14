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

    @Test(testName = "US 301 - verify standard user can log in with right password")
    public void test01() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

}
//
//    @Test(testName = "US 302 - error message = Epic sadface: Sorry, this user has been locked out displays")
//    public void test02() {
//
//        String expected = "Epic sadface: Sorry, this user has been locked out displays";
//        String actual = driver.findElement(By.xpath("//h3")).getText();
//        Assert.assertEquals(expected, actual);
//
//        @Test(testName = "US 303 - ")


