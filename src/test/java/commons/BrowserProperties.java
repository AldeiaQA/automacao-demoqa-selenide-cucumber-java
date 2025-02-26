package commons;

import java.util.Properties;

public class BrowserProperties {
	
	//recuperar os valores do arquivo config.properties para atribuir nas configurações do browser
	//https://selenide.org/javadoc/current/com/codeborne/selenide/Configuration.html#browserCapabilities
	
	String browser;
	boolean headless;
	String browserSize;
	String url;
	Long timeout;
	String pageLoadStrategy;
	
	private Properties loadProperties() {
		Properties prop = new Properties();
		try {
			getClass().getClassLoader();
			prop.load(ClassLoader.getSystemResourceAsStream("config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public String getBrowser() {
		return this.browser = loadProperties().getProperty("browser");
	}
	
	public boolean isHeadless() {
		return this.headless = Boolean.parseBoolean(loadProperties().getProperty("headless"));
	}
	
	public String getBrowserSize() {
		return this.browserSize = loadProperties().getProperty("browserSize");
	}
	
	public String getUrl() {
		return this.url = loadProperties().getProperty("url");
	}
	
	public Long getTimeout() {
		return this.timeout = Long.parseLong(loadProperties().getProperty("timeout"));
	}
	
	public String getPageLoadStrategy() {
		return this.pageLoadStrategy = loadProperties().getProperty("pageLoadStrategy");
	}

}
