package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeHeadless 
{
	@Test
	public void chromeHeadless()
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver = new ChromeDriver(co);// Up casting
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
		System.out.println("Title of the webpage is :"+driver.getTitle());
		driver.close();
	}

}
