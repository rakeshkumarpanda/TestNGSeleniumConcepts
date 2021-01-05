package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void browserLaunching()
	{
		String browser = "chrome";
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("headless"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setHeadless(true);
			driver = new ChromeDriver(chromeOptions);
		}
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
	}
	
	@AfterClass
	public void browserTeardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
