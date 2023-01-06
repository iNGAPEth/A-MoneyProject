package page.main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.core_page.BasePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class MainForgotPasswordPage extends BasePage {
    public MainForgotPasswordPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_FORGOT_PASSWORD_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[5]/div[5]/a[2]/h6";
    private static final String PUT_CURSOR_INTO_NUMBER_PASSPORT_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div/div[1]/div";
    private static final String FILL_NUMBER_PASSPORT_FIELD_REGISTER_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR =
            "//*[@id=':r2:']";
    private static final String PRESS_CONTINUE_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/button";
    private static final String PUT_CURSOR_INTO_ENTER_SIX_CODE_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[1]/div[1]/div";
    private static final String FILL_SIX_CODE_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[1]/div[1]/div/input";
    private static final String PUT_CURSOR_INTO_CREATE_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[1]/div[1]/div";
    private static final String FILL_CREATE_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[1]/div[1]/div/input";
    private static final String PUT_CURSOR_INTO_CONFIRM_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[2]/div[1]/div";
    private static final String FILL_CONFIRM_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div[2]/div[1]/div/input";
    private static final String PRESS_ENTER_BUTTON_RECOVERY_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/button";
    private static final String GET_PASSPORT_FIELD_RECOVERY_FRAME_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div/div[2]/div[2]/form/div/div[2]";

    public MainForgotPasswordPage pressForgotPasswordButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_FORGOT_PASSWORD_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage putCursorNumberPassportFieldForgotPasswordFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_NUMBER_PASSPORT_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage fillNumberPassportFieldForgotPasswordFrame(String userpassport) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement
                                (By.xpath(FILL_NUMBER_PASSPORT_FIELD_REGISTER_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpassport);
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage pressContinueButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_CONTINUE_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage putCursorEnterSixSymbolsCodeFieldForgotPasswordFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_ENTER_SIX_CODE_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage fillSixSymbolsCodeFieldForgotPasswordFrame(String usersixsymbolsnumber) {
        try {
            ExpectedCondition<WebElement> condition =
                    ExpectedConditions.visibilityOf
                            (driver.findElement
                                    (By.xpath(FILL_SIX_CODE_FIELD_FORGOT_PASSWORD_FRAME_XPATH_LOCATOR)));
            wait.until(condition)
                    .sendKeys(usersixsymbolsnumber);
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage putCursorCreatePasswordFieldRecoveryFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_CREATE_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage fillCreatePasswordFieldRecoveryFrame(String userpassword) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_CREATE_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpassword);
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage putCursorConfirmPasswordFieldRecoveryFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable
                        (By.xpath(PUT_CURSOR_INTO_CONFIRM_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage fillConfirmPasswordFieldRecoveryFrame(String userpassword) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_CONFIRM_PASSWORD_FIELD_RECOVERY_FRAME_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userpassword);
        return new MainForgotPasswordPage(driver);
    }

    public MainForgotPasswordPage pressEnterButtonRecoveryFrame() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ENTER_BUTTON_RECOVERY_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainForgotPasswordPage(driver);
    }

    public void getPassportFieldRecoveryFrameErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath
                (GET_PASSPORT_FIELD_RECOVERY_FRAME_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Использованы недопустимые символы";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
}
