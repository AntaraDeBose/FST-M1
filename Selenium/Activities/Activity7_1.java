import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	/*
Open a browser with https://training-support.net/selenium/dynamic-attributes
Get the title of the page using driver.getTitle() and print out the title.
Find the username and password input fields. 
Type in the credentials:
username: admin
password: password
Wait for login message to appear and print the login message to the console.
Finally, close the browser.
	 */
public static void main(String[] args) {
WebDriver driver= new FirefoxDriver();
driver.get("https://training-support.net/selenium/dynamic-attributes");
String iTitle= driver.getTitle();
System.out.println("The title of the page is: "+iTitle);
WebElement username=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input"));
username.sendKeys("admin");
WebElement password=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input"));
password.sendKeys("password");
WebElement submit=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
submit.click();
WebDriverWait wait= new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
String message= driver.findElement(By.id("action-confirmation")).getText();
System.out.println("The login message appeared as :"+message);
driver.close();


	}

}
