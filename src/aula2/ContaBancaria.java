package aula2;

public class ContaBancaria {
	// Atributos de objeto
	String numero;
	double saldo; 
	
	// Construtor da classe
	public ContaBancaria(String numero, double saldo) {
		// Settando os atributos assim que se cria um objeto
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// Métodos do objeto
	void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	void debitar(double valor) {
		saldo = saldo - valor;
	}

	// Sobrecarga de métodos (uma assinatura de função diferente significa uma sobrecarga)
	void efetuarCompra(int quantidade) {
		// Blabla
	}
	
	void efetuarCompra(int quantidade, String produto) {
		// Blabla
	}
}
