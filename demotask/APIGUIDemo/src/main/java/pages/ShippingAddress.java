package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingAddress extends PageBase{
    public ShippingAddress(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "SFR0Y1D")
    WebElement companyTextBox;
    @FindBy(id = "VD18MB8")
    WebElement streetAddressFirstTextBox;
    @FindBy(id = "K1HX90V")
    WebElement streetAddressSecondTextBox;

    @FindBy(id = "CB5TN4J")
    WebElement streetAddressThirdTextBox;

    @FindBy(id = "OUNM50O")
    WebElement cityTextBox;

    @FindBy(id = "P3NE8Q0")
    WebElement stateDropDownList;
    @FindBy(id = "O1TRC2D")
    WebElement zipTextBox;
    @FindBy(id = "GJS171Q")
    WebElement countryDropDownList;
    @FindBy(id = "OYACMO3")
    WebElement phoneNumberTextBox;

    @FindBy(xpath = "(//input[@type=\"radio\"])[2]")
    WebElement shippingMethodRadioButton;

    @FindBy(xpath = " (//button[@type=\"submit\"])[2]")
    WebElement nextButton;


    public void enterCompanyField(String company) {
        waitElementToBePresented(companyTextBox);
        setElementText(companyTextBox, company);
    }
    public void enterStreetFstAddField(String street) {
        waitElementToBePresented(streetAddressFirstTextBox);
        setElementText(streetAddressFirstTextBox, street);
    }
    public void enterStreetSecAddField(String street) {
        waitElementToBePresented(streetAddressSecondTextBox);
        setElementText(streetAddressSecondTextBox, street);
    }

    public void enterStreetThirdAddField(String street) {
        waitElementToBePresented(streetAddressThirdTextBox);
        setElementText(streetAddressThirdTextBox, street);
    }
    public void enterCityField(String city) {
        waitElementToBePresented(cityTextBox);
        setElementText(cityTextBox, city);
    }
    public void selectStat(String value) {
        waitElementToBePresented(stateDropDownList);
        clickDropdown("P3NE8Q0", value);
    }
    public void enterZipField(String zip) {
        waitElementToBePresented(zipTextBox);
        setElementText(zipTextBox, zip);
    }
    public void selectCountry(String value) {
        waitElementToBePresented(countryDropDownList);
        clickDropdown("GJS171Q", value);
    }

    public void enterPhoneNumberField(String phoneNumber) {
        waitElementToBePresented(phoneNumberTextBox);
        setElementText(phoneNumberTextBox, phoneNumber);
    }
    public void selectShippingMethod() {
        clickButton(shippingMethodRadioButton);
    }
    public void clickNext() {
        clickButton(nextButton);
    }
}





