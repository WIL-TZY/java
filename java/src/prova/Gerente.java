package prova;

public class Gerente extends Funcionario {
	// Atributos
	private int comissao;
	public String tipo = "Gerente";
	
	// Construtor
	public Gerente(String nome, String cpf, Departamento departamento, Cargo cargo, int comissao) {
		super(nome, cpf, departamento, cargo);
		this.setComissao(comissao);
	}

	// Metodos GET e SET
	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	// TO-DO
	@Override
	public double calcularComissao() {
		 double comissao = 9999 * 0.2;
		 return comissao;
	}
}
