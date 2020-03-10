package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupHandling 
{
	@Test
	public void popupHandling() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//Finding the web element for getting pop up
		WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
		alertButton.click();
		//Getting the text from alert box
//		System.out.println(driver.switchTo().alert().getText());
		
		//Entering the value to the text box
		driver.switchTo().alert().sendKeys("Selenium");
		
		//Clicking on OK button: it means accepting the alert
		driver.switchTo().alert().accept();
		
		//Code for scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", alertButton);
		
		//Clicking on Cancel button: it means dismissing the alert
//		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
