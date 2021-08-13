package seleniumprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

/*
Open a browser.
Navigate to ‘ http://alchemy.hguy.co/crm ’.
Get the title of the website.
Make sure it matches “SuiteCRM” exactly.
If it matches, close the browser.
*/
	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		String iTitle= driver.getTitle();
		System.out.println("Title:"+iTitle);
				String Title= "SuiteCRM";
		
				if(iTitle.equalsIgnoreCase(Title))
					System.out.println("Title Matched");
				else
					System.out.println("Title didn't match");
		
		driver.close();
		
	}
}
