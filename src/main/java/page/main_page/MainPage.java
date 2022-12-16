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

public class MainPage extends BasePage {
    private static final String PRESS_REGISTER_BY_PHONE_BUTTON_XPATH_LOCATOR =
            "//*[@id='tab-0']/p";
    private static final String FILL_PHONE_NUMBER_FIELD_XPATH_LOCATOR =
            "//*[@id=':r0:']";
    private static final String GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='tabpanel-0']/div/form/div[1]/div[2]";
    private static final String FILL_PASSWORD_FIELD_XPATH_LOCATOR =
            "//*[@id=':r1:']";
    private static final String GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='tabpanel-0']/div/form/div[2]/div[2]";
    private static final String PRESS_ENTRANCE_BUTTON_XPATH_LOCATOR =
            "//*[@id='tabpanel-0']/div/form/button";
    private static final String PRESS_DEMO_MODE_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[5]/div[5]/a[1]/h6";
    private static final String PRESS_FORGET_PASSWORD_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[5]/div[5]/a[2]/h6";
    private static final String PRESS_DOWNLOAD_APPSTORY_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/div[2]/div/a[1]/img";
    private static final String PRESS_DOWNLOAD_GOOGLEPLAY_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/div[2]/div/a[2]/img";
    private static final String PRESS_RU_EN_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[1]/div[2]/label/span[2]/div/h6[2]";
    private static final String GET_ENGLISH_LANGUAGE_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='tab-0']/p";
    private static final String GET_RUSSIAN_LANGUAGE_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='tab-0']/p";
    private static final String GET_FORGET_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[1]/div[1]/p";

    public MainPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
    }

    public MainPage pressRegisterByPhoneButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_REGISTER_BY_PHONE_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage fillPhoneNumberField(String usernumber) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf(driver.findElement(By.xpath(FILL_PHONE_NUMBER_FIELD_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(usernumber);
        return new MainPage(driver);
    }

    public MainPage fillPasswordField(String userpassword) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf(driver.findElement(By.xpath(FILL_PASSWORD_FIELD_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpassword);
        return new MainPage(driver);
    }

    public MainPage pressEntranceButton() {
        ExpectedCondition<WebElement> condition = ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ENTRANCE_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage pressDemoModeButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_DEMO_MODE_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage pressForgetPasswordButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_FORGET_PASSWORD_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage pressDownloadAppStoreButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_DOWNLOAD_APPSTORY_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage pressDownloadGooglePlayButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_DOWNLOAD_GOOGLEPLAY_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

    public MainPage pressRuEnButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_RU_EN_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainPage(driver);
    }

//    public void getUserMainPageErrorMessage() {
//        WebElement errorMessage = driver.findElement(By.xpath("сделать локатор для какого-то " +
//                "текста заглавия на странице пользователя по переходу по кнопке Войти"));
//        String expectedMessageText = "Текст по локатору";
//        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
//    }

    public void getInvalidPhoneNumberErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getSpecialSymbolsPhoneFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getIsEmptyPhoneNumberErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getCyrillicPhoneNumberErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getLatinPhoneNumberErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getMaxSymbolsPhoneNumberErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PHONE_NUMBER_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Некорректный номер телефона";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getInvalidPasswordErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText =
                "Неверный логин или пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", " +
                        "чтобы сбросить его";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getSpecialSymbolsPasswordFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText =
                "Неверный логин или пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", " +
                        "чтобы сбросить его";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getIsEmptyPasswordFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText =
                "Неверный логин или пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", " +
                        "чтобы сбросить его";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getCyrillicPasswordFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText =
                "Неверный логин или пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", " +
                        "чтобы сбросить его";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getMaxSymbolsPasswordFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_INVALID_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText =
                "Неверный логин или пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", " +
                        "чтобы сбросить его";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
    //    public void getDemoModeButtonErrorMessage() {
//        WebElement errorMessage = driver.findElement(By.xpath("сделать локатор для какого-то " +
//                "текста заглавия на странице пользователя по переходу по кнопке Войти"));
//        String expectedMessageText = "Текст по локатору";
//        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
//  }

    public void getForgetPasswordButtonErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_FORGET_PASSWORD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Введите номер паспорта";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    //    public void getDownloadAppStoreButtonErrorMessage() {
//        WebElement errorMessage = driver.findElement(By.xpath("сделать локатор для какого-то " +
//                "текста заглавия на странице пользователя по переходу по кнопке Войти"));
//        String expectedMessageText = "Текст по локатору";
//        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
//  }

    //    public void getDownloadGooglePlayButtonErrorMessage() {
//        WebElement errorMessage = driver.findElement(By.xpath("сделать локатор для какого-то " +
//                "текста заглавия на странице пользователя по переходу по кнопке Войти"));
//        String expectedMessageText = "Текст по локатору";
//        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
//  }

    public void getEnglishLanguageMainPageErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_ENGLISH_LANGUAGE_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "By phone";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }

    public void getRussianLanguageMainPageErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_RUSSIAN_LANGUAGE_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "По телефону";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
}








