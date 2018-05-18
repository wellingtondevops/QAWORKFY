package us.mircloud.workfyqa.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import us.mircloud.workfyqa.core.DSL;
import us.mircloud.workfyqa.page.LoginPage;

public class TesteConfDocumentoVerficDuplicidade {
	
	private WebDriver driver;
	private DSL dsl;
	private LoginPage page;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://workfy-qa.mircloud.us");
		dsl = new DSL(driver);
		page = new LoginPage(driver);
	}
	
	@After
	public void finaliza() {

		driver.quit();
	}
	@Test
	public void testeConfigurarDuplicidade() throws Exception {
		
		page.setEmail("wellington.carvalho@smartscan.com.br");
		page.setPassowrd("123456");
		page.setBotaoLogin();
	
		dsl.chekarComponente("Pesquisar Documentos", "//div[@id='search-main']/div/div/h1");

		dsl.click_xpath("//div[@id='site-navbar-collapse']/ul/li/button/i/span");

		dsl.chekarComponente("Configurações", "//div[@id='withBtnGroup']/button/span");

		dsl.click_xpath("(//button[@type='button'])[20]");
	
	
	
	}

}
