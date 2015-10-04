package com.SeoToaster;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SolutionSeoToasterTest {
	public WebDriver driver;
	
	@Before
	public void setUp(){
	driver = new FirefoxDriver();
	String baseUrl = "http://www.asda.com";
	driver.manage().window().maximize();
	}

	@Test
	public void test1(){
		
	}
}
