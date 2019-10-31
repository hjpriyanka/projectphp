package testcases;


import org.testng.annotations.Test;
import Automationtest.Newphptravels.Flight;
import Automationtest.Newphptravels.Launch;
public class testcase3flightsearch extends Flight{
	Launch l1=new Launch();
	Flight fs1=new Flight();
	
	
@Test
public void hsmethod() throws Exception
	{Launch.Launchbrowser();
	Flight.FLIGHTsearch();	
	}


}
