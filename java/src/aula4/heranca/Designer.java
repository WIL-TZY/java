package aula4.heranca;

public class Designer extends Funcionario {
	// Atributos ...
	
	// Metodos GET e SET...

	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.1;
		return bonificacao;
	}

}
