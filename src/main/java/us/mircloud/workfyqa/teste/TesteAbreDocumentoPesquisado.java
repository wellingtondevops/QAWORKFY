
package us.mircloud.workfyqa.teste;
import static us.mircloud.workfyqa.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import us.mircloud.workfyqa.core.BaseTest;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteAbreDocumentoPesquisado extends BaseTest {

	private LoginPage page;
	private DashboardPage dash;


	@Before
	public void inicializa() {



		getDriver().get("http://workfy-qa.mircloud.us");		
		page = new LoginPage();
		dash= new DashboardPage();

	}



	@Test
	public void texteAbrirDocumento() throws Exception {


		page.setEmail();

		page.setPassowrd();

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setComboId();

		dash.setEscrevePesquisar();

		dash.setComboId();	

		dash.setClickCombo();

		dash.setBotaoLocalizar();

		dash.verificarRetornoPesquisa();

		dash.setAbrirDocumentoLocalizado();

		dash.setDropMenuUsuario();	

		dash.setLogout();


	}



}
