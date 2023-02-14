package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium04 {
    @Test
    public void test() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        //     desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        //      desiredCapabilities.setCapability("platformName", "Android");


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy J7 Prime");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sezgin.varli\\IdeaProjects\\mobileTestingOdeal\\src\\Apps\\Gesture Tool_1.3_Apkpure.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true"); // noReset işlemi ne demek ; uygulamayı her seferinde yüklemsini istemiyorsak "true" yaparız
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL(" http://127.0.0.1:4723/wd/hub"), desiredCapabilities);


        Thread.sleep(5000);



    }
}
