package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class TransporteEntregaPage extends BasePage {
	
	
	@FindBy(xpath = "//*[@class='delivery_option_radio'][contains(@name,'delivery_option')]")
	protected WebElement radioFormaTrasporte;
	
	@FindBy(name = "cgv")
	protected WebElement chkTermos;
	
	@FindBy(name = "processCarrier")
	protected WebElement botaoProcessCarrier;
	


	
	public TransporteEntregaPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public void escolherFormaTransporte() {
		radioFormaTrasporte.click();
		log("Escoheu a forma de transporte");
		
	}

	public void aceitarTermos() {
		chkTermos.click();
		botaoProcessCarrier.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > h1"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("#center_column > h1"));
		Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", validaTexto.getText());
		log("Aceitou os termos");
		
	}
	


	

}