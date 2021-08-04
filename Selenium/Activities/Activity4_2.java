import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	public static void main(String[] args) {
		
//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver=new FirefoxDriver();
//Open a browser with https://www.training-support.net/selenium/simple-form
		driver.get("https://www.training-support.net/selenium/simple-form");
//Get the title of the page using driver.getTitle() and print out the title.
		String Title=driver.getTitle();
		System.out.println("The title of the page is: "+Title);
//Use findElement() with xpath() to find all the input fields on the page.
		WebElement fname=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[1]/input"));
		WebElement lname=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[2]/input"));
		WebElement mail=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[3]/input"));
		WebElement contact=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[4]/input"));
		WebElement msg=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));
		WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input"));
//Fill in the details in the fields using the sendKeys() method.
		fname.sendKeys("User Firstname");
		lname.sendKeys("User Lastname");
		mail.sendKeys("testing@test.com");
		contact.sendKeys("9087654321");
		msg.sendKeys("Submitting the form");
//Click the submit button at the end of the form to submit the form.
		submit.click();
		System.out.println("Form submitted successfully");

	}

}
