package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserHandling 
{
	@Test
	public void chromeBrowser() throws InterruptedException
	{
		//Launching browser
		//Below line is used to set the system property by overwriting the existing property
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rpanda\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\February2020Evening\\BrowserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		//Launching chrome browser by creating the reference and object of chromedriver class
//		ChromeDriver cd = new ChromeDriver();
		WebDriver driver = new ChromeDriver();// Up casting
		
		//Maximizing the window
//		Options manage = driver.manage();
//		Window window = manage.window();
//		window.maximize();
		driver.manage().window().maximize();
		
		//Navigating application
		//1st Approach
//		driver.get("https://www.seleniumeasy.com/");
		//2nd Approach
		driver.navigate().to("https://www.seleniumeasy.com/");
		
		//Refresh the web page
//		Thread.sleep(3000);
//		driver.navigate().refresh();
		
		//Getting the title
//		System.out.println("Title of the webpage is :"+driver.getTitle());
		
		//Getting current url
//		System.out.println("Current URL is: "+driver.getCurrentUrl());
		
		//Getting the page source code
		System.out.println(driver.getPageSource());
		
		//Closing the browser
		Thread.sleep(3000);//Waiting for 3 seconds
//		cd.close();
		driver.close();
	}

}
