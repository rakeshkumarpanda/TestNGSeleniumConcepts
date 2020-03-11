package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverWindowHandling 
{
	@Test
	public void mouseHoverWindowHandling() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
		//Finding companies element
		WebElement companies = driver.findElement(By.xpath("//div[contains(text(),'Companies')]"));
		
		//Mouse Hovering on companies element using actions class
		Actions act = new Actions(driver);
		act.moveToElement(companies).perform();		
		
		//Finding About Companies element and clicking
		driver.findElement(By.xpath("//div[@class='subMenu']//a[contains(text(),'About Companies')]")).click();
		
		//Finding out the window session ids and iterating them to switch to the desired window
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String window1 = itr.next();
		String window2 = itr.next();
		
		//Switching to window 2 to enter the company name
		driver.switchTo().window(window2);
		
		
		//Finding Company Name search box and entering TCS in that
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		
		
		Thread.sleep(3000);
		//Note: driver.close() is responsible to close the current focused window
//		driver.close();
		//driver.quit() kills all the browsers opened through automation
		driver.quit();
		
	}

}
