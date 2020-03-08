package seleniumSessions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.testng.annotations.Test;

public class WebDriverInterface 
{
	@Test
	public void webdriverInterface()
	{
		WebDriver driver = new WebDriver() {
			
			public TargetLocator switchTo() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void quit() {
				// TODO Auto-generated method stub
				
			}
			
			public Navigation navigate() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Options manage() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Set<String> getWindowHandles() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getWindowHandle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getPageSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getCurrentUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void get(String url) {
				// TODO Auto-generated method stub
				
			}
			
			public List<WebElement> findElements(By by) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public WebElement findElement(By by) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
