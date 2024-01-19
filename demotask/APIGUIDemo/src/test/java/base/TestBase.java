package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAnAccount;
import pages.HomePage;

import java.util.Properties;

public class TestBase {


    public static WebDriver driver;
    public static Properties loadingPropertyFile;
    //    CreateAnAccount loginPage;
    CreateAnAccount createAnAccount;
    HomePage homePage;


    public void setUP() {
        loadingPropertyFile = LoadProperties.loadProperties("src/main/config/config.properties");

    }

    public void openBrowser() {

        String url = loadingPropertyFile.getProperty("url");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void createAnAccount() {

        createAnAccount = new CreateAnAccount(driver);
        homePage = new HomePage(driver);

        homePage.pressCreateAnAccountLink();
        String firstname = loadingPropertyFile.getProperty("firstname");
        String lastname = loadingPropertyFile.getProperty("lastname");
        String email = loadingPropertyFile.getProperty("email");
        String password = loadingPropertyFile.getProperty("password");
        String confirmPassword = loadingPropertyFile.getProperty("confirmPassword");
        createAnAccount.enterFirstName(firstname);
        createAnAccount.enterLastName(lastname);
        createAnAccount.enterEmail(email);
        createAnAccount.enterPassword(password);
        createAnAccount.enterConfirmPassword(confirmPassword);
        createAnAccount.clickCreateAnAccount();
    }


    public void teardown() {
        driver.quit();
    }

}
