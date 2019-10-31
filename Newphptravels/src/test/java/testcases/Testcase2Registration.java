package testcases;


import org.testng.annotations.Test;
import Automationtest.Newphptravels.Homepage;
import Automationtest.Newphptravels.Launch;
import Automationtest.Newphptravels.Resgistrationpage;

public class Testcase2Registration extends Resgistrationpage{
	Launch l2=new Launch();
	Homepage l1=new Homepage();
	Resgistrationpage r1=new Resgistrationpage();
	
   @Test
	public void method1() throws Exception {
	   Launch.Launchbrowser();
		 Homepage.Signup();
	 Resgistrationpage.Registration();
	}
  
}
