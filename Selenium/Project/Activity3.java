package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
/*
Open a browser.
Navigate to ‘ http://alchemy.hguy.co/crm ’
Get the first copyright text in the footer.
Print the text to the console.
Close the browser.
*/
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement ielement= driver.findElement(By.id("admin_options"));
		System.out.println("The text is: "+ielement.getText());
		driver.close();
	}

}
