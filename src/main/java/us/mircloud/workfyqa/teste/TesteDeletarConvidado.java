package us.mircloud.workfyqa.teste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.AdminPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteDeletarConvidado {
	private WebDriver driver;
	private DSL dsl;
	private LoginPage page;
	private DashboardPage dash;
	private AdminPage admin;

	@Before
	public void inicializa() {


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");
		dsl = new DSL(driver);
		page = new LoginPage(driver);
		dash= new DashboardPage(driver);
		admin=new AdminPage(driver);
	}


	@After
	public void finaliza() {

		driver.quit();
	}


	@Test
	public void testeExcluirConviado() throws Exception {

		page.setEmail("wellington.carvalho@smartscan.com.br");

		page.setPassowrd("123456");

		page.setBotaoLogin();

		dash.verificaTextoDocumentos();

		dash.setCriarNovo();	

		dash.setNovoUsuario();

		dsl.trocarJanela((String) driver.getWindowHandles().toArray()[1]);

		admin.verifcarPresencaTextoNenhumUsuarioCadastrado();

		admin.deletarUsuario();

		admin.aguardaBotaoSalvar();

		admin.okDeletarUsuario();

		admin.fecharPageAdmin();	

		dsl.trocarJanela((String) driver.getWindowHandles().toArray()[0]);

		dash.botaoAvatar();

		dash.setLogout();
	}



}
