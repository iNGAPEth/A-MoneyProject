package page.main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page.core_page.BasePage;

import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class MainHeaderPage extends BasePage {

    public MainHeaderPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_LOGO_BUTTON_XPATH_LOCATOR = "//*[@id='root']/div[1]/a/div/div";
    private static final String PRESS_ATM_AND_DEPARTMENTS_XPATH_LOCATOR = "//*[@id='root']/div[1]/div[1]/div[1]/a";
    private static final String PRESS_EXCHANGE_RATES_XPATH_LOCATOR = "//*[@id='root']/div[1]/div[1]/div[2]/a";
    private static final String PRESS_CONTACTS_XPATH_LOCATOR = "//*[@id='root']/div[1]/div[1]/div[3]/a";
    private static final String GET_ATM_AND_DEPARTMENTS_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/p[1]";
    private static final String GET_EXCHANGE_RATES_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/h5";
    private static final String GET_CONTACTS_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/h1";

    public MainHeaderPage pressLogoButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_LOGO_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainHeaderPage(driver);
    }

    public MainHeaderPage pressDepartmentsButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ATM_AND_DEPARTMENTS_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainHeaderPage(driver);
    }

    public MainHeaderPage pressExchangeRatesButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_EXCHANGE_RATES_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainHeaderPage(driver);
    }

    public MainHeaderPage pressContactsButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_CONTACTS_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainHeaderPage(driver);
    }

    public void getDepartmentsButtonPageErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_ATM_AND_DEPARTMENTS_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Популярные запросы";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getExchangeRatesButtonPageErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_EXCHANGE_RATES_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Конвертер валют";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getContactsButtonPageErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_CONTACTS_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Contacts";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
}
