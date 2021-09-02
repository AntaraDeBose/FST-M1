import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
/*
Open a browser with https://training-support.net/selenium/ajax
Get the title of the page using driver.getTitle() and print out the title.
		Find and click the "Change content" button on the page.
		Wait for the text to say "HELLO!". Print the message that appears on the page.
		Wait for the text to change to contain "I'm late!". Print the new message on the page.
		Finally, close the browser.
*/
	
	public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	WebDriverWait wait=new WebDriverWait(driver,30);
	driver.get("https://training-support.net/selenium/ajax");
	System.out.println("The title of the page is: "+driver.getTitle());
	WebElement ibutton= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
	ibutton.click();
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
	String expectedtext=driver.findElement(By.id("ajax-content")).getText();
	System.out.println("The text displayed : "+expectedtext);
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	String newtext=driver.findElement(By.id("ajax-content")).getText();
	System.out.println("The text displayed : "+newtext);
	System.out.println("Closing browser");
	driver.close();
	
		

	}

}
