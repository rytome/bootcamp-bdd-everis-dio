package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.pages.AutenticacaoPage;
import com.everis.pages.CarrinhoPage;
import com.everis.pages.ConfirmacaoPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import com.everis.util.Utils;

public class ConfirmacaoSteps {
	
	@Entao("^deve ser apreentado a mensagem \"(.*)\"$")
	public void oProdutoApresentouMensagemEsperada(String mensagem) {
		ConfirmacaoPage confirmacaoPage = new ConfirmacaoPage();
		Assert.assertTrue("Mensagem esperada [Your order on My Store is complete.]", 
				confirmacaoPage.apresentouMensagemEsperada(mensagem));
	}

	
}