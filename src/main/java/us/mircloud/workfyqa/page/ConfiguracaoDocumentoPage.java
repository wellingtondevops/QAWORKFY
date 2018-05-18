package us.mircloud.workfyqa.page;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import us.mircloud.workfyqa.core.DSL;




public class ConfiguracaoDocumentoPage {
	private DSL dsl;

	public ConfiguracaoDocumentoPage(WebDriver driver) {
		dsl =new DSL(driver);
	}

	public void verificaBotaoConfiguracoes() throws InterruptedException {
		dsl.chekarComponente("Configurações", "//div[@id='withBtnGroup']/button/span");

	}

	public void setDocumentoAvaliacaoDesempenho() {

		dsl.click_xpath("(//button[@type='button'])[20]");

	}

	public void checkTextoBotaoConfiguracao() {

		assertEquals("Configurações",dsl.obterTexto_xpath("//div[@id='withBtnGroup']/button/span"));

	}

	public void setBotaoConfigDocumento() {

		dsl.click_xpath("//div[@id='withBtnGroup']/button/span");

	}

	public void obterTextoNomeDocumento () {

		assertEquals("CODAU DIG AVALICAO DE DESEMPENHO", dsl.obterTexto_xpath("//section[@id='worky-edit']/div/div/div/div/h2"));
	}

	public void obterTextoConfDentroConf() {

		assertEquals("Configurações",dsl.obterTexto_xpath("//section[@id='worky-edit']/ol/li[2]"));

	}

	public void setAddNovoCampo() {

		dsl.click_xpath("//div[@id='fields']/div/div/button");

	}

	public void obterTextoCabecalhoEditaDocumento() throws InterruptedException {	

		dsl.chekarComponente("SELECIONE UM TIPO DE CAMPO PARA ADICIONAR", "//div[@id='addfield']/div/div/div/h4");

	}

	public void checkTextoSelecCampo() {

		assertEquals("SELECIONE UM TIPO DE CAMPO PARA ADICIONAR", dsl.obterTexto_xpath("//div[@id='addfield']/div/div/div/h4"));

	}

	public void checkTextoFieldTexto() {

		assertEquals("TEXTO", dsl.obterTexto_link("TEXTO"));

	}

	public void checkTextoFieldNumero() {

		assertEquals("NUMERO", dsl.obterTexto_link("NUMERO"));

	}

	public void checkTextoFieldSelecBox() {

		assertEquals("SELECT BOX", dsl.obterTexto_link("SELECT BOX"));

	}

	public void checkTextoFieldCheckBox() {

		assertEquals("CHECK BOX", dsl.obterTexto_link("CHECK BOX"));
	}


	public void checkTextoFieldTextoLongo() {

		assertEquals("TEXTO LONGO", dsl.obterTexto_link("TEXTO LONGO"));
	}


	public void checkTextoFieldCalendario() {

		assertEquals("CALENDARIO", dsl.obterTexto_link("CALENDARIO"));
	}


	public void checkTextoFieldRadioBox() {

		assertEquals("RADIO BOX", dsl.obterTexto_link("RADIO BOX"));

	}

	public void checkTextoFieldEmail() {

		assertEquals("EMAIL", dsl.obterTexto_link("EMAIL"));
	}

	public void setSairEdicaoDocumento() {

		dsl.click_xpath("//div[@id='addfield']/div/div/div/button/span");

	}

	public void setMembros() {

		dsl.click_xpath("//div[@id='withBtnGroup']/button[2]/span");

	}		

	public void setAddMembros() {

		dsl.click_link("Adicionar Membro ao Documento");
	}

	public void aguardarAddMembros() {

		dsl.aguardaElementoLinkTex("Adicionar Membro ao Documento");

	}

	public void checharAdcionarUsuario() throws InterruptedException {


		dsl.chekarComponenteId("Add Usuário", "swal2-title");		

	}
	
	public void aguardarComboUsuarios(){

		dsl.aguardaElementoXpath("//select[@class='swal2-select']");
		
	}

	public void setComboUsuarios() {

		dsl.click_xpath("//select[@class='swal2-select']");

	}

	public void SelectComboConvidados() {

		dsl.selectComboXpath("//select[@class='swal2-select']", "convidado@gmail.com");

	}

	public void SetSalvarUsuarioAdd() {	

		dsl.click_xpath("(//button[@type='button'])[12]");

	}

	public void aguardarMensagemAdicaoUsuario() throws InterruptedException {

		dsl.chekarComponenteId("convidado@gmail.com Adicionado com sucesso!", "swal2-content");

	}
	public void setOk() {

		dsl.click_xpath("(//button[@type='button'])[12]");

	}

	public void fechar() {

		dsl.fechaTela();

	}
	
	
public void aguardarRetornoCombo() {
	
	dsl.aguardaElementoXpath("//body[@id='main']/div[4]/div/select");
}


public void setRemoverConviado() {
	
	dsl.click_xpath("//div[@id='membersModal']/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/a/i");
	
}

public void aguardarMensagemRemovidoUsuario() throws InterruptedException {
	
	dsl.chekarComponenteId("convidado@gmail.com Removido com sucesso!", "id=swal2-content");
}


public void aguardarMensagem() {
	dsl.aguardaElementoXpath("(//button[@type='button'])[12]");
	
}
public void aguardarUsuarioAremover() {
	
	dsl.aguardaElementoXpath("//div[@id='membersModal']/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/a/i");
}





}
