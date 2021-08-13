package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
/*
Open a browser.
Navigate to ‘ http://alchemy.hguy.co/crm ’ and login using the credentials provided.
Get the color of the navigation menu and print it to the console.
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
		WebElement menu=driver.findElement(By.id("toolbar"));
		System.out.println("The color of navigation menu is: "+menu.getCssValue("color")); 
		driver.close();
	}

}
