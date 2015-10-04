package org.live.magento_app.test_area;

import org.live.magento_app_pages.AbstractPage;
import org.live.magento_app_pages.HomePage;
import org.live.magento_app_pages.MyAccountPage;
import org.live.magento_app_pages.WelcomePage;
//import org.live.magento_app.pages.AbstractPage;
//import org.live.magento_app.pages.HomePage;
//import org.live.magento_app.pages.MyAccountPage;
//import org.live.magento_app.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MagentoLoginTest {
 private WebDriver driver;
   private AbstractPage abstractPage;
   private HomePage homePage;
   private MyAccountPage myAccountPage;
   private WelcomePage welcomePage;
   
   
   
   @BeforeMethod
   public void setUp() {
    driver = new FirefoxDriver();
    abstractPage = new AbstractPage(driver);
    homePage = new HomePage(driver);
    myAccountPage = new MyAccountPage(driver);
    welcomePage = new WelcomePage(driver);
    abstractPage.openAndMaximizeBrowser();
   }
   
   @Test(dataProvider = "loginData")
   public void loginTest (String username, String password, String name) {
    homePage.openMyAccount();
    myAccountPage.loginWith(username, password);
    welcomePage.verifyLogin(name, username);
    
   }
   
   @DataProvider(name = "loginData")
   public static Object[][] dataForMagentoLogin(){
    return new Object[][]{
     {"234dotus@gmail.com"}
    	 //, "password123", "Donald Jonathan"},
     //{"234dorgetus@gmail.com", "password123", "Invalid login or password"},
    // {"234dotus@gmail.com", "password17823", "Invalid login or password"},
     //{"234doghdztus@gmail.com", "pwnbrd123", "Invalid login or password"}
     
    };
    
    } 
   
   @AfterMethod
    public void executePostCondition () {
     abstractPage.tearDown();
    }
   
   }