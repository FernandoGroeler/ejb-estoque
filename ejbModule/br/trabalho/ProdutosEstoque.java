package br.trabalho;

public enum ProdutosEstoque {
	CAMISA(1, "Camisa", 50, 20),
	CALCA(2, "Calça", 70, 15),
	TENIS(3, "Tênis", 150, 10),
	CAMISETA(4, "Camiseta", 30, 0),
	MEIA(5, "Meia", 12, 30);
	
	private final int id;
	private final String descricao;
	private final double preco;
	private final double estoque;
	
	private ProdutosEstoque(int id, String descricao, double preco, double estoque) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getEstoque() {
		return estoque;
	}

	@Override
	public String toString() {
		return getDescricao();
	}
}
