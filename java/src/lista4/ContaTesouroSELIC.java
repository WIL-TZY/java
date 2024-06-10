package lista4;

public class ContaTesouroSELIC extends ContaPoupanca {
	private static final double PORCENTAGEM2 = 0.01;
	
	public ContaTesouroSELIC(String numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	@Override
	public void aplicarJurosMensais() {
		double juros = getSaldo() * PORCENTAGEM2;
		setSaldo(getSaldo() + juros);
	}
	
	// Sobrescrever método depositar()
	@Override
	public void depositar(double deposito) {
		if (deposito <=  1000) {
			setSaldo(getSaldo() + deposito);
		}
		super.depositar(deposito);
	}
}
