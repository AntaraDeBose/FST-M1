package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
/*
Open the browser
Navigate to ‘ https://alchemy.hguy.co/crm ’.
Find and select the username and password fields
Enter login credentials into the respective fields
Click login
Verify that the homepage has opened.
Close the browser.
*/
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement uname=driver.findElement(By.id("user_name"));
		WebElement pwd=driver.findElement(By.id("username_password"));
		uname.sendKeys("admin");
		pwd.sendKeys("pa$$w0rd");
		WebElement submit=driver.findElement(By.id("bigbutton"));
		submit.click();
		String iTitle=driver.getTitle();
		System.out.println("New window appeared as: "+iTitle);
		driver.close();
	}

}
