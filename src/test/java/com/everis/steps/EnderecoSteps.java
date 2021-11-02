package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.pages.AutenticacaoPage;
import com.everis.pages.EnderecoPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import com.everis.util.Utils;

public class EnderecoSteps {
	
	
	@E("^confirma o endereco de entrega")
	public void confirmarEnderecoEntrega() {
		
		EnderecoPage enderecoPage = new EnderecoPage();
		enderecoPage.confirmarEnderecoEntrega();
		
	}

	
}