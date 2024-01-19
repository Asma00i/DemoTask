package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends PageBase {
    public AddToCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "option-label-size-143-item-166")
    WebElement selectXsSizeButton;
    @FindBy(id = "option-label-color-93-item-59")
    WebElement selectWhiteColorButton;

    @FindBy(id = "product-addtocart-button")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[contains(text(), 'shopping cart')]")
    WebElement shoppingCartLink;


    public void pressSelectSizeXs() {
        clickButton(selectXsSizeButton);
    }

    public void pressSelectWhiteColor() {
        clickButton(selectWhiteColorButton);

    }

    public void pressAddToCart() {
        clickButton(addToCartButton);

    }
    public void pressShoppingCart() {
        clickButton(shoppingCartLink);

    }
}
