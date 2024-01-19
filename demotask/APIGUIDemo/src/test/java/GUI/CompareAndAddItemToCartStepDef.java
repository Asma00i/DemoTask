package GUI;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class CompareAndAddItemToCartStepDef extends TestBase {

    private AddToCart addToCart;
    private CompareProduct compareProduct;
    private HomePage homePage;
    private PaymentMethod paymentMethod;
    private ShippingAddress shippingAddress;

    private ShoppingCart shoppingCart;


    public void beforeTest() {

        homePage = new HomePage(driver);
        compareProduct = new CompareProduct(driver);
        addToCart = new AddToCart(driver);
        shoppingCart = new ShoppingCart(driver);
        shippingAddress = new ShippingAddress(driver);
        paymentMethod = new PaymentMethod(driver);


    }

    @Given("user navigate to Luma url and press create an account")
    public void userNavigateToLumaUrlAndPressCreateAnAccount() {
        setUP();
        openBrowser();
    }

    @When("user enter valid data and press create account")
    public void userEnterValidDataAndPressCreateAccount() {
        createAnAccount();
    }


    @When("user navigate to hot sellers in home page")
    public void userNavigateToHotSellersInHomePage() {
        beforeTest();
        homePage.pressLumaLogo();
    }

    @When("user select the third product")
    public void userSelectTheThirdProduct() {
        beforeTest();
        homePage.pressThirdProduct();
    }

    @When("user add two products to compare list")
    public void userAddTwoProductsToCompareList() {
        beforeTest();
        homePage.pressToAddThirdProductToCompareList();
        homePage.pressToAddAnotherProductToCompareList();
    }

    @When("user select the second product and add it to the cart.")
    public void userSelectTheSecondProductAndAddItToTheCart() {
        beforeTest();
        homePage.pressComparisonListLink();
        compareProduct.addSecondItemToCart();
        addToCart.pressSelectSizeXs();
        addToCart.pressSelectWhiteColor();
        addToCart.pressAddToCart();


    }

    @When("user go to cart and proceed to check out")
    public void userGoToCartAndProceedToCheckOut() {
        beforeTest();
        addToCart.pressShoppingCart();
        shoppingCart.pressProceedToPayment();


    }

    @When("user fill the shipping address & payment information {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userFillTheShippingAddressPaymentInformation(String company, String stFAdd, String stSAdd, String stTAdd, String city, String state, String zip, String country, String phone) {
        beforeTest();
        shippingAddress.enterCompanyField(company);
        shippingAddress.enterStreetFstAddField(stFAdd);
        shippingAddress.enterStreetSecAddField(stSAdd);
        shippingAddress.enterStreetThirdAddField(stTAdd);
        shippingAddress.enterCityField(city);
        shippingAddress.selectStat(state);
        shippingAddress.enterZipField(zip);
        shippingAddress.selectCountry(country);
        shippingAddress.enterPhoneNumberField(phone);
        shippingAddress.selectShippingMethod();
        shippingAddress.clickNext();
    }


    @When("user proceed with payment.")
    public void userProceedWithPayment() {
        beforeTest();
        paymentMethod.pressPlaceOrder();
        Assert.assertTrue(PaymentMethod.thankYouForYourPurchaseTitle.getText().contains("Thank you for your purchase!"));

    }



}
