package us.mircloud.workfyqa.page;
import us.mircloud.workfyqa.core.BasePage;

public class AdminPage extends BasePage {
	
	public void setAdcionarUsuario () {

		dsl.click_xpath("//a/span[2]");
	}


	public void setUsuario () {

		dsl.escreve_xpath("//input[@type='text']","convigado@gmail.com");

	}

	public void setPermissaoUsuario() {
		dsl.click_xpath("//div[@id='addUserModal']/div[2]/section/div[2]/div/div/select");

	}
	public void setSalvarUsuario() {

		dsl.click_xpath("//button[@type='button']");
	}

	public void setSetarusuario() {

		dsl.click_xpath("//option[@value='3: Upload, Indexação e Consulta']");
	}
	public void setClickModal() {
		dsl.click_xpath("//div[@id='addUserModal']/div[2]/footer/button");


	}

	public void aguardaBotaoSalvar() {

		dsl.aguardaElementoXpath("//button[@type='button']");

	}
	public void verifcarPresencaTextoNenhumUsuarioCadastrado() throws InterruptedException {
		dsl.chekarComponente("Nenhum usuário cadastrado"," //h2[@class='subtitle is-3 has-text-centered']");

	}
	public void fecharPageAdmin(){
		dsl.fechaTela();

	}

	public void botaoAvatar() {
		
		dsl.click_xpath("//img[@alt='...']");
	}
public void deletarUsuario() {
	
	dsl.click_link("Deletar");
}

public void okDeletarUsuario() {
	
	dsl.click_xpath("//button[@type='button']");
}

public void aguardaBotaoExluir() {

	dsl.aguardaElementoXpath("//button[@type='button']");

}


}
