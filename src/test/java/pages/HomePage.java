package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sample")
    public WebElement sampleElement;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartBtn;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement zipField;

//    @FindBy(id = "cancel")
//    public WebElement cancelBtn;
//
//    @FindBy(id = "continue-shopping")
//    public WebElement contShopBtn;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement itemInCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBtn;

}
