import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver=new FirefoxDriver();
//Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
		driver.get("https://training-support.net/selenium/dynamic-controls");
//Get the page title and print it to the console.
		String Title= driver.getTitle();
		System.out.println("Page title: "+Title);
//Use findElement() to find the checkbox input element.
		WebElement checkbox=driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/label"));
//Use the isDisplayed() method to check if it is visible on the page.
		System.out.println("The checkbox is displayed -"+checkbox.isDisplayed());

//Click the "Remove Checkbox".
		WebElement removecheck=driver.findElement(By.id("toggleCheckbox"));
		System.out.println("Toggled checkbox");
		removecheck.click();
		//Print the result of the isDisplayed() method again.
		System.out.println("The checkbox is displayed -"+checkbox.isDisplayed());
		//Close browser
		System.out.println("Closing browser");
		driver.close();
	}
}


