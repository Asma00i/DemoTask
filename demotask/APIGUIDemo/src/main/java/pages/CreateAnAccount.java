package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount extends PageBase {
    public CreateAnAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    WebElement firstNameTextField;

    @FindBy(id = "lastname")
    WebElement lastNameTextField;

    @FindBy(id = "email_address")
    WebElement emailTextField;

    @FindBy(id = "password")
    WebElement passwordTextField;

    @FindBy(id = "password-confirmation")
    WebElement confirmPasswordTextField;

    @FindBy(xpath = "//button[@type='submit' and contains(.,'Create')]")
    WebElement pressCreateAnAccountbutton;


    public void enterFirstName(String firstname) {
        waitElementToBePresented(firstNameTextField);
        setElementText(firstNameTextField, firstname);
    }

    public void enterLastName(String lastname) {

        waitElementToBePresented(lastNameTextField);
        setElementText(lastNameTextField, lastname);
    }

    public void enterEmail(String email) {

        waitElementToBePresented(emailTextField);
        setElementText(emailTextField, email);
    }


    public void enterPassword(String password) {
        waitElementToBePresented(passwordTextField);
        setElementText(passwordTextField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        waitElementToBePresented(confirmPasswordTextField);
        setElementText(confirmPasswordTextField, confirmPassword);
    }

    public void clickCreateAnAccount() {
        clickButton(pressCreateAnAccountbutton);
    }

}
