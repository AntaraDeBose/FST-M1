import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver=new FirefoxDriver();
		
//Open a browser with https://www.training-support.net/selenium/target-practice
		driver.get("https://www.training-support.net/selenium/target-practice");
//Get the title of the page using driver.getTitle() and print out the title.
		System.out.println("The title of the page is "+driver.getTitle());
//Use findElement() with xpath() to
//Find the third header on the page.
		String third_header=driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
		System.out.println("The third header is: "+third_header);
//Find the fifth header on the page and get it's 'colour' CSS Property.
		String fifthheader_color=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
		System.out.println("The color of the fifth element is: "+fifthheader_color);
//Find the violet button on the page and print all the class attribute values.
		String violetbutton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
		System.out.println("The classes of Violet Button "+violetbutton);
//Find the grey button on the page with Absolute XPath.
		String greybutton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("The text of grey button is "+greybutton);
//Close the browser
		driver.close();
		System.out.println("Browser Closed");
	}

}
