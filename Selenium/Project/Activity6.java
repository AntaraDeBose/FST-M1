package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
/*
Open a browser.
Navigate to ‘ http://alchemy.hguy.co/crm ’ and login using the credentials
provided.
Locate the navigation menu.
Ensure that the “Activities” menu item exists.
Close the browser
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
		WebElement menu=driver.findElement(By.id("toolbar"));
		WebElement ioption=driver.findElement(By.id("grouptab_3"));
		String ivalue= ioption.getText();
		System.out.println(ivalue);
		driver.close();
	}

}
