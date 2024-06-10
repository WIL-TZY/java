package exercicio1;

public class Programador extends Funcionario {
	// private String linguagem;
	
	// Construtor
	public Programador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	// Metodos GET e SET...

	
	// Sobrescrita de método
	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.15;
		return bonificacao;
	}
}
