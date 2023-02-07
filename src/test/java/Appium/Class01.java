package Appium;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Class01 {

    @Test
    public void test() {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        //     desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        //      desiredCapabilities.setCapability("platformName", "Android");


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy J7 Prime");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"");

    }
}
