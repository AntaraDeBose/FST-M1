import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Find the checkbox toggle button and click it.
Wait till the checkbox disappears.
Click the button again. Wait till it appears and check the checkbox.
Finally, close the browser.
*/
public class Activity6_1 {

	public static void main(String[] args) {
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
//Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
		driver.get("https://training-support.net/selenium/dynamic-controls");
//Get the page title and print it to the console.
		String Title= driver.getTitle();
		System.out.println("Program execution starts from here");
		System.out.println("Page title: "+Title);
		WebElement icheckbox=driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
		icheckbox.click();
		System.out.println("Checkbox selected");
		//Wait till the checkbox disappears.
		WebElement togglecheckbox=driver.findElement(By.id("toggleCheckbox"));
		togglecheckbox.click();
		System.out.println("Checkbox disappeared");
		togglecheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(togglecheckbox));
		System.out.println("Checkbox Reappeared");
		icheckbox.click();
		System.out.println("Checkbox selected");
		System.out.println("Exiting browser");
		driver.close();

}
}
