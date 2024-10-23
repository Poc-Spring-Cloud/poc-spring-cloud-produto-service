package br.com.pupposoft.poc.springcloud.gateway.produto.gateway.database;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.pupposoft.poc.springcloud.gateway.produto.domain.Produto;
import br.com.pupposoft.poc.springcloud.gateway.produto.exception.AcessoRepositorioDadosException;
import br.com.pupposoft.poc.springcloud.gateway.produto.gateway.ProdutoGateway;
import br.com.pupposoft.poc.springcloud.gateway.produto.gateway.database.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@AllArgsConstructor
public class ProdutoRepositoryGateway implements ProdutoGateway {

	private final ProdutoRepository produtoRepository;
	
	@Override
	public Optional<Produto> obterPorId(Long id) {
		try {
			
			return produtoRepository.findById(id)
				.map(produtoEntity -> new Produto(
					produtoEntity.getId(),
					produtoEntity.getNome(),
					BigDecimal.valueOf(produtoEntity.getPreco())
				));
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AcessoRepositorioDadosException();
		}
	}
}
