package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareProduct extends PageBase {
    public CompareProduct(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='actions-primary'])[2]")
    WebElement SecondItemAddToCartButton;

    public void addSecondItemToCart() {

        scrollDown(SecondItemAddToCartButton);
        clickButton(SecondItemAddToCartButton);


    }
}
