package Automationtest.Newphptravels;

import java.io.File;

//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Loginpage extends Homepage{
	Logger log=Logger.getLogger(Loginpage.class);
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By loginclick=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");

	public void LoggingIn() throws InterruptedException, Exception{
		//driver.findElement(cookies).click();
	driver.findElement(MyAccount).click();
	driver.findElement(loginbutton).click(); 
	driver.findElement(email).sendKeys(prop.getProperty("email"));
	driver.findElement(password).sendKeys(prop.getProperty("pass"));
	driver.findElement(loginclick).click(); 

	Thread.sleep(4000);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(src, new File("C:\\priyanka"));
	}
	
	/*public static void main(String args[]) throws Exception {
		Launchbrowser();
		//Signup();
		//login();
		LoggingIn();
	}
*/
}
