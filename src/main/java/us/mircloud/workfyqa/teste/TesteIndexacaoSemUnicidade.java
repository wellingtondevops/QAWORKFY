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
import us.mircloud.workfyqa.page.ModoGedPage;

public class TesteIndexacaoSemUnicidade {
	private LoginPage page;
	private DashboardPage dash;
	private ConfiguracaoDocumentoPage  confdocto;
	private ModoGedPage ged;


	@Before
	public void inicializa() {

		getDriver().get("http://workfy-qa.mircloud.us");
		new DSL();
		page = new LoginPage();
		dash= new DashboardPage();
		confdocto = new ConfiguracaoDocumentoPage();	
		ged =  new ModoGedPage();
		
	}
	@After
	public void finaliza() {

		killDriver();
	}

	@Test
	public void testeIndexarSemDuplicidade() throws Exception {

		page.setEmail();

		page.setPassowrd();

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setGerenciarDocumentos();

		confdocto.verificaBotaoConfiguracoes();

		ged.setCodauAvaliaDesempenho();

		ged.verificarTextoCarregarDocumentos();

		ged.setDocumentoParaIndexar();	

		ged.irDocumento();

		ged.checkarBotaoSalvar();		

		ged.setIndicePrimeiro();

		ged.setIndiceSegundo();

		ged.setIndiceTerceiro();

		ged.setBotaoSalvar();

		ged.checkarBotaoSalvar();

		ged.setIndicePrimeiro();

		ged.setIndiceSegundo();

		ged.setIndiceTerceiro();

		ged.setBotaoSalvar();

		ged.checkarBotaoSalvar();

		ged.setLogoWork();

		dash.setDropMenuUsuario();	

		dash.setLogout();

	}

}
