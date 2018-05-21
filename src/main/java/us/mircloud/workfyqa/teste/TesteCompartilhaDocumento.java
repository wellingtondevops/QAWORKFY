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

public class TesteCompartilhaDocumento {
	private WebDriver driver;
	private LoginPage page;
	private DashboardPage dash;
	private ConfiguracaoDocumentoPage  confdocto;




	@Before
	public void inicializa() {


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");
		new DSL(driver);
		page = new LoginPage(driver);
		dash= new DashboardPage(driver);
		confdocto = new ConfiguracaoDocumentoPage(driver);	

	}

	@After
	public void finaliza() {

		driver.quit();
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

		confdocto.setComboUsuarios();

		confdocto.aguardarComboUsuarios();

		confdocto.SelectComboConvidados();		

		confdocto.SetSalvarUsuarioAdd();

		confdocto.aguardarMensagemAdicaoUsuario();

		confdocto.setOk();

		confdocto.fechar();


	}



}