package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class PaymentMethod extends PageBase{
    public PaymentMethod(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[contains(text(), 'Place Order')]")
    public WebElement placeOrderButton;
    @FindBy (xpath = "//*[contains(text(), 'Thank you for your purchase!')]")
    public static WebElement thankYouForYourPurchaseTitle;


    public void pressPlaceOrder() {
        clickButton(placeOrderButton);
    }
}
