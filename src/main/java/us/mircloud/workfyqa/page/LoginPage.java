package us.mircloud.workfyqa.page;
import us.mircloud.workfyqa.core.DSL;

public class LoginPage {

	private DSL dsl;

	public LoginPage() {
		dsl = new DSL();

	}

	public void setEmail( ) {
		dsl.escreve_field_name("email","wellington.carvalho@smartscan.com.br" );

	}
	public void setPassowrd( ) {
		dsl.escreve_field_name("password", "123456" );

	}
	public void setBotaoLogin() {
		dsl.click_xpath("//button[@type='submit']");
	}

	

}
