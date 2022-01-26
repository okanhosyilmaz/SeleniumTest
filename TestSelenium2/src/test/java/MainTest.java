import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest extends BasePage{

    By searchBox = By.id("search_input");
    By searchButton = By.cssSelector("button[class='searchButton']");
    By pickProduct = By.cssSelector("a[data-optionid='2213642']");
    By pickSize = By.cssSelector("a[size='L']");
    By addCart = By.id("pd_add_to_cart");
    By goCart = By.cssSelector("a[class='header-cart']");
    By goPayment = By.cssSelector("a[class='main-button mt-15']");
    //By sendMail = By.xpath("//input[@name=email][@class=text-input input-error]");
    By sendMail = By.cssSelector("input[data-tracking-label='GirişEmail']");
    //By sendPassword = By.xpath("//input[@name=password][@class=text-input input-error]");
    By sendPassword = By.cssSelector("input[data-tracking-label='GirişSifre']");
    //By clickLogin = By.xpath("//button[@class=button login-button mb-3 text-uppercase]");
    By clickLogin = By.cssSelector("button[class='button login-button mb-3 text-uppercase']");
    @Test
    public void test() throws InterruptedException{

        click(searchBox);
        search(searchBox,"Erkek Ceket");
        click(searchButton);
        click(pickProduct);
        click(pickSize);
        click(addCart);
        click(goCart);
        click(goPayment);
        search(sendMail,"okan.hosyilmaz@gmail.com");
        search(sendPassword,"okan+2129");
        click(clickLogin);










    }


}
