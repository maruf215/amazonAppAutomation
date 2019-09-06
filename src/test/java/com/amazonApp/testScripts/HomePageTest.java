package com.amazonApp.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.amazonApp.commonLibraries.browserConfiguration.config.ObjectReader;
import com.amazonApp.commonLibraries.logger.LoggerHelper;
import com.amazonApp.commonLibraries.testbase.TestBase;
import com.amazonApp.initPages.InitPages;


public class HomePageTest extends TestBase {

	private final Logger log = LoggerHelper.getLogger(HomePageTest.class);
	InitPages initPages;

	@Test(description = "Open Amazon App")
	public void openAmazonApp() {
		// go to application
		getApplicationUrl(ObjectReader.reader.getUrl());

	}

	@Test(description = "Serch Product")
	public void searchProduct() {
		// go to application
		getApplicationUrl(ObjectReader.reader.getUrl());
		initPages = new InitPages(driver);

		initPages.homePageObject.searchItem();

	}
}
