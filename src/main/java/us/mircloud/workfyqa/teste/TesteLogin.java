
package us.mircloud.workfyqa.teste;

import static us.mircloud.workfyqa.core.DriverFactory.getDriver;
import static us.mircloud.workfyqa.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.core.DriverFactory;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteLogin {
	//private WebDriver driver;
	private LoginPage page;
	private DashboardPage dash;

	@Before
	public void inicializa() {

		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		
		getDriver().get("http://workfy-qa.mircloud.us");
		new DSL();
		page = new LoginPage();
		dash= new DashboardPage();		
		page = new LoginPage();
		
	}
	
	@After
	public void finaliza() {

	killDriver();
	}

	@Test
	public void testeLogin() throws Exception {

		page.setEmail();
		
		page.setPassowrd();
		
		page.setBotaoLogin();

		dash.verificaTextoDocumentos();
	
	}

}