package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.pages.AutenticacaoPage;
import com.everis.pages.OpcoesPagamentoPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import com.everis.util.Utils;

public class OpcoesPagamentoSteps {
	
	
	public void selecionarPagamento(String opcaoPagamento) {
		
		OpcoesPagamentoPage opcoesPagamentoPage = new OpcoesPagamentoPage();
		opcoesPagamentoPage.selecionarPagamento(opcaoPagamento);
	}
	
	@Quando("^quando o pagamento for confirmado$")
	public void confirmarPagamento() {
		
		OpcoesPagamentoPage opcoesPagamentoPage = new OpcoesPagamentoPage();
		opcoesPagamentoPage.selecionarPagamento("transferencia");
		//opcoesPagamentoPage.selecionarPagamento("cheque");
		
	}
	
}