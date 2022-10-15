package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavMenuPage;
import utils.ConfigReader;

import java.util.List;

public class ProblemUserTest extends BaseTest {

    private NavMenuPage page;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        page = new NavMenuPage(driver);
        homePage = new HomePage(driver);
    }
    @Test(testName = "US 303 - problem_user logs in, all items on homepage should display same images")
    public void test303(){
        // login using problem_user
//        driver.findElement(By.id("user-name")).sendKeys("problem_user");
//        driver.findElement(By.id("password")).sendKeys(ConfigReader.readProperty("password"));
//        driver.findElement(By.id("login-button")).click();
        homePage.testErik01();

        // verify all images are the same
        List<WebElement> imageList = driver.findElements(By.xpath("//a/img"));

        for(int i = 1; i < imageList.size(); i++) {
            String actualImg = imageList.get(i).getAttribute("src");
            System.out.println(actualImg);

            if (i == imageList.size() - 5){
                String expectedImg = imageList.get(i).getAttribute("src");
                page.assertEquals(actualImg, expectedImg);
            }
        }
    }
}


