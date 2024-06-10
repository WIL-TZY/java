package aula5.interfaces;

public interface Professor {
	public default void darAula() {
		System.out.println("DANDO AULA DE PROGRAMAÇÃO");
	}
}
