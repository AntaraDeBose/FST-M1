	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Activity5_2 {
		
		public static void main(String[] args) {
	//Create a WebDriver instance, named driver, with the FirefoxDriver().
			WebDriver driver=new FirefoxDriver();
	//Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
			driver.get("https://training-support.net/selenium/dynamic-controls");
	//Get the page title and print it to the console.
			String Title= driver.getTitle();
			System.out.println("Program execution starts from here");
			System.out.println("Page title: "+Title);
	//Use findElement() to find the checkbox input element.
			WebElement checkbox=driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
	//Use the isSelected() method to check if the checkbox is selected.
			System.out.println("The checkbox is selected -"+checkbox.isSelected());
	//Click the checkbox to select it.
			System.out.println("Selected checkbox");
			checkbox.click();
	//Use the isSelected() method again and print the result.
			System.out.println("The checkbox is selected -"+checkbox.isSelected());
	//Close browser
			System.out.println("Closing browser");
			driver.close();

}
	}
