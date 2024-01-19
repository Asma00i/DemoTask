package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//ul[@class=\"header links\"]/li[3]")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement lumaLogo;


    @FindBy(xpath = "//img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt07-gray_main_1.jpg' and @alt='Argus All-Weather Tank']")
//        @FindBy(xpath = "(//div[@class='swatch-attribute-options clearfix'])[5]")

    public WebElement thirdProductItem;


    @FindBy(xpath = "(//*[@class=\"action tocompare\"])[1]")
    public WebElement addThirdProductToCompareList;


    @FindBy(xpath = "(//*[@class=\"action tocompare\"])[3]")
    public WebElement addAnotherProductToCompareList;


    @FindBy(xpath = "//*[contains(text(), 'comparison list')]")
    public WebElement comparisonListLink;

    public void pressCreateAnAccountLink() {
        waitElementToBePresented(createAnAccountButton);
        clickButton(createAnAccountButton);

    }

    public void pressLumaLogo() {
        waitElementToBePresented(lumaLogo);
        clickButton(lumaLogo);
    }

    public void pressThirdProduct() {
        scrollDown(thirdProductItem);
        waitElementToBePresented(thirdProductItem);
        clickButton(thirdProductItem);
    }

    public void pressToAddThirdProductToCompareList() {

        waitElementToBePresented(addThirdProductToCompareList);
        scrollDown(addThirdProductToCompareList);
        clickButton(addThirdProductToCompareList);
    }


    public void pressToAddAnotherProductToCompareList() {
        waitElementToBePresented(addAnotherProductToCompareList);
        clickButton(addAnotherProductToCompareList);
    }

    public void pressComparisonListLink() {
        waitElementToBePresented(comparisonListLink);
        clickButton(comparisonListLink);
    }

}

