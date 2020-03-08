package seleniumSessions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.Test;

public class OptionsInterface 
{
	@Test
	public void optionsInterface()
	{
		Options opt = new Options() {
			
			public Window window() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Timeouts timeouts() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Logs logs() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ImeHandler ime() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Set<Cookie> getCookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Cookie getCookieNamed(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void deleteCookieNamed(String name) {
				// TODO Auto-generated method stub
				
			}
			
			public void deleteCookie(Cookie cookie) {
				// TODO Auto-generated method stub
				
			}
			
			public void deleteAllCookies() {
				// TODO Auto-generated method stub
				
			}
			
			public void addCookie(Cookie cookie) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
