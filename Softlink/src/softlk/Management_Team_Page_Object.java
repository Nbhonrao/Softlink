package softlk;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class Management_Team_Page_Object extends LoadableComponent<Management_Team_Page_Object> {

	@FindBy(xpath="html/body/form/header/div[2]/div/nav/ul/li[1]/a")
	@CacheLookup
	WebElement Company_main_menu;
	
	@FindBy(linkText="Management Team")
	@CacheLookup
	WebElement Management_team_sub_menu;
	
	private WebDriver driver;
	private String Title;
	
	public Management_Team_Page_Object(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
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
		//fail("Not yet implemented");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertTrue(driver.getTitle().equals(Title));
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
	
	public News_Page_Object Management_Team()
	{
		Actions action=new Actions(driver);
		action.moveToElement(Company_main_menu);
		action.moveToElement(Management_team_sub_menu);
		action.click();
		action.perform();
		
		driver.navigate().back();
		
		News_Page_Object news_obj=new News_Page_Object(driver);
		return news_obj;
	}
	

}
