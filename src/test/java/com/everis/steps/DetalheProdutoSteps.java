package com.everis.steps;



import com.everis.pages.DetalheProdutoPage;
import com.everis.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.E;

public class DetalheProdutoSteps {


	@E("^aumenta a quantidade produto$")
	public void aumentarQuantideProduto() {
		DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
		detalheProdutoPage.aumentarQuantideProduto();
	}
	
}