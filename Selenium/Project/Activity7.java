package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {
/*
Open the browser to the Alchemy CRM site and login.
Navigate to Sales -> Leads
In the table, find the Additional information icon at the end of the row of the lead
information. Click it.
Read the popup and print the phone number displayed in it.
Close the browser
*/
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'bigbutton\']")).click();
	    driver.findElement(By.id("grouptab_0")).click();
	    driver.findElement(By.id("moduleTab_9_Leads")).click();
	    driver.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(driver,100);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")));
        WebElement AdditionalInfo=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span"));
        AdditionalInfo.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.phone")));
        System.out.println("Phone no details: "+driver.findElement(By.cssSelector("span.phone")).getText());
       driver.close();
	}

}
