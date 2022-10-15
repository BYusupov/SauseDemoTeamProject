package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage extends BasePage {
    public SocialMediaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        }
        @FindBy(xpath = "//li[@class= 'social_twitter']")
        public WebElement twitterbtn;

        @FindBy(xpath = "//li[@class= 'social_facebook']")
        public WebElement facebookbtn;

        @FindBy(xpath = "//li[@class= 'social_linkedin']")
        public WebElement linkedinbtn;
    }


