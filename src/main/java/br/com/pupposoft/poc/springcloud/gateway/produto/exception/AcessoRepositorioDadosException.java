package br.com.pupposoft.poc.springcloud.gateway.produto.exception;

import lombok.Getter;

@Getter
public class AcessoRepositorioDadosException extends SystemBaseException {
	private static final long serialVersionUID = -6654030559370463731L;
	
	private final String code = "produto-service.erroAcessarRepositorioDados";//NOSONAR
	private final String message = "Erro ao acessar o repositorio de dados";//NOSONAR
	private final Integer httpStatus = 500;//NOSONAR
}
