package utils;

import static com.codeborne.selenide.Selenide.screenshot;

import org.openqa.selenium.OutputType;

import io.cucumber.java.Scenario;

public class Utils {
	
	public static void capturarScreenshot(Scenario scenario) {
		try {
			byte[] tempshot = screenshot(OutputType.BYTES);
			scenario.attach(tempshot, "image/png", scenario.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
