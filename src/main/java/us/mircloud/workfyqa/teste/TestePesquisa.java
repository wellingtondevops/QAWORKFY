package us.mircloud.workfyqa.teste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TestePesquisa {
	
	private WebDriver driver;
	private LoginPage page;
	private DashboardPage dash;


	@Before
	public void inicializa() {


		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");		
		page = new LoginPage(driver);
		dash= new DashboardPage(driver);

	}

	@After
	public void finaliza() {

		driver.quit();
	}

	@Test
	public void testeBusca() throws Exception {


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

		dash.setDropMenuUsuario();	

		dash.setLogout();
	}
	

}
