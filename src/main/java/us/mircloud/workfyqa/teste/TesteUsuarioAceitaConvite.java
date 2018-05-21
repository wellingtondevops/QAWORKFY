package us.mircloud.workfyqa.teste;
import static us.mircloud.workfyqa.core.DriverFactory.getDriver;
import static us.mircloud.workfyqa.core.DriverFactory.killDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mircloud.workfyqa.page.AdminPage;
import us.mircloud.workfyqa.page.DashboardPage;
import us.mircloud.workfyqa.page.LoginPage;
import us.mircloud.workfyqa.page.SignUpConvidadoPage;

public class TesteUsuarioAceitaConvite {

	private DashboardPage dash;
	private SignUpConvidadoPage convite;


	@Before
	public void inicializa() {			


		getDriver().get("http://workfy-qa.mircloud.us");			
		new LoginPage();
		dash= new DashboardPage();
		new AdminPage();
		convite= new SignUpConvidadoPage();

	}
	@After
	public void finaliza() {

		killDriver();

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
