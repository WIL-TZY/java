package exercicio1;

public class Designer extends Funcionario {
	// Metodos GET e SET...

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.1;
		return bonificacao;
	}
}
