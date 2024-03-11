package aula1;

import java.util.Scanner;

public class EntradaPadrao {
	public static void main(String[] args) {
		System.out.println("Digite um número qualquer: ");
		Scanner leitor = new Scanner(System.in);
		int inteiro = leitor.nextInt();
		
		System.out.println("O número digitado foi: " + inteiro);
		
		leitor.close();
	}
}
