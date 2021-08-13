package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
Open a browser.
Navigate to ‘ http://alchemy.hguy.co/crm ’
Get the url of the header image.
Print the url to the console.
Close the browser.
*/
public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		WebElement himage=driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img"));
		System.out.println("The URL for header image is: "+himage.getAttribute("src"));
		driver.close();

	}

}
