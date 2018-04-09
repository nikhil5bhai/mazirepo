package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropReader {
	
	@Test
	public void test1() throws IOException {
		 // Step 1: create properties object
		  Properties properties = new Properties();
		  
		//Step 2 : Load the properties file that you want to read from
		  InputStream inputStream = new FileInputStream("project.properties");
		  
		// Step 3 : link the input file to properties
		  properties.load(inputStream);
		  
		  System.out.println(properties.getProperty("browser"));
		  System.out.println(properties.getProperty("url"));
		 
		
	}

}
