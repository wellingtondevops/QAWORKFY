package us.mircloud.workfyqa.teste;
import static us.mircloud.workfyqa.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import us.mircloud.workfyqa.core.BaseTest;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.AdminPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteDeletarConvidado extends BaseTest{
	private DSL dsl;
	private LoginPage page;
	private DashboardPage dash;
	private AdminPage admin;

	@Before
	public void inicializa() {


		getDriver().get("http://workfy-qa.mircloud.us");
		dsl = new DSL();
		page = new LoginPage();
		dash= new DashboardPage();
		admin=new AdminPage();

	}


	

	@Test
	public void testeExcluirConviado() throws Exception {

		page.setEmail();

		page.setPassowrd();

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setCriarNovo();	

		dash.setNovoUsuario();

		dsl.trocarJanela((String) getDriver().getWindowHandles().toArray()[1]);

		admin.verifcarPresencaTextoNenhumUsuarioCadastrado();

		admin.deletarUsuario();

		admin.aguardaBotaoSalvar();

		admin.okDeletarUsuario();

		admin.fecharPageAdmin();	

		dsl.trocarJanela((String) getDriver().getWindowHandles().toArray()[0]);

		dash.botaoAvatar();

		dash.setLogout();
	}



}
