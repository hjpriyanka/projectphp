package testcases;

import org.testng.annotations.Test;
import Automationtest.Newphptravels.Homepage;
import Automationtest.Newphptravels.Launch;
import Automationtest.Newphptravels.Loginpage;
public class testcase1login extends Homepage {
	
	Launch l1=new Launch();
	Loginpage l2=new Loginpage();
	
	@Test
	public void test1() throws Exception 
	{	Launch.Launchbrowser();
		l2.LoggingIn();
		}
}
