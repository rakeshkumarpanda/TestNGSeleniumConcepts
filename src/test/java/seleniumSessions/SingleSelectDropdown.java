package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleSelectDropdown 
{
	@Test
	public void singleSelectDropdown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//Finding out the drop down as webelement
		WebElement dayDropdown = driver.findElement(By.id("select-demo"));
		
		//Creating the object of select class
		Select sel = new Select(dayDropdown);
		
		//Finding the drop down is multi selectable
		System.out.println(sel.isMultiple());
		
		//Getting 1st selected option
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//Selecting by index
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		//Selecting by value: Value can get from the value attribute
		sel.selectByValue("Thursday");
		Thread.sleep(3000);
		
		//Selecting by visible text
		sel.selectByVisibleText("Sunday");
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
