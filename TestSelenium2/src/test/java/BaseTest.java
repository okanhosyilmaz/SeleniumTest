import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeAll
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver","src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver.manage().window().maximize();
        options.addArguments("disable-popup-blocking");
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");


    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static WebDriver setWebDriver(WebDriver driver){
        return driver;
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
