package BuyMeMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeScreen {

    private WebDriver driver;
    public static WebElement element = null;


    public static void Category1(WebDriver driver){
    driver.findElement(By.id("il.co.mintapp.buyme:id/i_shadow")).click();
}

    public static void Buisness(WebDriver driver){
driver.findElement(By.id("il.co.mintapp.buyme:id/businessImage")).click();
}

    public static void Budget(WebDriver driver) {

        driver.findElement(By.className("android.widget.EditText")).sendKeys("100");
    }

    public static void choose(WebDriver driver){
     driver.findElement(By.id("il.co.mintapp.buyme:id/purchaseButton")).click();
    }}

