package softlk;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class SIPLOverview extends LoadableComponent<SIPLOverview> {

	@FindBy(xpath="html/body/form/header/div[2]/div/nav/ul/li[1]/a")
	@CacheLookup
	WebElement Company_main_menu;
	
	@FindBy(linkText="Overview")
	@CacheLookup
	WebElement Overview_subMenu;
	
	private WebDriver driver;
	private String url="http://www.softlinkinternational.com";
	private String Title="Home Page";
	
	
	public SIPLOverview() {
		// TODO Auto-generated constructor stub
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 PageFactory.initElements(driver, this);
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertTrue(driver.getTitle().equals(Title));
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get(url);
		
	}
	
	public SIPLOurValues OverView()
	{
		Actions action=new Actions(driver);
		action.moveToElement(Company_main_menu);
		action.moveToElement(Overview_subMenu);
		action.click();
		action.perform();
		
		driver.navigate().back();
		
		SIPLOurValues ObjOurValues=new SIPLOurValues(driver);
		return ObjOurValues;
	}

}
