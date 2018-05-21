package us.mircloud.workfyqa.teste;
import static us.mircloud.workfyqa.core.DriverFactory.getDriver;
import static us.mircloud.workfyqa.core.DriverFactory.killDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.ConfiguracaoDocumentoPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteConfDocumentoVerficDuplicidade {

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



	@After
	public void finaliza() {

		killDriver();

	}
	@Test
	public void testeConfigurarDuplicidade() throws Exception {

		page.setEmail();

		page.setPassowrd();

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setGerenciarDocumentos();

		confdocto.verificaBotaoConfiguracoes();

		confdocto.setDocumentoAvaliacaoDesempenho();

		confdocto.checkTextoBotaoConfiguracao();

		confdocto.setBotaoConfigDocumento();	

		confdocto.obterTextoNomeDocumento();		

		confdocto.obterTextoConfDentroConf();


	}

}
