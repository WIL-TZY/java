package aula2;

public class Main {
	// Como criar um objeto (comando new)
	public static void main(String[] args) {
		// Criando uma conta ao instanciar um objeto da classe ContaBancaria com valores iniciais
		ContaBancaria minhaConta = new ContaBancaria("123-4", 200);
		ContaBancaria contaWanessaCamargo = new ContaBancaria("000-0", -1000000);
		ContaBancaria contaAmadoBatista = new ContaBancaria("999-9", 40000);
		 
		// Creditando 30 ao saldo
		minhaConta.creditar(30);
		
		// Imprimindo saldo
		double meuSaldo = minhaConta.saldo;
		System.out.println("Saldo da minha conta: " + meuSaldo);
		System.out.println(contaWanessaCamargo.saldo);
		System.out.println(contaAmadoBatista.saldo);
	}
}
