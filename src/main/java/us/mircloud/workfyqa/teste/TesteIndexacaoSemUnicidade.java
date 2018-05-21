package us.mircloud.workfyqa.teste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.ConfiguracaoDocumentoPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;
import us.mircloud.workfyqa.page.ModoGedPage;

public class TesteIndexacaoSemUnicidade {
	private WebDriver driver;
	private LoginPage page;
	private DashboardPage dash;
	private ConfiguracaoDocumentoPage  confdocto;
	private ModoGedPage ged;


	@Before
	public void inicializa() {

		System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");
		new DSL(driver);
		page = new LoginPage(driver);
		dash= new DashboardPage(driver);
		confdocto = new ConfiguracaoDocumentoPage(driver);	
		ged =  new ModoGedPage(driver);
	}
	@After
	public void finaliza() {

		driver.quit();
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
