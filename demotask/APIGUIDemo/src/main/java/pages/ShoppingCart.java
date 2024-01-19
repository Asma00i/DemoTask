package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCart extends PageBase {
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@title='Proceed to Checkout'])[2]")
    WebElement proceedToPaymentButton;

    public void pressProceedToPayment() {
        clickButton(proceedToPaymentButton);
    }




}
