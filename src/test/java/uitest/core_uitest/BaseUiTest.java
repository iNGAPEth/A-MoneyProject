package uitest.core_uitest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseUiTest {
    protected WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)
    public void initTest() {
        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void openSite() {
        driver.get("http://172.17.1.37/");
    }

    @BeforeMethod(alwaysRun = true)
    public void makeMaxSize() {
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
