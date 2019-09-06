package com.amazonApp.commonLibraries.browserConfiguration.config;

import com.amazonApp.commonLibraries.browserConfiguration.BrowserType;

public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
//	public String getUserName();
//	public String getPassword();

}
