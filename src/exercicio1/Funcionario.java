package exercicio1;

public abstract class Funcionario {
	public String nome;
	public String cpf;
	public double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
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

	// Implementação de classe abstrata
	public abstract double calcularBonificacao();
	
	public String toString() {
		return "### Dados do funcionário ###" + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nSalário: " + this.salario;
	}

}
