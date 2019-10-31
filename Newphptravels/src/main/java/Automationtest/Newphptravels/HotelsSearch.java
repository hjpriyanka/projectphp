package Automationtest.Newphptravels;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HotelsSearch extends Launch{
    
    static By HotelsButton=By.xpath("//a[@class='text-center hotels active']");
    static By destination=By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
    static By checkin=By.xpath("//input[@id='checkin']");
 
    public static void Hotel_search() throws Exception {
        
        //Hotel_Button
         driver.findElement(HotelsButton).click();
         driver.findElement(destination).click();
         driver.findElement(destination).sendKeys("Delhi");
         driver.findElement(destination).sendKeys(Keys.DOWN);
         Thread.sleep(2000);
         driver.findElement(destination).sendKeys(Keys.ENTER);
         
        
        //For Check_in &checkout
        driver.findElement(checkin).click();
        driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Dec')]")).click();
        driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'12')]")).click();
        driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[14]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]")).click();
    
   
    /*public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Launchbrowser();
        Hotel_search();
    }
 */
    }
}