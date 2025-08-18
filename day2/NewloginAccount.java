package SeleniumAutomationclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewloginAccount {
	
	
	public static void main(String [] args) {

		
		FirefoxDriver driver1 =new FirefoxDriver();
		driver1.get("http://leaftaps.com/opentaps/");
		driver1.manage().window().maximize();

	
		driver1.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver1.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.partialLinkText("SFA")).click();
		driver1.findElement(By.linkText("Accounts")).click();
		driver1.findElement(By.linkText("Create Account")).click();
		driver1.findElement(By.id("accountName")).sendKeys("Bhanus Testleaf");
	driver1.findElement(By.name("description")).sendKeys(" Selenium Automation Tester");
	driver1.findElement(By.id("numberEmployees")).sendKeys("200");
driver1.findElement(By.id("officeSiteName")).sendKeys("Leaf Taps");
driver1.findElement(By.className("smallSubmit")).click();
String title =driver1.getTitle();
System.out.println(title);
((RemoteWebDriver) driver1.manage().window()).close();

}}
