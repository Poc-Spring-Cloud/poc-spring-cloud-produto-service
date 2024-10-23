package br.com.pupposoft.poc.springcloud.produto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pupposoft.poc.springcloud.produto.controller.json.ProdutoJson;
import br.com.pupposoft.poc.springcloud.produto.domain.Produto;
import br.com.pupposoft.poc.springcloud.produto.usecase.ObterProdutoUsecase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")//NOSONAR
@RequestMapping("poc/spring-cloud/v1")
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
