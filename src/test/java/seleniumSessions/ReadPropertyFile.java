package seleniumConcepts;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile 
{
	@Test
	public void readPropertyFile() throws IOException
	{
		String propertyFile = System.getProperty("user.dir")+"\\src\\main\\resources\\Data.properties";
		Reader reader = new FileReader(propertyFile);
		
		//Code
		Properties prop= new Properties();
		prop.load(reader);
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
	}

}
