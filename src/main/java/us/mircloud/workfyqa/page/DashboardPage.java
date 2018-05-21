package us.mircloud.workfyqa.page;
import org.openqa.selenium.WebDriver;

import us.mircloud.workfyqa.core.DSL;

public class DashboardPage {
	private DSL dsl;
	private WebDriver driver;

	public DashboardPage() {
		dsl = new DSL();
	}

	public void setComboId() {
		dsl.click_id("select-input");

	}

	public void setEscrevePesquisar() {
		dsl.escreve_field_id("search-input","smartscan");

	}

	public void setClickCombo() {

		dsl.click_xpath("//option[@value='5A3406BC975A4255F8A9C001_795']");	

	}

	public void setBotaoLocalizar() {

		dsl.click_xpath("//div[@id='search-main']/div/div/div[3]/button");

	}
	public void setAbrirDocumentoLocalizado() {

		dsl.click_xpath("//section[@id='search']/div/div/div/div/div/ul/li/h4/div/div/div[2]/a/p");

	}

	public void setDropMenuUsuario() {

		dsl.click_xpath("//img[@alt='...']");	 

	}

	public void setLogout() {

		dsl.click_link("Logout");
	}

	public void setCriarNovo(){
		dsl.click_id("createNewNav");

	}
	public void setNovoUsuario() {

		dsl.click_xpath("//div[@id='site-navbar-collapse']/ul[2]/li/ul/li[2]/div/div/a/div/div[2]/h6");
	}

	public void verificaTextoDocumentos() throws InterruptedException {

		dsl.chekarComponente("Pesquisar Documentos", "//div[@id='search-main']/div/div/h1");

	}
	public void trocarSegundaTela() {

		dsl.trocarJanela((String) driver.getWindowHandles().toArray()[1]);

	}	 

	public void botaoAvatar() {

		dsl.click_xpath("//img[@alt='...']");
	}

	public void setCampoBusca() {
		dsl.click_id("select-input");	

	}

	public void escrevePesquisa() {

		dsl.escreve_field_id("search-input", "smartscan");	
	}

	public void aguardaElemento() {

		dsl.aguardaElementoXpath("//img[@alt='...']");
	}

	public void setarCombo() {
		dsl.selectComboid("select-input", "CODAU_DIG_CTB_DESPESAS_2017");

	}

	public void verificarRetornoPesquisa() throws InterruptedException {
		dsl.chekarComponente("Resultados da pesquisa para \"smartscan\"", "//section[@id='search']/div/div/div/div/div/div/h1");

	}
	

public void setGerenciarDocumentos() {
	dsl.click_xpath("//div[@id='site-navbar-collapse']/ul/li/button/i/span");
	
}

}
