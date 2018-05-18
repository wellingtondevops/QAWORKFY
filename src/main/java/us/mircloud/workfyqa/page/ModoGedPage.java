package us.mircloud.workfyqa.page;
import org.openqa.selenium.WebDriver;

import us.mircloud.workfyqa.core.DSL;

public class ModoGedPage {
	private DSL dsl;
	public ModoGedPage(WebDriver driver) {
		dsl = new DSL(driver);
	}	

	public void setCodauAvaliaDesempenho() {


		dsl.click_xpath("(//button[@type='button'])[20]");

	}

	public void verificarTextoCarregarDocumentos() throws InterruptedException {

		dsl.chekarComponenteLink("Carregar mais documentos", "Carregar mais documentos");

	}

	public void setDocumentoParaIndexar() {

		dsl.click_xpath("//section[@id='ged-module']/div[2]/div/div/div/div[2]/a/i");		

	}

	public void irDocumento () {

		dsl.click_link("Ir para documento");

	}

	public void checkarBotaoSalvar() throws InterruptedException {

		dsl.chekarComponenteLink("SAVE", "SAVE");

	}

	public void setIndicePrimeiro() {

		dsl.escreve_field_id("textfield", "ALTERACAO DE SALARIO");

	}

	public void setIndiceSegundo() {

		dsl.escreve_xpath("(//input[@id='textfield'])[2]", "SIMONE CRISTINA FORNATO");	

	}

	public void setIndiceTerceiro() {

		dsl.escreve_xpath("(//input[@id='textfield'])[3]", "123456");

	}

	public void setBotaoSalvar() {

		dsl.click_link("SAVE");

	}

	public void setLogoWork() {

		dsl.click_xpath("(//img[@title='Remark'])[2]");

	}


}
