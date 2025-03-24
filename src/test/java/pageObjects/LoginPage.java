package pageObjects;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.exactText;

import com.codeborne.selenide.SelenideElement;

public class LoginPage {
	
	//ELMENTOS
	private SelenideElement campoUserName = $(By.id("userName"));
	private SelenideElement campoPassword = $(By.id("password"));
	private SelenideElement botaoLogin = $(By.id("login"));
	private SelenideElement textoUserName = $(By.id("userName-value"));
	private SelenideElement textoLoginInvalido = $(By.id("name"));
	
	//METODOS
	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void validarTextoUserName(String userName) {
		textoUserName.shouldHave(exactText(userName));
	}
	
	public void validarMsgLoginInvalido(String txtLoginInvalido) {
		textoLoginInvalido.shouldHave(exactText(txtLoginInvalido));
	}

	
}
