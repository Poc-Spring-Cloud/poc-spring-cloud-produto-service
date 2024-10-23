package br.com.pupposoft.poc.springcloud.gateway.produto.exception;

import lombok.Getter;

@Getter
public class ProdutoNaoEncontradoException extends SystemBaseException {
	private static final long serialVersionUID = 925166288542143659L;
	
	private final String code = "produto-service.produtoNaoEncontrado";//NOSONAR
	private final String message = "Produto não foi encontrado";//NOSONAR
	private final Integer httpStatus = 404;//NOSONAR
}
