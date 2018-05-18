package us.mircloud.workfyqa.page;
import org.openqa.selenium.WebDriver;

import us.mircloud.workfyqa.core.DSL;

public class LoginPage {

	private DSL dsl;

	public LoginPage(WebDriver driver) {
		dsl = new DSL(driver);

	}

	public void setEmail( String email) {
		dsl.escreve_field_name("email", email );

	}
	public void setPassowrd( String password) {
		dsl.escreve_field_name("password", password );

	}
	public void setBotaoLogin() {
		dsl.click_xpath("//button[@type='submit']");
	}

	

}
