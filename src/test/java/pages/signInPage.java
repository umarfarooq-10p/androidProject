import base.AppDriver;
import base.AppFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import testcases.Signintest;

import java.time.Duration;

public class Signinpage {

    @FindBy(id = "userid") WebElement Username;

    @FindBy(id = "pass") WebElement Password;

    @FindBy(id = "sgnBt") WebElement signInButton;

    By by_pageHeader = By.id("com.carfirst.dealer:id/login_welcome_to_message");

    public void EnterValidEmailAddress() {
         new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
          Username.sendKeys("test77soft+4@gmail.com");
    }

    public void Enterpassword() {
        Password.sendKeys("U1234567");
    }

    public void click_on_login_button() {
        signInButton.click();
    }

}






