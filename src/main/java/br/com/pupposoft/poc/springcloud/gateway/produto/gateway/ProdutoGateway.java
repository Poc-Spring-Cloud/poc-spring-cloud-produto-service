package br.com.pupposoft.poc.springcloud.gateway.produto.gateway;

import java.util.Optional;

import br.com.pupposoft.poc.springcloud.gateway.produto.domain.Produto;

public interface ProdutoGateway {

	Optional<Produto> obterPorId(Long id);

}
