package com.amazonApp.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.amazonApp.commonLibraries.browserConfiguration.config.ObjectReader;
import com.amazonApp.commonLibraries.logger.LoggerHelper;
import com.amazonApp.commonLibraries.testbase.TestBase;
import com.amazonApp.initPages.InitPages;


public class SearchItemPageTest extends TestBase {
	
	private final Logger log = LoggerHelper.getLogger(SearchItemPageTest.class);
	InitPages initPages;

	
	@Test (description="Verify Product Details")
	public void verifyProductDetails(){
		// go to application
		getApplicationUrl(ObjectReader.reader.getUrl());
		initPages = new InitPages(driver);

		initPages.homePageObject.searchItem();
		initPages.searchItemPageObject.productDetails();


	}

}
