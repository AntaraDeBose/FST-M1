package seleniumprojects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'bigbutton\']")).click();
	    driver.findElement(By.id("grouptab_0")).click();
	    driver.findElement(By.id("moduleTab_9_Leads")).click();
	   
	    WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table [@class='list view table-responsive']")));
		int n=10;
		for (int i = 1; i <= n; i++) {
			 
				
				WebElement nameValue=driver.findElement(By.xpath("//table [@class='list view table-responsive']/tbody/tr["+i+"]/td[@type='name']"));
				String userName=nameValue.getText();
				System.out.print("User Name  from :"+i+" row is "+userName);
				WebElement userValue=driver.findElement(By.xpath("//table [@class='list view table-responsive']/tbody/tr["+i+"]/td[@type='relate']"));
				String userLevel=userValue.getText();
				System.out.print("  & User permission level from "+i+" row is "+userLevel);
				System.out.println();
		}
//				System.out.println("Iteration is :"+i);
				driver.close();

	}
}