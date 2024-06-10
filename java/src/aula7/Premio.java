package aula7;

import java.util.Objects;

public class Premio {
	// Atributos
	String nome;
	
	// Construtor
	public Premio(String nome) {
		super();
		this.nome = nome;
	}
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Overrides
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Premio other = (Premio) obj;
		return Objects.equals(nome, other.nome);
	}
}
