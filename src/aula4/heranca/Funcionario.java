package aula4.heranca;

/* Classes abstratas
As classes abstratas são aquelas que possuem métodos abstratos.
Ou seja, que postergam a definição dos métodos abstratos para as subclasses.
	- Classes abstratas não podem ser instanciadas, somente suas subclasses.
	- Subclasses de uma classe abstrata que não implementarem os métodos abstratos terão erro de compilação.
	- Classes abstratas podem ter métodos concretos e abstratos.
*/
public abstract class Funcionario {
	private String nome;
	private String cpf;
	public double salario;
	
	// Metodos GET e SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularBonificacao() {
		 double bonificacao = salario * 0.1;
		 return bonificacao;
	}
	
	// Implementação de classe abstrata
	// public abstract double calcularBonificacao();
	
}
