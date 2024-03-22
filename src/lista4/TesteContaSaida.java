package lista4;

/*
2. O Banco do Brasil agora trabalha com investimentos em títulos do tesouro direto, que
possuem rendimentos superiores aos da poupança, no valor de 1% ao mês, no entanto
só é permitido depósitos acima de 1000 reais. Utilizando como base as classes da
questão 1, modele a classe ContaTesouroDireto herdando da classe ContaPoupança.
Após finalizar a modelagem siga os seguintes passos:
	a. Crie um array de ContaPoupança de 10 posições
	b. Instancie um objeto ContaTesouroDireto com seu número e saldo inicial de 10000
	reais e ponha esse objeto na primeira posição do array
	c. Instancie um objeto ContaPoupanca com seu número e saldo inicial de 10000
	reais e ponha esse objeto na segunda posição do array
	d. Acesse a primeira posição do array e imprima na tela o saldo dessa conta
	e. Acesse a segunda posição do array e imprima na tela o saldo dessa conta
	f. Deposite o valor de 500 reais na conta da primeira posição do array
	g. Acesse a primeira posição do array e imprima na tela o saldo dessa conta
	h. Deposite o valor de 500 reais na conta da segunda posição do array
	i. Acesse a segunda posição do array e imprima na tela o saldo dessa conta
	j. Aplique os juros mensais na conta da primeira posição do array
	k. Acesse a primeira posição do array e imprima na tela o saldo dessa conta
	l. Aplique os juros mensais na conta da segunda posição do array
	m. Acesse a segunda posição do array e imprima na tela o saldo dessa conta
*/

public class TesteContaSaida {
	
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
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("123-4", 1000);
		
		// j. Imprima na tela o valor do saldo da poupança
		contaPoupanca1.imprimirSaldo();
		
		// k. Deposite o valor de 1000 reais na poupança
		contaPoupanca1.depositar(1000);
		
		// l. Imprima na tela o valor do saldo da poupança
		contaPoupanca1.imprimirSaldo();
		
		// m. Aplique os juros mensais na poupança (de 0.5%)
		contaPoupanca1.aplicarJurosMensais();
		
		// n. Imprima na tela o valor do saldo da poupança
		contaPoupanca1.imprimirSaldo();
		
		// Criando um array com várias contas poupanças
		ContaPoupanca[] listaContas = new ContaPoupanca[10];
		
		// Criando conta tesouro direto
		ContaTesouroDireto contaTesouroDireto = new ContaTesouroDireto("1234-5", 100);
		
		// Adicionando conta tesouro direto ao array
		listaContas[0] = contaTesouroDireto;
		
		// 
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("6789-0", 10000);
		listaContas[1] = contaPoupanca2;
		
		ContaTesouroSELIC contaTesouroSELIC = new ContaTesouroSELIC("3333", 11110);
		listaContas[2] = contaTesouroSELIC;
		
		// Imprimir saldos
		listaContas[0].imprimirSaldo();
		listaContas[1].imprimirSaldo();
		listaContas[0].depositar(500);
		listaContas[0].imprimirSaldo();
		listaContas[1].depositar(500);
		listaContas[1].imprimirSaldo();
		listaContas[1].aplicarJurosMensais();
		listaContas[1].imprimirSaldo();
		
		/* 
			Conta conta = new Conta("1224", 200);
			listaContas[0] = conta;
			
		 Isso produzirá o seguinte erro:
		 	Type mismatch: cannot convert from Conta to ContaPoupanca
		 Pois não é possível usar uma instância da classe pai como um objeto que pertencente a sua classe filha.
		*/
	}
}
