import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver= new FirefoxDriver();
//Open a browser with https://www.training-support.net
		driver.get("https://www.training-support.net");
//Get the title of the page using driver.getTitle() and print out the title
		String Title= driver.getTitle();
		System.out.println("The title of the page is: "+Title);
//Use findElement() with the id() locators to find the "About Us" link:
		WebElement idlocator= driver.findElement(By.id("about-link"));
		System.out.println("The text in element(search by id): "+idlocator.getText());
//Use findElement() with the classname to find the "About Us" link:
		WebElement clslocator=driver.findElement(By.className("green"));
		System.out.println("The text in element(search by classname): "+clslocator.getText());
//Use findElement() with the linktext to find the "About Us" link:
		WebElement lnktxtlocator=driver.findElement(By.linkText("About Us"));
		System.out.println("The text in element(search by linklocator): "+lnktxtlocator.getText());
//Use findElement() with the linktext to find the "About Us" link:
		WebElement csslocate=driver.findElement(By.cssSelector(".green"));
		System.out.println("The text in element(search by csslocator): "+csslocate.getText());
//close the browser
		driver.close();


	}

}
