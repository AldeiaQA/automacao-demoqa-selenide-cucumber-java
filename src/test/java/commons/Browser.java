package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class Browser {
	//define as propriedades do browser carregadas a partir da classe BrowserProperties e do arquivo config.properties na pasta resources
	BrowserProperties properties = new BrowserProperties();
	
	public void openPage(String finalUrl) {
		Configuration.timeout = properties.getTimeout(); //define o tempo para encontrar elementos
		Configuration.browser = properties.getBrowser(); //define qual o navegador utilizado ex: chrome, IE, Firefox
		Configuration.browserSize = properties.getBrowserSize(); // define o tamanho do borwser, 1920x1080
		Configuration.headless = properties.isHeadless();// se vai mostrar a execução no navegador
		Configuration.pageLoadStrategy = properties.getPageLoadStrategy();//define se o webdriver deve esperar até que a página esteja completamente carregada. Valores possíveis: “none”, “normal” e “eager”.
		setUrl(finalUrl);
	}
	
	public void setUrl(String finalUrl) {
		Selenide.open(properties.getUrl() + finalUrl);
	}

}
