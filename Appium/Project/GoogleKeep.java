package appiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleKeep {
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	void beforeClass() throws MalformedURLException {
		DesiredCapabilities deCaps = new DesiredCapabilities();
		deCaps.setCapability("deviceName", "MobilePixel4Emu");
		deCaps.setCapability("platformName", "Android");
		deCaps.setCapability("automationName", "UiAutomator2");
		deCaps.setCapability("appPackage", "com.google.android.keep");
		deCaps.setCapability("appActivity", ".activities.BrowseActivity");
		
		URL appServer = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, deCaps);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	void googleKeep() throws InterruptedException {
		// Add task
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("new_note_button"))).click();
		// Title
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("title_editor_fragment"))).sendKeys("Do not add");
		// Back
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		Thread.sleep(1000);
		List<MobileElement> keepItems = driver.findElementsById("index_note_title");
		Assert.assertEquals(keepItems.get(0).getText(), "Do not add");
	}
	
	@AfterClass
	void afterClass() {
		driver.quit();
	}
}
