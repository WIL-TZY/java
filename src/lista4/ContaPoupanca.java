package lista4;

public class ContaPoupanca extends Conta {
	private static final double PORCENTAGEM = 0.005;
	
	// Construtor
	public ContaPoupanca(String numeroConta, double saldo) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	public void aplicarJurosMensais() {
		double juros = getSaldo() * PORCENTAGEM;
		setSaldo(getSaldo() + juros);
	}
}
