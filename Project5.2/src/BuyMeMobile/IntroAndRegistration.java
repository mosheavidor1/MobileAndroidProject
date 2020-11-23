package BuyMeMobile;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroAndRegistration {

    private WebDriver driver;
    public static WebElement element = null;

    public static void UploadApp(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")));


}

    public static void reg1(WebDriver driver) {
        driver.findElement(By.id("il.co.mintapp.buyme:id/googleButton")).click(); //Click on Register with Google.
        // driver.findElement(By.id("com.google.android.gms:id/account_name")).click(); // Click on Register with current Email.

    }






    }


