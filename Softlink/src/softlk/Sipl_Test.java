package softlk;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sipl_Test {
	
	//WebDriver driver=new FirefoxDriver();
	
	String Title;
	SIPLOverview OverviewObject=new SIPLOverview();

	@Before
	public void setUp() throws Exception {
		OverviewObject.get();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
	SIPLOurValues ObjOurValues =OverviewObject.OverView();
	SIPLVision Vision_obj=ObjOurValues.OurValues();
	Management_Team_Page_Object team_obj=Vision_obj.Vision();
	News_Page_Object news_Obj=team_obj.Management_Team();
	Clients_Page_Object client_Obj=news_Obj.News();
	Contact_Page_Object contact_Obj=client_Obj.Clients();
	contact_Obj.Contacts();
		
		System.out.println("Company Overview !!!!");
		//driver.navigate().back();
		
		System.out.println("Overview To Home Page !!!!");
		
		
	}
	


}
