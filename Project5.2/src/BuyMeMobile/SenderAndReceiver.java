package BuyMeMobile;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class SenderAndReceiver {

    private WebDriver driver;
    public static WebElement element = null;


    public static void Receiver(WebDriver driver) {
        driver.findElement(By.id(SendAndReceiveConst.ReceiverName)).sendKeys("Bat-EL");


    }

    public static void Event(WebDriver driver) {
        driver.findElement(By.id("android:id/text1")).click();
    }

    public static void ChooseEvent(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='יום הולדת']")).click();


    }

    public static void Blessing(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.findElement(By.id("il.co.mintapp.buyme:id/blessEditText")).clear();

        Thread.sleep(3000);


        driver.findElement(By.id(SendAndReceiveConst.Bless)).sendKeys("Happy birthday");


    }


    public static void FromWho(WebDriver driver) throws InterruptedException {
     //   Actions action = new Actions(driver);
     //  driver.findElement(By.id("il.co.mintapp.buyme:id/userFrom")).sendKeys(Keys.DELETE);
       driver.findElement(By.id("il.co.mintapp.buyme:id/userFrom")).clear();

        driver.findElement(By.id(SendAndReceiveConst.From)).sendKeys("Moshe");

        Thread.sleep(2000);


    }

    public static void Continue(WebDriver driver) {


        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
                + ".scrollIntoView(new UiSelector().text(\"המשך\"))"));


        driver.findElement(By.id("il.co.mintapp.buyme:id/goNextButton")).click();


    }
}