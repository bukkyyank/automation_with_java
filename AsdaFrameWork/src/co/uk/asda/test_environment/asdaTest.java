package co.uk.asda.test_environment;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import com.asda.page_object.Groceries_freshAndChilled;
import com.asda.page_object.HomePage;
import com.asda.page_object.LandingPage;
import com.asda.page_object.LogInPage;
//@RunWith(DataProviderRunner.class)
public class asdaTest {

	
	public WebDriver driver;
	private String baseUrl = "http://www.asda.com";
	private HomePage homePage;
	private LandingPage landingPage;
	private Groceries_freshAndChilled groceries;
	private LogInPage logInPage;
	
	
	
	
	@Before
	public void setUp(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to(baseUrl);
	homePage = new HomePage(driver);
	landingPage = new LandingPage(driver);
	groceries = new Groceries_freshAndChilled(driver);
	logInPage = new LogInPage(driver);
	
	}
	
	@After
	public void tearDown(){
	driver.quit();
	}

	/*@Test
	public void testShopNow(){
		homePage.clickShopNowButton();
	}*/
	
	@Test@Ignore
	public void testClickOnStartShoppingNow(){
		landingPage.clickOnStartShoppingButton();
	}
	
	@Test@Ignore
	public void testHowToBuyThings(){
		groceries.openFreshAndChilled();
		groceries.openFruitsVegAndFlowers();
		groceries.openFruits();
		groceries.openGrapesBerriesAndCherries();
		groceries.selectFruitOfYourChoice();
		groceries.veryfyThePresenceOf();
		groceries.clickOnCheckoutBotton();
		
	}
	@Test//@UseDataProvider("dataForAsdaLogIn")
	public void testLogInPage()
	{
		homePage.clickShopNowButton();
		logInPage.enterLogInDetails();
	}
	
	/*@DataProvider
	  public static Object[][] dataForAsdaLogIn(){
	   return new Object[][]{
	    {"234dotus@gmail.com", "password123"}
	    
	    
	   };
	   
	   }*/
}
