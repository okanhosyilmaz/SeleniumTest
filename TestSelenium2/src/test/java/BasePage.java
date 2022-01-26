import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseTest{

    public
    BasePage(WebDriver driver, WebDriverWait wait) {

        this.driver=driver;

        this.wait=wait;
    }

    public BasePage() {
    }

    public WebElement find(By by){

        return driver.findElement(by);

    }

    public void click(By id){

        find(id).click();


    }

    public void search(By by , String text){

        find(by).sendKeys(text);

    }



}
