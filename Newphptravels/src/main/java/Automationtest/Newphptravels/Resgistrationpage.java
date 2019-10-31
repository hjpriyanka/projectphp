package Automationtest.Newphptravels;
import java.io.File;

///import java.io.IOException;

//import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class Resgistrationpage extends Homepage {
	 public static Logger log=Logger.getLogger(Resgistrationpage.class);

	static By firstName= By.xpath("//input[@placeholder='First Name']");
	static By lastName=By.xpath("//input[@placeholder='Last Name']");
	static By MobileNumber=By.xpath("//input[@placeholder='Mobile Number']");
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
    static By submit=By.xpath("//*[@id=\"headersignupform\"]/div[9]/button");
    static By Cookie=By.xpath("//*[@id='cookyGotItBtnBox']/div/button");

	public static void Registration() throws Exception
	{   PropertyConfigurator.configure("C:\\Users\\Online Test\\Desktop\\swapnil\\Newphptravels\\src\\main\\resources\\log4j.properties");
	    driver.findElement(firstName).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(lastName).sendKeys(prop.getProperty("lastname"));
		driver.findElement(MobileNumber).sendKeys(prop.getProperty("Mobile"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("passWORD"));
	    driver.findElement(confirmpassword).sendKeys(prop.getProperty("confrmpass"));
		driver.findElement(submit).sendKeys(Keys.ENTER);
		log.info("AFTER SUBMISSION");
		
		
		//assertion
		String title=driver.getTitle();
        log.info(title);
        Assert.assertEquals(title,"Register" );
       
		//for pageup
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
		//screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("C:\\priyanka"));
		log.info("screenshottime");
	}
	/*public static void main(String[] args) throws IOException{
		
		Launchbrowser();
		Signup();
		Registration();
	}*/

	
	
}
