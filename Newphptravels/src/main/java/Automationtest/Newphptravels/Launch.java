package Automationtest.Newphptravels;

import java.io.FileInputStream;



import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	 public static Logger log=Logger.getLogger(Launch.class);
	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	
	public static void Launchbrowser() throws IOException{ 
		PropertyConfigurator.configure("C:\\Users\\Online Test\\Desktop\\swapnil\\Newphptravels\\src\\main\\resources\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\pp\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launching chrome browser");
	    FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\Desktop\\swapnil\\Newphptravels\\src\\main\\java\\files\\data.properties");
	    prop.load(fis);
	    driver.get(prop.getProperty("HOST"));
	    log.info("entering application url");
	    //driver.manage().window().maximize();
	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Launchbrowser();
		
		

	}*/

}
