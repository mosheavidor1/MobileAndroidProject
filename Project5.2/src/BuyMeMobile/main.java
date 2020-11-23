
package BuyMeMobile;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import javax.xml.parsers.ParserConfigurationException;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.FixMethodOrder;
import org.xml.sax.SAXException;

import sun.security.pkcs11.wrapper.Constants;


import java.io.IOException;
import java.net.URL;

import java.util.concurrent.TimeUnit;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)



    public class main {

    private static AndroidDriver<MobileElement> driver;
    private static ExtentReports extent;
    private static ExtentTest test;


    @BeforeClass
    public static void setUp() throws IOException, ParserConfigurationException, SAXException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(UploadXML.getData("Report"));
        extent = new ExtentReports();
        extent.attachReporter(new ExtentReporter[]{htmlReporter});
        extent.attachReporter(htmlReporter);
        test = extent.createTest(StringConstant.TestName, StringConstant.TestSummary); //Extent event log +Screenshot

        Constants constants = new Constants();
        String currentTime = String.valueOf(System.currentTimeMillis());


        boolean succsed = false;
        try {
            test.log(Status.INFO, StringConstant.UploadURL);

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability(capabilitiesConst.appPackage, UploadXML.getData("MOBILE"));
            capabilities.setCapability(capabilitiesConst.appActivity, UploadXML.getData("SPLASH"));
            driver = new AndroidDriver(new URL(capabilitiesConst.appium), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            succsed = true;
        } catch (Exception var7) {
            var7.printStackTrace();
            succsed = false;
        } finally {
            if (succsed == true) {

                test.log(Status.PASS, StringConstant.DriverUpload, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, StringConstant.DriverFailed, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());

            }

        }


    }


    @Test
    public void Test01_intro() throws InterruptedException {
        IntroAndRegistration.UploadApp(driver); //Uploading the App.

    }


    @Test
//First registration
    public void Test02_FirstReg() throws IOException {
        String currentTime = null;
        currentTime = String.valueOf(System.currentTimeMillis());
        boolean FirstReg = false;
        try {
            test.log(Status.INFO, StringConstant.RegisterToApp);
            IntroAndRegistration.reg1(driver);
            FirstReg = true;
        } catch (Exception var7) {
            var7.printStackTrace();
            FirstReg = false;
        } finally {

            if (FirstReg == true) {

                test.log(Status.PASS, StringConstant.RegisterToApp2, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, StringConstant.RegisterToApp3, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());


            }

        }

    }


    @Test
    //choosing the first category
    public void Test03_Category() throws IOException {
        String currentTime = null;
        currentTime = String.valueOf(System.currentTimeMillis());
        boolean category = false;
        try {
            test.log(Status.INFO, StringConstant.HomeScreen);
            HomeScreen.Category1(driver);
            category = true;
        } catch (Exception var7) {
            var7.printStackTrace();
            category = false;
        } finally {

            if (category == true) {

                test.log(Status.PASS, StringConstant.HomeScreen2, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, StringConstant.HomeScreen3, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());


            }

        }

    }


    @Test
    //Picking up a business
    public void Test04_Business() {
        HomeScreen.Buisness(driver);


    }

    @Test
    //set the budget
    public void Test05_Budget() {
        HomeScreen.Budget(driver);


    }

    @Test
    public void Test06_choose() {
        HomeScreen.choose(driver);

    }


    @Test
    //receivers name
    public void Test07_Receiver() throws IOException {
        String currentTime = null;
        currentTime = String.valueOf(System.currentTimeMillis());
        boolean Receiver = false;
        try {
            test.log(Status.INFO, StringConstant.SenderAndReceiver);

            SenderAndReceiver.Receiver(driver);
            Receiver = true;
        } catch (Exception var7) {
            var7.printStackTrace();
            Receiver = false;
        } finally {

            if (Receiver == true) {

                test.log(Status.PASS, StringConstant.SenderAndReceiver2, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, StringConstant.SenderAndReceiver3, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());


            }

        }
    }

    @Test
    //dropdown to the event
    public void Test08_Event() {


        SenderAndReceiver.Event(driver);


    }

    @Test
    //choose the event

    public void Test09_ChooseEvent() throws InterruptedException {
        SenderAndReceiver.ChooseEvent(driver);

    }

    @Test
    //blessing

    public void Test10_Blessing() throws InterruptedException {
        SenderAndReceiver.Blessing(driver);
        driver.hideKeyboard();


    }

    @Test
    //who is sending

    public void Test11_FromWho() throws InterruptedException {


        SenderAndReceiver.FromWho(driver);
        driver.hideKeyboard();


    }


    @Test
    //press continue

    public void Test12_Continue() {

        SenderAndReceiver.Continue(driver);

    }


    @Test
    public void Test13_RadioButton() throws IOException {
        String currentTime = null;
        currentTime = String.valueOf(System.currentTimeMillis());
        boolean RadioButton = false;
        try {

            test.log(Status.INFO, StringConstant.HowToSend);

            HowToSend.RadioButton(driver);
            RadioButton = true;
        } catch (Exception var7) {
            var7.printStackTrace();
            RadioButton = false;
        } finally {

            if (RadioButton == true) {

                test.log(Status.PASS, StringConstant.HomeScreen2, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            } else {
                test.log(Status.FAIL, StringConstant.HowToSend3, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShotClass.takeScreenShot(StringConstant.ImagePath + currentTime, driver)).build());
            }
        }
    }


    @Test
    //how to send
    public void Test14_ByEmail() {


        HowToSend.ByEmail(driver);


    }


    @Test
    public void Test15_ByEmail2() {

        HowToSend.ByEmail_2(driver);

        driver.hideKeyboard();


    }

    @Test
    //press continue
    public void Test16_FinalClick() throws InterruptedException {
        HowToSend.FinalClick(driver);


    }


    @AfterClass
    public static void tearDown() {
         driver.quit();
    extent.flush();


    }
}






