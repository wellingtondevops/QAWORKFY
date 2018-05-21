
package us.mircloud.workfyqa.suite;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import us.mircloud.workfyqa.core.DriverFactory;
import us.mircloud.workfyqa.teste.TesteAbreDocumentoPesquisado;
import us.mircloud.workfyqa.teste.TesteCompartilhaDocumento;
import us.mircloud.workfyqa.teste.TesteCriarUsuario;
import us.mircloud.workfyqa.teste.TesteDeletarConvidado;
import us.mircloud.workfyqa.teste.TesteIndexacaoSemUnicidade;
import us.mircloud.workfyqa.teste.TesteLogin;
import us.mircloud.workfyqa.teste.TestePainelConfiguracaoDocumento;
import us.mircloud.workfyqa.teste.TestePesquisa;
import us.mircloud.workfyqa.teste.TesteUsuarioAceitaConvite;

@RunWith(Suite.class)
@SuiteClasses({

	TesteLogin.class,
	TestePesquisa.class, 
	TesteAbreDocumentoPesquisado.class,
	TesteCriarUsuario.class,    
	TesteUsuarioAceitaConvite.class,
	TesteCompartilhaDocumento.class,
	TesteIndexacaoSemUnicidade.class,
	TestePainelConfiguracaoDocumento.class,
	TesteDeletarConvidado.class

})

public class SuiteWorkfy {

	@AfterClass
	public static void finish() {

		DriverFactory.killDriver();


	}





}
