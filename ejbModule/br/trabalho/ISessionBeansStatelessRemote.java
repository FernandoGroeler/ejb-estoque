package br.trabalho;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ISessionBeansStatelessRemote {
	void addProduto(Produto produto);
	List<Produto> getProdutos();
	Produto getProduto(int id);
	double getEstoque(int id);
}
