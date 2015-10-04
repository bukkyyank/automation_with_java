package com.live.magento.pages;

import org.openqa.selenium.WebDriver;

public class BaseUrlPage extends AbstractPage {

	public BaseUrlPage(WebDriver driver) {
		super(driver);

	}

	public String urlFormatter(String urlAddress) {
		String processedAddress = null;
		if (urlAddress.startsWith("http://") && urlAddress.endsWith(".com")) {
			processedAddress = urlAddress;
			

		} else if (urlAddress.startsWith("http://") && !urlAddress.endsWith(".com")) {
			processedAddress = urlAddress + ".com";
		} else if (!urlAddress.startsWith("http://") && !urlAddress.endsWith(".com")) {
			processedAddress = "http://" + urlAddress + ".com";
		} else if (urlAddress.startsWith("www") && !urlAddress.endsWith(".com")) {
			processedAddress = "http://" + urlAddress + ".com";

		} else if (!urlAddress.startsWith("http://") && urlAddress.startsWith("www") && !urlAddress.endsWith(".com")) {
			processedAddress = "http://" + urlAddress + ".com";
		} else if (!urlAddress.startsWith("http://") && urlAddress.startsWith("www") & urlAddress.endsWith(".com")) {
			processedAddress = "http://" + urlAddress;

		}
		return processedAddress;

	}

}
