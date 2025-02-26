package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Quando("o usuario informar no campo username {string}")
	public void oUsuarioInformarNoCampoUsername(String userName) {
		loginPage.informarCampoUserName(userName);
	}
	
	@Quando("o usuario informar no campo password {string}")
	public void oUsuarioInformarNoCampoPassword(String password) {
		loginPage.informarCampoPassword(password);
	}
	
	@Quando("o usuario acionar o botao login")
	public void oUsuarioAcionarOBotaoLogin() {
		loginPage.acionarBotaoLogin();
	}
	
	@Entao("o sistema apresenta o usuario logado {string}")
	public void oSistemaApresentaOUsuarioLogado(String userName) {
		loginPage.validarTextoUserName(userName);
	}

	@Entao("^o sistema apresenta a mensagem de erro de login \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeErroDeLogin(String txtLoginInvalido) throws Throwable {
		loginPage.validarMsgLoginInvalido(txtLoginInvalido);
	}

}
