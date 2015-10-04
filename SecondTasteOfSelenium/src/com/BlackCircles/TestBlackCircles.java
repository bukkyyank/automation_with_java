
package com.BlackCircles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBlackCircles {

	public static WebDriver driver;
	private String baseUrl = "http://www.blackcircles.com";
	private LogInClass logInClass;
	

	@Before
	public void setUp (){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		logInClass = new LogInClass (driver);
	}
	
	
	@After
	public void tearDown (){
		driver.quit();
	}

	
	@Test
	public void testWithValidUsernameValidPassword(){
		String username = "234dotus@gmail.com";
		String password = "password123";
		String message = "blackcircles.com";
		String welcomeMessage = "Welcome . Dotcom to your";
		
		logInClass.openMyAccount();
		logInClass.clickLogInButton(username, password);
		logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	@Test
	public void testwithValidUsernameInvalidPassword(){
		String username = "234dotus@gmail.com";
		String password = "password123redbull";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details";
		
		logInClass.openMyAccount();
		logInClass.clickLogInButton(username, password);
		logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	@Test
	public void testwithInvalidUsernameValidPassword(){
		String username = "redbull234dotus@gmail.com";
		String password = "password123";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details";
		
		logInClass.openMyAccount();
		logInClass.clickLogInButton(username, password);
		logInClass.verifyThePresenceOf(message, welcomeMessage);	
	}
	
	@Test
	public void testwithInvalidUsernameInvalidPassword(){
		String username = "redbull234dotus@gmail.com";
		String password = "password123redbull";
		String message = "myaccount/minilogin/login";
		String welcomeMessage = "Incorrect login details";
		
		logInClass.openMyAccount();
		logInClass.clickLogInButton(username, password);
		logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	@Test
	public void testwithNoUsernameNoPassword(){
	String username = "";
	String password = "";
	String message = "myaccount/minilogin/login";
	String welcomeMessage = "Incorrect login details";
	
	logInClass.openMyAccount();
	logInClass.clickLogInButton(username, password);
	logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	@Test
	public void testwithNoUsernameInvalidPassword(){
	String username = "";
	String password = "password123redbull";
	String message = "myaccount/minilogin/login";
	String welcomeMessage = "Incorrect login details";
	
	logInClass.openMyAccount();
	logInClass.clickLogInButton(username, password);
	logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	@Test
	public void testwithInvalidUsernameNoPassword(){
	String username = "redbull234dotus@gmail.com";
	String password = "";
	String message = "myaccount/minilogin/login";
	String welcomeMessage = "Incorrect login details";
	
	logInClass.openMyAccount();
	logInClass.clickLogInButton(username, password);
	logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	@Test
	public void testwithNoUsernameValidPassword(){
	String username = "";
	String password = "password123";
	String message = "myaccount/minilogin/login";
	String welcomeMessage = "Incorrect login details";
	
	logInClass.openMyAccount();
	logInClass.clickLogInButton(username, password);
	logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	@Test
	public void testwithValidUsernameNoPassword(){
	String username = "234dotus@gmail.com";
	String password = "";
	String message = "myaccount/minilogin/login";
	String welcomeMessage = "Incorrect login details";
	
	logInClass.openMyAccount();
	logInClass.clickLogInButton(username, password);
	logInClass.verifyThePresenceOf(message, welcomeMessage);
	}
	
	
	
}
