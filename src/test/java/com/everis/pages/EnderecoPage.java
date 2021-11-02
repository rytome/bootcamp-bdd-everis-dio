package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class EnderecoPage extends BasePage {

	@FindBy(name = "processAddress")
	protected WebElement botaoProcessAddress;
	
	
	public EnderecoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void confirmarEnderecoEntrega() {
		botaoProcessAddress.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#carrier_area > h1"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("#carrier_area > h1"));
		Assert.assertEquals("SHIPPING", validaTexto.getText());
		log("Confirmou o endereco de entrega");
		
	}


}