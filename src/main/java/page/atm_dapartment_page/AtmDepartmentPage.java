package page.atm_dapartment_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page.main_page.MainPage;

import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class AtmDepartmentPage extends MainPage {
    public AtmDepartmentPage(WebDriver driver) {
        super(driver);
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private static final String PRESS_ATMS_AND_DEPARTMENTS_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[1]/div[1]/div[1]/a";
    private static final String PRESS_COOKIES_BUTTON_XPATH_LOCATOR = "//*[@id='root']/div[5]/button";
    private static final String PRESS_YOUR_REGION_BUTTON_XPATH_LOCATOR = "//*[@id='root']/div[2]/div[2]/button[1]";
    private static final String PRESS_COLLAPSE_FILTERS_FRAME_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/div[1]/div[2]/div//*[name()='svg']";
    private static final String PRESS_EXPAND_FILTERS_FRAME_BUTTON_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/div[1]/div[2]/div//*[name()='svg']";
    private static final String PRESS_PAY_FILTER_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/div[2]/div[1]/div[2]/button";
    private static final String PRESS_AROUND_THE_CLOCK_FILTER_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/div[2]/div[2]/div[3]/button";
    private static final String PRESS_OBJECT_ON_MAP_XPATH_LOCATOR = "//*[@id='root']/div[4]/div[1]/div[4]/div";
    private static final String FILL_FIND_BY_ADDRESS_FIELD_XPATH_LOCATOR = "//*[@id='SearchCities']";
    private static final String GET_FIND_BY_ADDRESS_FIELD_ERROR_MESSAGE_XPATH_LOCATOR =
            "//*[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]";
    private static final String PRESS_FIRST_ELEMENT_LOCATION_XPATH_LOCATOR = "//*[@id='SearchCities-option-0']";


    public AtmDepartmentPage pressAtmsAndDepartmentsButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_ATMS_AND_DEPARTMENTS_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressCookiesButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_COOKIES_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressYourRegionYesButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_YOUR_REGION_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressCollapseFiltersFrameButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_COLLAPSE_FILTERS_FRAME_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressExpandFiltersFrameButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_EXPAND_FILTERS_FRAME_BUTTON_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressPayFilter() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_PAY_FILTER_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressAroundTheClockFilter() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_AROUND_THE_CLOCK_FILTER_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressObjectOnMapFilter() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_OBJECT_ON_MAP_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage fillFindByAddressField(String userchosenaddress) {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath(FILL_FIND_BY_ADDRESS_FIELD_XPATH_LOCATOR)));
        wait.until(condition)
                .sendKeys(userchosenaddress);
        return new AtmDepartmentPage(driver);
    }

    public AtmDepartmentPage pressFirstElementLocationButton() {
        ExpectedCondition<WebElement> condition =
                ExpectedConditions.elementToBeClickable(By.xpath(PRESS_FIRST_ELEMENT_LOCATION_XPATH_LOCATOR));
        wait.until(condition)
                .click();
        return new AtmDepartmentPage(driver);
    }

    public void getFindByAddressFieldErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(GET_FIND_BY_ADDRESS_FIELD_ERROR_MESSAGE_XPATH_LOCATOR));
        String expectedMessageText = "Банкомат №2";
        Assert.assertEquals(errorMessage.getText(), expectedMessageText, "Verify error message");
    }
}
