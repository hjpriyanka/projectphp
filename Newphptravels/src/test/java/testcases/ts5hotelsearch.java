package testcases;


import org.testng.annotations.Test;
import Automationtest.Newphptravels.HotelsSearch;
import Automationtest.Newphptravels.Launch;


public class ts5hotelsearch extends HotelsSearch {
	
Launch l1=new Launch();
HotelsSearch hs1=new HotelsSearch();

@Test
public void hsmethod() throws Exception {
	Launch.Launchbrowser();
	HotelsSearch.Hotel_search();
}

}
