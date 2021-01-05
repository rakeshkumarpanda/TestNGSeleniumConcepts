package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementHandling extends BrowserClass
{
	@Test
	public void webelementHandling()
	{
//		WebElement demoWebsiteLink = driver.findElement(By.linkText("Demo Website!"));
//		demoWebsiteLink.click();
		driver.findElement(By.linkText("Demo Website!")).click();
		
		driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//a[contains(text(),'Input Form Submit')]")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//label[text()='E-Mail']/following-sibling::div//input")).sendKeys("java@selenium.com");
		driver.findElement(By.xpath("//label[contains(text(),'Phone')]/following-sibling::div//input")).sendKeys("java@selenium.com");
		driver.findElement(By.xpath("//input[@value='no']")).click();
	}

}
