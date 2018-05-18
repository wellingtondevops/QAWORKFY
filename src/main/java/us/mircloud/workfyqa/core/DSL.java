package us.mircloud.workfyqa.core;
import static org.junit.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;

	}

	public void escreve_field_name(String name_campo, String texto){				

		driver.findElement(By.name(name_campo)).sendKeys(texto);	

	}

	public void escreve_field_id(String id, String texto){				

		driver.findElement(By.id(id)).sendKeys(texto);

	}

	public void escreve_xpath(String xpath, String texto){

		driver.findElement(By.xpath(xpath)).sendKeys(texto);

	}		

	public void click_field_name(String name_campo){		

		driver.findElement(By.name(name_campo)).click();

	}

	public void clear_field_name(String name_campo){		

		driver.findElement(By.name(name_campo)).clear();

	}

	public void clear_xpath(String xpath){		

		driver.findElement(By.xpath(xpath)).clear();

	}

	public void clear_field_id(String id){		

		driver.findElement(By.id(id)).clear();

	}

	public void click_id(String id){		

		driver.findElement(By.id(id)).click();		

	}

	public void click_xpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}
	public void click_link(String link) {

		driver.findElement(By.linkText(link)).click();

	}

	public void entrarFrame(String id) {

		driver.switchTo().frame(id);

	}

	public void sairFrame(){

		driver.switchTo().defaultContent();
		
	}

	public void trocarJanela(String id) {

		driver.switchTo().window(id);

	}

	public String obterTexto_xpath( String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();

	}

	public String obterTexto_link( String link) {

		return driver.findElement(By.linkText(link)).getText();

	}

	public String chekarComponente(String Texto, String xpath) throws InterruptedException {

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (Texto.equals(driver.findElement(By.xpath(xpath)).getText())) break; } catch (Exception e) {}
			Thread.sleep(1000);        

		}

		return Texto;

	}

	public String chekarComponenteLink(String texto, String link) throws InterruptedException {

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (texto.equals(driver.findElement(By.linkText(link)).getText())) break; } catch (Exception e) {}
			Thread.sleep(1000);   

		}

		return texto;

	}		

	public String chekarComponenteId(String texto, String id) throws InterruptedException {

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (texto.equals(driver.findElement(By.id(id)).getText())) break; } catch (Exception e) {}
			Thread.sleep(1000);   

		}

		return texto;
	}

	public void setLogo(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public String selectComboXpath (String xpath,String texto) {

		new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(texto);
		return texto;
	}

	public String selectComboid (String id,String texto) {

		new Select(driver.findElement(By.xpath(id))).selectByVisibleText(texto);
		return texto;

	}	

	public void  aguardaElementoXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

	public void  aguardaElementoLinkTex(String link) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(link)));

	}
	
	public void  aguardaElementoId(String id) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(id)));

	}

	public void fechaTela() {

		driver.close();

	}

	public void conviteRecebido(String link) {

		driver.get(link);

	}




}
