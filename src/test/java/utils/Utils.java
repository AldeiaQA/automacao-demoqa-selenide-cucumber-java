package utils;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.screenshot;

import org.openqa.selenium.OutputType;

import com.codeborne.selenide.SelenideElement;

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
	
	public static void arrasTarESoltar(SelenideElement from, SelenideElement to) {
		actions().dragAndDrop(from, to).build().perform();
	}

}
