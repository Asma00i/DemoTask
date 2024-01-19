package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PageBase {

    protected static WebDriver driver;

    protected PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {

        button.click();

    }

    protected static String getElementText(WebElement gettingTxt) {
        return gettingTxt.getText();
    }

    protected static void setElementText(WebElement textelement, String value) {
        textelement.sendKeys(value);
    }

    protected static void scrollDown(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    protected static void clickDropdown(String dropdown, String value) {

        Select selectingOptionFromDropDown = new Select(driver.findElement(By.id(dropdown)));
        selectingOptionFromDropDown.selectByValue(value);
    }


    protected static boolean checkElementPresented(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected static void uploadFile(By by, String filePath) {
        driver.findElement(by).sendKeys(filePath);
    }


    protected static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6L));

    }

    protected static void waitPageToLoad()
    {
        new WebDriverWait(driver, Duration.ofSeconds(30L)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    protected static void waitElementToBePresented(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(6L)).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected static void openNewWindow()
    {
                for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    protected static void openNewWindowThenClose()
    {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }
}

