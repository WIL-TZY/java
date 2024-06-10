package lista2.ex2;
/*
Dando prosseguimento ao sistema de Clínica Médica, crie uma classe “Medico” e uma classe “Endereco”
com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:

ATRIBUTOS DA CLASSE ENDERECO:
	rua, numero, complemento, bairro, cidade, uf, cep.
CONSTRUTOR DA CLASSE ENDERECO:
	Deve receber os parâmetros para iniciar os atributos: rua, numero, complemento, bairro, cidade, uf, cep.
ATRIBUTOS DA CLASSE MÉDICO:
	codigo, nome, sexo, especialidade, endereco.
CONSTRUTOR DA CLASSE MÉDICO:
	Deve receber os parâmetros para iniciar os atributos: codigo, nome, sexo, especialidade,
endereco. 
*/
public class Medico {
	// Atributos
	String codigo;
	String nome;
	String sexo;
	String especialidade;
	private Endereco endereco;
	
	// Construtor
	public Medico(String codigo, String nome, String sexo, String especialidade, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.especialidade = especialidade;
		this.endereco = endereco;
	}
	
	// Métodos
	public String toString() {
		return "\nCodigo: " + codigo + "\nNome: " + nome + "\nSexo: " + sexo + "\nEspecialidade: " + especialidade + "\nEndereço: " + endereco.toString();
	}
}
