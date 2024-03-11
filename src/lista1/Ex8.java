package lista1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		String[] gabarito = { "a", "b", "c", "d", "e", "e", "d", "c", "b", "a" };
		String resposta;
		Scanner scanner = new Scanner(System.in);
		int nota = 0;
		
		for (int i = 0; i < gabarito.length; i++) {
			System.out.println("Digite a resposta da questão " + i + ": ");
			resposta = scanner.nextLine();
			if (resposta.equals(gabarito[i])) { // O método equals() deve ser usado p/ comparar strings
				nota++;
			}
		}
		System.out.println("Nota: " + nota);
	}
}
