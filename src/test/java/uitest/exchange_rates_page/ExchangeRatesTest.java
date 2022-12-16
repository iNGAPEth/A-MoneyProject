package uitest.exchange_rates_page;

import org.testng.annotations.Test;
import page.exchange_rates_page.ExchangeRates;
import uitest.core_uitest.BaseUiTest;


public class ExchangeRatesTest extends BaseUiTest {

    @Test(testName = "testPositiveExchangeRatesButtonFromMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке Курсы валют в заголовке главной страницы")
    public void testPositiveExchangeRatesButtonFromMainPage() {
        new ExchangeRates(driver)
                .pressExchangeRatesButton()
                .getConverterCurrencyFieldErrorMessage();

    }

    @Test(testName = "testPositiveCheckingDropdownArrowButtonExchangeRatesPage",
            groups = {"Smoke"},
            description = "Тест проверки Конвертации валюты по кнопкам страницы Курсы валют")
    public void testPositiveCheckingDropdownArrowButtonExchangeRatesPage() {
        new ExchangeRates(driver)
                .pressExchangeRatesButton()
                .pressDropdownArrowButtonQuantityField()
                .selectCurrencyFromDropdownMenuButton()
                .putCursorIntoQuantityField()
                .fillQuantityField("1000")
                .pressDropdownArrowButtonPriceField()
                .selectCurrencyFromDropdownMenuPriceButton()
                .pressCurrencyReversionButton();
    }

    @Test(testName = "testNegativeSwitchEnglishLanguageButtonFromExchangeRatesPage",
            groups = {"Smoke"},
            description = "Тест кнопки En для перевода на английский язык страницы Курсы валют")
    public void testNegativeSwitchEnglishLanguageButtonFromExchangeRatesPage() {
        new ExchangeRates(driver)
                .pressExchangeRatesButton()
                .pressEnButton();
    }
}