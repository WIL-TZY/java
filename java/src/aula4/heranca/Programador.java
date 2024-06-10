package aula4.heranca;

public class Programador extends Funcionario {
	private String linguagem;
	// Metodos GET e SET...

	
	// Sobrescrita de método
	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.2;
		return bonificacao;
		}
}
