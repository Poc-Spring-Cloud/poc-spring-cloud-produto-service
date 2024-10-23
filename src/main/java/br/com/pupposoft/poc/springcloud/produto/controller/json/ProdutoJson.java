package br.com.pupposoft.poc.springcloud.produto.controller.json;

import br.com.pupposoft.poc.springcloud.produto.domain.Produto;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProdutoJson {
	private Long id;
	private String nome;
	private Double preco;

	public ProdutoJson(Produto produto) {
		id = produto.getId();
		nome = produto.getNome();
		preco = produto.getPreco().doubleValue();
	}
}
