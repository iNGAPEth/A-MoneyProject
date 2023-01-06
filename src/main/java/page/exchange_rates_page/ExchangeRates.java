package page.exchange_rates_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page.core_page.BasePage;
import page.main_page.MainPage;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class ExchangeRates extends BasePage {

    public ExchangeRates(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_EXCHANGE_RATES_XPATH_LOCATOR =
            "//*[@id='root']/div[1]/div[1]/div[2]/a";
    private static final String GET_CONVERTER_CURRENCY_FIELD_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/h5";
    private static final String PRESS_DROPDOWN_ARROW_BUTTON_QUANTITY_FIELD_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[1]/div//*[local-name()='svg']";
    private static final String SELECT_CURRENCY_FROM_DROPDOWN_MENU_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[1]/div[2]/div/li[5]";
    private static final String PUT_CURSOR_INTO_QUANTITY_FIELD_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div";
    private static final String FILL_QUANTITY_FIELD_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div/input";
    private static final String PRESS_DROPDOWN_ARROW_BUTTON_PRICE_FIELD_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[2]/div[1]/div//*[local-name()='svg']";
    private static final String SELECT_CURRENCY_FROM_DROPDOWN_MENU_PRICE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div/li[1]";
    private static final String PRESS_CURRENCY_REVERSION_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div//*[local-name()='svg']";
    private static final String PRESS_ENGLISH_LANGUAGE_BUTTON_ERROR_MESSAGE_FROM_EXCHANGE_RATES_PAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[1]/div[2]/label/span[2]/div/h6[2]";
    private static final String GET_EMPTY_FIELD_QUANTITY = "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div";
    private static final String PUT_CURSOR_INTO_QUANTITY_LINE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div";


    public ExchangeRates pressExchangeRatesButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_EXCHANGE_RATES_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates pressDropdownArrowButtonQuantityField() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_DROPDOWN_ARROW_BUTTON_QUANTITY_FIELD_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates selectCurrencyFromDropdownMenuButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(SELECT_CURRENCY_FROM_DROPDOWN_MENU_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates putCursorIntoQuantityField() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PUT_CURSOR_INTO_QUANTITY_FIELD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates fillQuantityField(String userquantity) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(FILL_QUANTITY_FIELD_XPATH_LOCATOR));
        wait.until(condition)
                .sendKeys(userquantity);
        return new ExchangeRates(driver);
    }

    public ExchangeRates pressDropdownArrowButtonPriceField() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_DROPDOWN_ARROW_BUTTON_PRICE_FIELD_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates selectCurrencyFromDropdownMenuPriceButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(SELECT_CURRENCY_FROM_DROPDOWN_MENU_PRICE_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public ExchangeRates pressCurrencyReversionButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_CURRENCY_REVERSION_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public MainPage pressEnButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ENGLISH_LANGUAGE_BUTTON_ERROR_MESSAGE_FROM_EXCHANGE_RATES_PAGE_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public ExchangeRates putCursorIntoQuantityLine() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PUT_CURSOR_INTO_QUANTITY_LINE_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new ExchangeRates(driver);
    }

    public void getConverterCurrencyFieldErrorMessage () {
            WebElement errorMessage = driver.findElement(By.xpath(GET_CONVERTER_CURRENCY_FIELD_ERROR_MESSAGE_XPATH_LOCATOR));
            String expectedMessageText = "Конвертер валют";
            Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error massage");
    }

    public void getEmptyFieldQuantity () {
        WebElement errorMessage = driver.findElement(By.xpath(GET_EMPTY_FIELD_QUANTITY));
        String expectedMessageText = "";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error massage");
    }
}
