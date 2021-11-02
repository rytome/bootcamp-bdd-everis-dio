package com.everis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.util.Hooks;

public class AutenticacaoPage extends BasePage {


	@FindBy(id = "email")
	protected WebElement campoEmail;
	
	@FindBy(id = "passwd")
	protected WebElement campoSenha;
	
	@FindBy(name = "SubmitLogin")
	protected WebElement botaoSubmitLogin;
	
	
	public AutenticacaoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void realizarLogin(String e_mail, String senha) {
		campoEmail.sendKeys(e_mail);
		campoSenha.sendKeys(senha);
		botaoSubmitLogin.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#center_column > h1"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("#center_column > h1"));
		Assert.assertEquals("ADDRESSES", validaTexto.getText());
		log("Realizou o login");
		
	}
	

}