package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartBtn;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement zipField;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement itemInCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBtn;

}
