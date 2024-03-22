package lista4;

public class ContaSaida {
	
	public static void main(String[] args) { 
		// a. Instancie um objeto ContaCorrente com seu número e saldo inicial de 1000 reais
		ContaCorrente contaCorrente1 = new ContaCorrente("123-4", 1000);
		
		// b. Imprima na tela o valor do saldo da conta
		contaCorrente1.imprimirSaldo();
		
		// c. Deposite o valor de 100 reais na conta
		contaCorrente1.depositar(100);
		
		// d. Imprima na tela o valor do saldo da conta
		contaCorrente1.imprimirSaldo();
		
		// e. Deposite o valor de 400 reais na conta
		contaCorrente1.depositar(400);
		
		// f. Imprima na tela o valor do saldo da conta
		contaCorrente1.imprimirSaldo();
		
		// g. Saque o valor de 200 reais da conta
		contaCorrente1.sacar(200);
		
		// h. Imprima na tela o valor do saldo da conta
		contaCorrente1.imprimirSaldo();
		
		// i. Instancie um objeto ContaPoupanca com seu número e saldo inicial de 5000 reais
		ContaPoupanca contaCorrente2 = new ContaPoupanca("123-4", 1000);
		
		// j. Imprima na tela o valor do saldo da poupança
		contaCorrente2.imprimirSaldo();
		
		// k. Deposite o valor de 1000 reais na poupança
		contaCorrente2.depositar(1000);
		
		// l. Imprima na tela o valor do saldo da poupança
		contaCorrente2.imprimirSaldo();
		
		// m. Aplique os juros mensais na poupança (de 0.5%)
		contaCorrente2.aplicarJurosMensais();
		
		// n. Imprima na tela o valor do saldo da poupança
		contaCorrente2.imprimirSaldo();
	}
}
