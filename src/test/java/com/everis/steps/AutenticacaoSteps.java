package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.pages.AutenticacaoPage;


import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import com.everis.util.Utils;

public class AutenticacaoSteps {
	
	
	@E("^realiza o login com e_mail \"(.*)\" e senha \"(.*)\"$")
	public void realizarLogin(String e_mail, String senha) {
		
		AutenticacaoPage autenticacaoPage = new AutenticacaoPage();
		autenticacaoPage.realizarLogin(e_mail, senha);
	}

	
}