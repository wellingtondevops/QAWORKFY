package us.mircloud.workfyqa.teste;
import static us.mircloud.workfyqa.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import us.mircloud.workfyqa.core.BaseTest;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.ConfiguracaoDocumentoPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteCompartilhaDocumento extends BaseTest{
	private LoginPage page;
	private DashboardPage dash;
	private ConfiguracaoDocumentoPage  confdocto;




	@Before
	public void inicializa() {


		getDriver().get("http://workfy-qa.mircloud.us");
		new DSL();
		page = new LoginPage();
		dash= new DashboardPage();
		confdocto = new ConfiguracaoDocumentoPage();	

	}




	@Test
	public void testeCompartilharDocumento() throws Exception {

		page.setEmail();

		page.setPassowrd();

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setGerenciarDocumentos();

		confdocto.verificaBotaoConfiguracoes();

		confdocto.setDocumentoAvaliacaoDesempenho();

		confdocto.checkTextoBotaoConfiguracao();

		confdocto.setMembros();

		confdocto.aguardarAddMembros();

		confdocto.setAddMembros();

		confdocto.checharAdcionarUsuario();
		
		//confdocto.aguardarComboUsuarios();

		//confdocto.setComboUsuarios();

		confdocto.aguardarComboUsuarios();

		confdocto.SelectComboConvidados();		

		confdocto.SetSalvarUsuarioAdd();

		confdocto.aguardarMensagemAdicaoUsuario();

		confdocto.setOk();

		confdocto.fechar();


	}



}