package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class ConfirmacaoPage extends BasePage {

	public ConfirmacaoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public boolean apresentouMensagemEsperada(String mensagem) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > div > p > strong"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("#center_column > div > p > strong"));
		
		boolean apresentouMensagemEsperada = mensagem.equals(validaTexto.getText());
		if (apresentouMensagemEsperada) {
			log("Apresentou a mensagem [" + mensagem + "]");
			return true;
		}
		logFail("Deveria ter apresentado a mensagem [" + mensagem + "]");
		return false;
	}


}