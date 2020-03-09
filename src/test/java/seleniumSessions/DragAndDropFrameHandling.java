package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropFrameHandling 
{
	@Test
	public void dragDropFrameHandling() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//Finding the frame information
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		//Switching to the frame
		driver.switchTo().frame(iframe);
		//Finding the source and traget element so that can perform drag and drop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//Performing drag and drop
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		//Coming back to parent frame
//		driver.switchTo().parentFrame();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
