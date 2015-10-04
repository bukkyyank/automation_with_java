package com.live.magento.test_area;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.live.magento.pages.AbstractPage;
import com.live.magento.pages.HomePage;
import com.live.magento.pages.MyAccountPage;
import com.live.magento.pages.WelcomePage;

public class MagentoLoginTest {
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private MyAccountPage myAccountPage;
	private WelcomePage welcomePage;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		abstractPage = new AbstractPage(driver);
		homePage = new HomePage(driver);
		myAccountPage = new MyAccountPage(driver);
		welcomePage = new WelcomePage(driver);
		abstractPage.openAndMaximizeBrowser();
	}

	@Test
	public void loginTest() {
		homePage.openMyAccount();
		myAccountPage.loginWith();
		welcomePage.verifyLogin();

	}

	@After
	public void executePostCondition() {
		abstractPage.tearDown();
	}

}