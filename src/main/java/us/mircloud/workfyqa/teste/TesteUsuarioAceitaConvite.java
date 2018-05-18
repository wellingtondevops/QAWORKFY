//Feita toda abstração
package us.mircloud.workfyqa.teste;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.page.AdminPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;
import us.mircloud.workfyqa.page.SignUpConvidadoPage;

public class TesteUsuarioAceitaConvite {
	private WebDriver driver;
	private DashboardPage dash;
	private SignUpConvidadoPage convite;


	@Before
	public void inicializa() {		
		driver = new ChromeDriver();
		driver.manage().window().maximize();			
		new LoginPage(driver);
		dash= new DashboardPage(driver);
		new AdminPage(driver);
		convite= new SignUpConvidadoPage(driver);

	}
	@After
	public void finaliza() {

		driver.quit();
	}

	@Test
	public void testeUsuarioValidandoConvite() throws Exception {

		convite.linkConvite();

		convite.passoword();

		convite.clickAlgo();

		convite.setSalvar();

		dash.verificaTextoDocumentos();

		dash.setCampoBusca();

		dash.escrevePesquisa();

		dash.aguardaElemento();

		dash.botaoAvatar();

		dash.setLogout();


	}

}
