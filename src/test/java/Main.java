import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class Main {
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;


    public class myFirstTest {

        AppiumDriver driver;

        @BeforeTest
        public void initializer() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("deviceName", "Pixel XL API 30");
            capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/eBay The shopping marketplace_v6.81.0.1_apkpure.com.apk");
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            System.out.println("Opening Appium Server");

        }

        //  @BeforeTest
        public void initializer2() throws MalformedURLException {
            {

                DesiredCapabilities capabilities1 = new DesiredCapabilities();
                capabilities1.setCapability("platformName", "Android");
                capabilities1.setCapability("platformVersion", "11");
                capabilities1.setCapability("deviceName", "Pixel 5 API 31");
                capabilities1.setCapability("app", System.getProperty("user.dir") + "/apps/eBay The shopping marketplace_v6.81.0.1_apkpure.com.apk");
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), capabilities1);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Opening Appium Server");

            }

        }
        @Test (priority = 1)
        public <val> void SignUpPage() {
        }


        @Test(priority = 2)
        public <val1>void Signinpage() {

        }
    }
}
