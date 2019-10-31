package Automationtest.Newphptravels;

import org.apache.log4j.Logger;

//import java.io.IOException;

import org.openqa.selenium.By;

public class Homepage extends Launch {
	 public static Logger log=Logger.getLogger(Launch.class);
	static By MyAccount= By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	static By Signupbutton=By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]");
    static By loginbutton=By.xpath("//a[@class='dropdown-item active tr']");
	static By Homebutton=By.xpath("//span[contains(text(),'Hotels')]");
	public static void Signup() {
		driver.findElement(MyAccount).click();	
		//driver.manage().window().maximize();
		driver.findElement(Signupbutton).click();		
		}
	public static void login() {
		driver.findElement(MyAccount).click();	
		driver.findElement(loginbutton).click();

}
/*public static void main(String args[]) throws IOException
{
	Launchbrowser();
	//Signup();
	login();
}*/
}