package lista3.ex4;

public class Produto {
	public String nome;
	public double preco;
	public int quantidadeDisponivel;
	
	public Produto(String nome, double preco, int quantidadeDisponivel){
		this.nome = nome;
		this.preco = preco;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public int comprarProduto(int comprar) {
		return quantidadeDisponivel = quantidadeDisponivel - comprar; 
	}
	
	public String toString() {
		return "Dados do produto: " + 
				"\nNome: " + nome + 
				"\nPreço: " + preco +
				"\nQuantidade disponível: " + quantidadeDisponivel;
	}
}
