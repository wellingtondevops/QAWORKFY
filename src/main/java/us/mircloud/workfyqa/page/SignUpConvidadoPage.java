package us.mircloud.workfyqa.page;

import us.mircloud.workfyqa.core.DSL;

public class SignUpConvidadoPage {
	
	private DSL dsl;
	
	public SignUpConvidadoPage() {
		dsl= new DSL();
	}
		
		public void linkConvite() {
			
			dsl.conviteRecebido("http://workfy-qa.mircloud.us/sponsor/#/create/convidado@gmail.com/wellington.carvalho@smartscan.com.br");
			
		}
		
		public void passoword() {
			dsl.escreve_field_name("password"," work123456");
			
		}
		public void clickAlgo() {
			dsl.click_xpath("//div/div/div/div");	
			
		}
		
		public void setSalvar() {
			
			dsl.click_xpath("//button[@type='submit']");	
		}
		
	
		
		
		
		
		
		

	
	
	

}
