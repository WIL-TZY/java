package lista4;

public class ContaTesouroDireto extends ContaPoupanca {
	private static final double PORCENTAGEM2 = 0.01;
	
	public ContaTesouroDireto(String numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	// Override permite adaptar um método da classe pai para a classe filha
	@Override
	public void aplicarJurosMensais() {
		double juros = getSaldo() * PORCENTAGEM2;
		setSaldo(getSaldo() + juros);
	}
	
	// Sobrescrever método depositar()
	@Override
	public void depositar(double deposito) {
		if (deposito <=  1000) {
			// Com encapsulamento
			setSaldo(getSaldo() + deposito);
			
			// Sem encapsulamento - dá erro pois saldo é private e não pode ser acessado por uma subclasse
			// this.saldo += deposito;
		}
		super.depositar(deposito);
	}
}
