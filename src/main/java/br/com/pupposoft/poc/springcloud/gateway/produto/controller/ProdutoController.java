package br.com.pupposoft.poc.springcloud.gateway.produto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pupposoft.poc.springcloud.gateway.produto.controller.json.ProdutoJson;
import br.com.pupposoft.poc.springcloud.gateway.produto.domain.Produto;
import br.com.pupposoft.poc.springcloud.gateway.produto.usecase.ObterProdutoUsecase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")//NOSONAR
@RequestMapping("poc/monitoramento/produto/v1")
@RestController
@AllArgsConstructor
public class ProdutoController {

	private ObterProdutoUsecase obterProdutoUsecase;
	
	@GetMapping("produtos/{id}")
	public ProdutoJson obterProdutosPeloId(@PathVariable("id") Long id){
		
		log.info("TESTE id={}", id);
		
		Produto produto = obterProdutoUsecase.obterPorId(id);
		return new ProdutoJson(produto);
	}

}
