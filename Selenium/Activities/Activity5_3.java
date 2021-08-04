	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Activity5_3 {
		
		public static void main(String[] args) {
	//Create a WebDriver instance, named driver, with the FirefoxDriver().
			WebDriver driver=new FirefoxDriver();
	//Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
			driver.get("https://training-support.net/selenium/dynamic-controls");
	//Get the page title and print it to the console.
			String Title= driver.getTitle();
			System.out.println("Program execution starts from here");
			System.out.println("Page title: "+Title);
	//Use findElement() to find the text field.
			WebElement text=driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
	//Use the isEnabled() method to check if the text field is enabled.	
			System.out.println("The textbox is enabled -"+text.isEnabled());
	//Click the "Enable Input" button to enable the input field.
			System.out.println("Button toggled");
			WebElement ibutton=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/button"));
			ibutton.click();
	//Use the isEnabled() method again and print the result.
			System.out.println("The textbox is enabled -"+text.isEnabled());
	//Close browser
			System.out.println("Closing browser");
			driver.close();

}
	}
