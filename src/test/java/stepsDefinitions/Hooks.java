package stepsDefinitions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static utils.Utils.capturarScreenshot;

import commons.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	Browser browser = new Browser();
	
	@Before(value = "@Login")
	public void setUpLogin() throws InterruptedException {
		browser.openPage("login");
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		capturarScreenshot(scenario);
		closeWebDriver();		
	}
	
}
