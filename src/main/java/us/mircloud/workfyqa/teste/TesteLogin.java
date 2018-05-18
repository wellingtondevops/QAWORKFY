
package us.mircloud.workfyqa.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteLogin {
	private WebDriver driver;
	private LoginPage page;
	private DashboardPage dash;

	@Before
	public void inicializa() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");
		new DSL(driver);
		page = new LoginPage(driver);
		dash= new DashboardPage(driver);		
		page = new LoginPage(driver);
		
	}
	
	@After
	public void finaliza() {

		driver.quit();
	}

	@Test
	public void testeLogin() throws Exception {

		page.setEmail("wellington.carvalho@smartscan.com.br");
		
		page.setPassowrd("123456");
		
		page.setBotaoLogin();

		dash.verificaTextoDocumentos();
	
	}

}