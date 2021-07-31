import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
//Opening "https://training-support.net/selenium/simple-form"
		driver.get("https://training-support.net/selenium/simple-form");
//Print the title
		String Title= driver.getTitle();
		System.out.println("Printing the title: "+Title);
//Use findElement() with name() to find the text fields - firstname and lastname.
		WebElement fname=driver.findElement(By.id("firstName"));
		WebElement lname=driver.findElement(By.id("lastName"));
//Use WebElement.sendKeys() to type in those text fields.
		fname.sendKeys("First Name");
		lname.sendKeys("Last Name");
//find and type into the email and contact number fields.
		WebElement mail=driver.findElement(By.id("email"));
		WebElement number=driver.findElement(By.id("number"));
		mail.sendKeys("test@testmail.com");
		number.sendKeys("1234567890");
//click submit
		System.out.println("Clicking Submit Button");
		WebElement submit= driver.findElement(By.cssSelector(".ui.green.button"));
		submit.click();
		
			}

}
