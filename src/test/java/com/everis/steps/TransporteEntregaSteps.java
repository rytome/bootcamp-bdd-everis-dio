package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.pages.AutenticacaoPage;
import com.everis.pages.EnderecoPage;
import com.everis.pages.TransporteEntregaPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import com.everis.util.Utils;

public class TransporteEntregaSteps {
	
	
	public void aceitarTermos() {
		
		TransporteEntregaPage transporteEntregaPage = new TransporteEntregaPage();
		transporteEntregaPage.aceitarTermos();
		
	}
	
	
	@E("^escolhe a forma de trasporte")
	public void escolherFormaTransporte() {
		
		TransporteEntregaPage transporteEntregaPage = new TransporteEntregaPage();
		transporteEntregaPage.escolherFormaTransporte();
	
		transporteEntregaPage.aceitarTermos();
		
	}
	
}