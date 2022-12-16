package page.main_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.core_page.BasePage;

import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class MainSliderPage extends BasePage {
    public MainSliderPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_LOGO_BUTTON_XPATH_LOCATOR = "//*[@id='root']/div[1]/a/div/div";
    private static final String PRESS_FIRST_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/nav/button[1]";
    private static final String PRESS_FIRST_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[4]/button";
    private static final String PRESS_SECOND_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/nav/button[2]";
    private static final String PRESS_SECOND_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[4]/button";
    private static final String PRESS_THIRD_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/nav/button[3]";
    private static final String PRESS_THIRD_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[4]/button";
    private static final String PRESS_FOURTH_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[6]/nav/button[4]]";
    private static final String PRESS_FOURTH_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR =
            "//*[@id='root']/div[2]/div[5]/div[3]/button";

    public MainSliderPage pressLogoButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_LOGO_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressFirstSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_FIRST_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressFirstLearnMoreSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_FIRST_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressSecondSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_SECOND_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressSecondLearnMoreSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_SECOND_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressThirdSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_THIRD_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressThirdLearnMoreSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_THIRD_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressFourthSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_FOURTH_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }

    public MainSliderPage pressFourthLearnMoreSliderButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath
                        (PRESS_FOURTH_LEARN_MORE_BUTTON_SLIDER_REGISTER_FRAME_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new MainSliderPage(driver);
    }
}
