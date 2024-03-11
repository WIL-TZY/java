package lista1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("Esse programa verifica triângulos.\nDigite três números para representar cada lado do triângulo:");
		
		var scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (isTriangulo(a, b, c)) {
			boolean isEquilatero = (a == b && a == c);
			boolean isIsosceles = (a == b || a == c || b == c);
			// Equilatero
			if (isEquilatero) {
				System.out.println("O triângulo digitado é equilátero.");
			}
			else if (isIsosceles) {
				System.out.println("O triângulo digitado é isósceles.");
			}
			else {
				System.out.println("O triângulo digitado é escaleno.");
			}
		}
		else {
			System.out.println("Não é um triângulo.");
		}
	}
	
	// Checar se os três lados formam um triângulo válido
	public static boolean isTriangulo(int a, int b, int c) {
		return (a + b) > c;
	}
}
