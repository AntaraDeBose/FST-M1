import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver= new FirefoxDriver();
//Open a browser with https://www.training-support.net
		driver.get("https://www.training-support.net");
//Get the title of the page using driver.getTitle() and print out the title.
		String Title= driver.getTitle();
		System.out.println("The title of the page is: "+Title);
//Use findElement() with xpath() to find and click the "About Us" link on the page.
		WebElement ielement=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a"));
		ielement.click();
		//Print the title of the new page that open when the link is clicked.
		String newtitle= driver.getTitle();
		System.out.println("The title of the new page is:"+newtitle);
		
	}

}
