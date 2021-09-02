import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	/*
Open a browser with https://training-support.net/selenium/dynamic-attributes
Get the title of the page using driver.getTitle() and print out the title.
Find the input fields of the Sign Up form. Fill in the details in the fields with your own data.
Wait for success message to appear and print it to the console.
Finally, close the browser.
	 */
public static void main(String[] args) {
WebDriver driver= new FirefoxDriver();
driver.get("https://training-support.net/selenium/dynamic-attributes");
String iTitle= driver.getTitle();
System.out.println("The title of the page is: "+iTitle);
WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
username.sendKeys("testing");
WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
password.sendKeys("password");
WebElement confirm=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
confirm.sendKeys("password");
WebElement mail=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
mail.sendKeys("testing@email.com");
WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));
submit.click();
WebDriverWait wait= new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
String message= driver.findElement(By.id("action-confirmation")).getText();
System.out.println("Confirmation message: "+message);
driver.close();


	}

}
