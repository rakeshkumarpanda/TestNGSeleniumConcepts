package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling 
{
	@Test
	public void webtableHandling() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		List<WebElement> tableIDs = driver.findElements(By.xpath("//table[@id='task-table']//td[1]"));
		for(WebElement x:tableIDs)
		{
//			System.out.println(x.getText());
			if(x.getText().equals("2"))
			{
				String xpath = "//table[@id='task-table']//td[contains(text(),'"+x.getText()+"')]/following-sibling::td[3]";
				System.out.println(driver.findElement(By.xpath(xpath)).getText());		
			}
		}
		
		
		
//		Thread.sleep(3000);
		driver.close();
	}

}
