package exercicio1;

public class Gerente extends Funcionario {
	// Atributos ...
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double calcularBonificacao() {
		 double bonificacao = salario * 0.2;
		 return bonificacao;
	}	
}
