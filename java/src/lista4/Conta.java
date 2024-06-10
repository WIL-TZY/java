package lista4;

/*
Você foi contratad@ para desenvolver um sistema para o Banco do Brasil. Modele as
classes ContaCorrente e ContaPoupanca utilizando o conceito de herança,
encapsulamento e abstração. Após finalizar a modelagem siga os seguintes passos:
	a. Instancie um objeto ContaCorrente com seu número e saldo inicial de 1000 reais
	b. Imprima na tela o valor do saldo da conta
	c. Deposite o valor de 100 reais na conta
	d. Imprima na tela o valor do saldo da conta
	e. Deposite o valor de 400 reais na conta
	f. Imprima na tela o valor do saldo da conta
	g. Saque o valor de 200 reais da conta
	h. Imprima na tela o valor do saldo da conta
	i. Instancie um objeto ContaPoupanca com seu número e saldo inicial de 5000 reais
	j. Imprima na tela o valor do saldo da poupança
	k. Deposite o valor de 1000 reais na poupança
	l. Imprima na tela o valor do saldo da poupança
	m. Aplique os juros mensais na poupança (de 0.5%)
	n. Imprima na tela o valor do saldo da poupança
*/

public class Conta {
	private String numeroConta;
	private double saldo;
	
	public Conta(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	// Gets
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	// Sets
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Métodos específicos
	public void depositar(double deposito) {
		setSaldo(getSaldo() + deposito);
	}
	
	public void sacar(double valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
		}
		else {
			System.out.println("O saldo é insuficiente.");
		}
	}
	
	// 
	public void imprimirSaldo() {
		System.out.println("Seu saldo é: " + getSaldo());
	}
}
