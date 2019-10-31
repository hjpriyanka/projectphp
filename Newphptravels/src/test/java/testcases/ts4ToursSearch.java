package testcases;



import org.testng.annotations.Test;
import Automationtest.Newphptravels.Launch;
import Automationtest.Newphptravels.Tours;
public class ts4ToursSearch extends Tours {
	Launch l1=new Launch();
	Tours ts1=new Tours();
	
	@Test
	public void tourmethos() throws InterruptedException, Exception {
		Launch.Launchbrowser();
		Tours.TourSearch();
}
	
	}
