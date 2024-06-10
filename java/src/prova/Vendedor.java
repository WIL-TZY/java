package prova;

public class Vendedor extends Funcionario {
	// Atributos únicos
	private Double totalVendas;
	public String tipo = "Vendedor";
	
	// Construtor
	public Vendedor(String nome, String cpf, Departamento departamento, Cargo cargo, Double totalVendas) {
		super(nome, cpf, departamento, cargo);
		this.totalVendas = totalVendas;
	}

	// Metodos GET e SET
	public Double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Double totalVendas) {
		this.totalVendas = totalVendas;
	}

	// Método para calcular o total de vendas?
	@Override
	public double calcularComissao() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
