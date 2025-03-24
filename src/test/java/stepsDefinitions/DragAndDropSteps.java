package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DroppablePage;

public class DragAndDropSteps {
	
	DroppablePage droppablePage = new DroppablePage();
	
	@Quando("eu arrastar a caixa sobre a outra")
	public void euArrastarACaixaSobreAOutra() {
	    droppablePage.arrastarESoltarCaixa();
	}
	@Entao("a caixa apresenta o texto {string}")
	public void aCaixaApresentaOTexto(String texto) {
		droppablePage.validarCaixaFixaTexto(texto);
	}

}
