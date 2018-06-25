package br.trabalho;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class SessionBeansStateless implements ISessionBeansStatelessRemote {
	List<Produto> produtos = new LinkedList<>();
	
	public SessionBeansStateless() {
		adicionarProdutosEstoque();
	}
	
	private void adicionarProdutosEstoque() {
		for (ProdutosEstoque prodEst : ProdutosEstoque.values()) {
			Produto prod = new Produto();
			prod.setId(prodEst.getId());
			prod.setDescricao(prodEst.getDescricao());
			prod.setPreco(prodEst.getPreco());
			prod.setEstoque(prodEst.getEstoque());
			
			produtos.add(prod);
		}
	}
	
	@Override
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	@Override
	public Produto getProduto(int id) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}	

	@Override
	public List<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public double getEstoque(int id) {
		Produto prod = getProduto(id);
		
		if (prod != null) {
			return prod.getEstoque();
		} else {
			return 0;
		}
	}
}
