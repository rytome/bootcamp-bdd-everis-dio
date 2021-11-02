package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class OpcoesPagamentoPage extends BasePage {


	WebDriverWait wait;
	WebElement validaTexto;
	
	@FindBy(xpath = "//*[@class='bankwire']")
	protected WebElement pagamentoViaTransferencia;
	
	@FindBy(xpath = "//*[@class='cheque']")
	protected WebElement pagamentoCheque;
	
	@FindBy(xpath = "//*[@class='button btn btn-default button-medium'][@type='submit']/span[contains(text(),'confirm')]")
	protected WebElement botaoConfirmarPagamento;
	
	public OpcoesPagamentoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void selecionarPagamento(String opcaoPagamento) {
		if (opcaoPagamento.equals("cheque")){
			optouPagamentoViaCheque();
		} else if  (opcaoPagamento.equals("transferencia")) {
			optouPagamentoViaTransferencia();
		}
		confirmouPagamento();
	}
	
	private void optouPagamentoViaTransferencia() {
		pagamentoViaTransferencia.click();
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > form > div > h3"))); 
		validaTexto = driver.findElement(By.cssSelector("#center_column > form > div > h3"));
		Assert.assertEquals("BANK-WIRE PAYMENT.", validaTexto.getText());
		log("Optou por pagamento via transferencia");
	}
	
	private void optouPagamentoViaCheque() {
		pagamentoCheque.click();
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > form > div > h3"))); 
		validaTexto = driver.findElement(By.cssSelector("#center_column > form > div > h3"));
		Assert.assertEquals("CHECK PAYMENT", validaTexto.getText());
		log("Optou por pagamento via cheque");
	}
	
	private void confirmouPagamento() {
		botaoConfirmarPagamento.click();
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > h1"))); 
		validaTexto = driver.findElement(By.cssSelector("#center_column > h1"));
		Assert.assertEquals("ORDER CONFIRMATION", validaTexto.getText());
		log("Confirmou Pagamento");
	}

}