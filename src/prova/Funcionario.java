package prova;

public abstract class Funcionario {
	public String nome;
	public String cpf;
	public Departamento departamento;
	public Cargo cargo;
	
	public Funcionario(String nome, String cpf, Departamento departamento, Cargo cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		this.cargo = cargo;
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
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	// Implementação de classe abstrata
	public abstract double calcularComissao();
	
	// Debug
	public String toString() {
		return "### Dados do funcionário ###" + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nDept.: " + this.departamento;
	}
}
