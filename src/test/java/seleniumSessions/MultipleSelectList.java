package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectList 
{
	@Test
	public void multipleSelectList() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//Identifying the multi select list
		WebElement stateList = driver.findElement(By.name("States"));
		
		//Scroll down until state list is visible to user on UI
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", stateList);
		
		//Handling Multi List
		Select sel = new Select(stateList);
		
		
		//Is Multiple?
		System.out.println(sel.isMultiple());
		
		//Getting all the options
		List<WebElement> options = sel.getOptions();
		
		//Iterating options reference for getting the texts
		for(WebElement x:options)
		{
			//Printing all the options present in list
//			System.out.println(x.getText());
			//Select all the options
//			sel.selectByVisibleText(x.getText());
			if(x.getText().equals("Florida")||x.getText().equals("Ohio"))
				continue;
			sel.selectByVisibleText(x.getText());
		}
		//Getting the all selected options
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for(WebElement x:allSelectedOptions)
			System.out.println(x.getText());
		
		//Deselecting all the selected options
		sel.deselectAll();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
