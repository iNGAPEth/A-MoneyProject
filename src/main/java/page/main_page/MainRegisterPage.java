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


public class MainRegisterPage extends BasePage {
    public MainRegisterPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_REGISTER_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[5]/a/button";
    private static final String GET_REGISTER_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[2]/h4";
    private static final String PUT_CURSOR_INTO_NUMBER_REGISTER_FIELD_FRAME_XPATH_LOCATOR = "//*[@id=':r2:']";
    private static final String FILL_NUMBER_FIELD_REGISTER_FRAME_XPATH_LOCATOR = "//*[@id=':r2:']";
    private static final String PRESS_CONTINUE_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/button";
    private static final String PUT_CURSOR_INTO_ENTER_SIX_SYMBOLS_CODE_FIELD_FRAME_XPATH_LOCATOR = "//*[@id=':r3:']";
    private static final String FILL_ENTER_SIX_SYMBOLS_CODE_FIELD_FRAME_XPATH_LOCATOR = "//*[@id=':r3:']";
    private static final String PRESS_SEND_CODE_AGAIN_BUTTON_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[2]/p";
    private static final String FILL_NAME_FIELD_REGISTER_FRAME_XPATH_LOCATOR = "//*[@id=':r4:']";
    private static final String FILL_PATRONYMIC_FIELD_REGISTER_FRAME_XPATH_LOCATOR = "//*[@id=':r5:']";
    private static final String PUT_CURSOR_INTO_SURNAME_FIELD_FRAME_XPATH_LOCATOR = "//*[@id=':r6:']";
    private static final String FILL_SURNAME_FIELD_REGISTER_FRAME_XPATH_LOCATOR = "//*[@id=':r6:']";
    private static final String PUT_CURSOR_INTO_NUMBER_PASSPORT_FIELD_FRAME_XPATH_LOCATOR = "//*[@id=':r7:']";
    private static final String FILL_NUMBER_PASSPORT_FIELD_REGISTER_FRAME_XPATH_LOCATOR = "//*[@id=':r7:']";
    private static final String PRESS_RESIDENT_BUTTON_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[4]/label[1]/input";
    private static final String PUT_CURSOR_INTO_CREATE_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[1]/div/div[1]/div";
    private static final String FILL_CREATE_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[1]/div/div[1]/div/input";
    private static final String PUT_CURSOR_INTO_CONFIRM_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[2]/div[1]/div";
    private static final String FILL_CONFIRM_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[2]/div[1]/div/input";
    private static final String PRESS_CONTROL_QUESTION_BUTTON_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id=\"root\"]/div[2]/div[2]/div[3]/form/div[1]/div//*[name()='svg']";
    private static final String SELECT_CONTROL_QUESTION_FROM_DROPDOWN_LIST_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[1]/div[2]/div/li[5]";
    private static final String PUT_CURSOR_INTO_CREATE_ANSWER_FIELD_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[2]/div[1]/div";
    private static final String FILL_CREATE_ANSWER_FOR_CONTROL_QUESTION_FIELD_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/div[3]/form/div[2]/div[1]/div/textarea";
    private static final String PRESS_ENTER_BUTTON_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[2]/button";


    public MainRegisterPage pressRegisterButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_REGISTER_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorNumberRegisterFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_NUMBER_REGISTER_FIELD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillNumberFieldRegisterFrame(String usernumber) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_NUMBER_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(usernumber);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage pressContinueButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_CONTINUE_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorEnterSixSymbolsCodeFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_ENTER_SIX_SYMBOLS_CODE_FIELD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillSixSymbolsCodeFieldRegisterFrame(String code) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_ENTER_SIX_SYMBOLS_CODE_FIELD_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(code);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage pressSendCodeAgainButtonRegisterFrame() {
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(40));
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PRESS_SEND_CODE_AGAIN_BUTTON_REGISTER_FRAME_XPATH_LOCATOR));
        waiter.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillNameFieldRegisterFrame(String username) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_NAME_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(username);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillPatronymicFieldRegisterFrame(String userpatronymic) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_PATRONYMIC_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpatronymic);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorSurnameFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_SURNAME_FIELD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillSurnameFieldRegisterFrame(String usersurname) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_SURNAME_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(usersurname);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorNumberPassportFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_NUMBER_PASSPORT_FIELD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillNumberPassportFieldRegisterFrame(String userpassport) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_NUMBER_PASSPORT_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpassport);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage pressResidentButtonRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PRESS_RESIDENT_BUTTON_FIELD_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCreatePasswordFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_CREATE_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillCreatePasswordFieldRegisterFrame(String usercreatepassword) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_CREATE_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(usercreatepassword);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorConfirmPasswordFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_CONFIRM_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillConfirmPasswordFieldRegisterFrame(String userconfirmpassword) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_CONFIRM_PASSWORD_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userconfirmpassword);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage pressControlQuestionButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PRESS_CONTROL_QUESTION_BUTTON_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage selectControlQuestionFromDropdownList() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(SELECT_CONTROL_QUESTION_FROM_DROPDOWN_LIST_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage putCursorCreateAnswerFieldRegisterFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_CREATE_ANSWER_FIELD_FIELD_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage fillCreateAnswerForControlQuestionField(String usercreateanswer) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath
                                (FILL_CREATE_ANSWER_FOR_CONTROL_QUESTION_FIELD_REGISTER_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(usercreateanswer);
        return new MainRegisterPage(driver);
    }

    public MainRegisterPage pressEnterButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ENTER_BUTTON_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainRegisterPage(driver);
    }

    public void getRegisterButtonErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_REGISTER_BUTTON_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Регистрация";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
}








