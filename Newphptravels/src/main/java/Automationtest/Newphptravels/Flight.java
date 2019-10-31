package Automationtest.Newphptravels;

//import java.io.IOException;
import org.openqa.selenium.By;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Flight extends Launch {
	public static Logger log=Logger.getLogger(Launch.class);
	static By flightbutton=By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a");
	static By location1=By.xpath("//div[@id='s2id_location_from']");
	static By location1a=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
	static By location2=By.xpath("//div[@id='s2id_location_to']");
	static By location2a=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
	
	public static void FLIGHTsearch() throws InterruptedException
	{PropertyConfigurator.configure("C:\\Users\\Online Test\\Desktop\\swapnil\\Newphptravels\\src\\main\\resources\\log4j.properties");
		driver.manage().window().maximize();
		//from field
		driver.findElement(flightbutton).click();
		driver.findElement(location1).click();
		driver.findElement(location1a).sendKeys(prop.getProperty("Location1"));
		driver.findElement(location1a).sendKeys(Keys.DOWN);
    	Thread.sleep(1000);
    	driver.findElement(location1a).sendKeys(Keys.ENTER);
    	
    	//to location
    	driver.findElement(location2).click();
		driver.findElement(location2a).sendKeys(prop.getProperty("Location2"));
		driver.findElement(location2a).sendKeys(Keys.DOWN);
    	Thread.sleep(1000);
    	driver.findElement(location2a).sendKeys(Keys.ENTER);
	
    	//departure date
    	driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
        driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
        for(int i = 1 ; i<=35 ; i++) {            
             String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();            
             if(str1.equals("1")) {                
                 for(int j = i ; j<=35 ; j++) {                    
                     str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                        
                     if(str1.equals("15")) {                        
                         driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                        
                         break;
                         }                
                }
             }    
         }
    	
        //adults & children count
        driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();   
        driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();
        driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn btn-block')]")).click();
        log.info("flight details");
        String title=driver.getTitle();
        log.info(title);
       Assert.assertEquals(title,"Flights Results - From to MAA to BGR" );
	}
	}

