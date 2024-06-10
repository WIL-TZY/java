package aula4.heranca;

public class Gerente extends Funcionario {
	// Atributos ...
	
	
	public double calcularBonificacao() {
	double bonificacao = super.calcularBonificacao();
	bonificacao += 1000;
	return bonificacao;
	}
	
}
