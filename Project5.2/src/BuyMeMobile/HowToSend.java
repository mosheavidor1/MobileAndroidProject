package BuyMeMobile;



import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HowToSend {

    private WebDriver driver;
    public static WebElement element = null;


    public static void RadioButton(WebDriver driver) {
        driver.findElement(By.id("il.co.mintapp.buyme:id/nowRadioButton")).click();


    }


    public static void ByEmail(WebDriver driver) {

        int i = 0;

        List<MobileElement> allOptions = driver.findElements(By.id("il.co.mintapp.buyme:id/optionCheckBox"));
        for (WebElement we : allOptions) {
            i++;
            if (i == 3) {
                we.click();


            }
        }
    }



    public static void ByEmail_2(WebDriver driver) {


        driver.findElement(By.className(HowToSendConst.Email)).sendKeys("mosheavidor83@gmail.com");





    }

    public static void FinalClick(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);


        driver.findElement(By.className("android.widget.Button")).click();

    }}