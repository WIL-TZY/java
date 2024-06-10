package lista3.ex4;

public class TesteEx4 {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Água mineral", 10.99, 10);
		
		System.out.println("Nome: " + produto1.nome + "\nPreço: "+ produto1.preco);
		
		produto1.comprarProduto(1);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);
		
		produto1.comprarProduto(1);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);
	
		produto1.comprarProduto(9);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);
	}
}
