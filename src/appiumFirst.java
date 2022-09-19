import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import static org.testng.Assert.assertEquals;
    public class appiumFirst {
        AppiumDriver driver;
        @BeforeTest
        public void initializer() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("deviceName", "Pixel XL API 31");
            capabilities.setCapability("appPackage", "Pixel XL API 31");
            capabilities.setCapability("appActivity", "Pixel XL API 31");
            driver = new AndroidDriver(new URL("http://172.0.0.0:4723/wd/hub"), capabilities);
            System.out.println("Opening Appium Server");
        }
        @Test (priority = 2)
        public <val1>void minusNumbers() {
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"minus\"]")).click();
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
            val1 result = (val1) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
            assertEquals("1", result);
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]")).click();
        }
        @Test (priority = 3)
        public <val3> void multiplyNumbers() {
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
            driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
            driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
            val3 result = (val3) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
            assertEquals("12", result);
        }
    }


