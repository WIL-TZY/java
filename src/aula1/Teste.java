package aula1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Apostila Java: https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf

// JVM - A virtual machine (VM) de Java. Esse download não existe, ela sempre vem acompanhada de uma JRE.
// JRE - 

//Ctrl + Shift + F -> Identação automática

// Classe é uma unidade de modularização que define a estrutura dos objetos em Java
// Todo arquivo Java deve ter exatamente o mesmo nome da classe pública
public class Teste {

	public record Pessoa(String nome, int idade) {} // (Java17) record
	
	public static void main(String[] args) {
		String msg = "Hello World!";
		System.out.println(msg);
		
		// Função e concatenação em Java
		int num1 = 5;
		int num2 = 10;
		int soma = Soma(num1, num2);
		System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
		
		// Java4 -> Annotations
		
		// Listas em Java
		List<String> saudacoes = Arrays.asList("Olá, mundo!", "Hello World!", "Hola, mundo!");
		System.out.println(saudacoes);
		
		// Manipulação de Strings em Java (Java8)
		List<String> saudacoesMaiusculas = saudacoes.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(saudacoesMaiusculas);
		
		// Java14 - Multiline Strings
		String json = """
				bla bla bla
					la la la
				lero lero lero lero
				aaaaaaaa aaaaaaaaaa
				""";
		
		// Java17 - Otimização em criação de classes graças a keyword 'record'
		var p = new Pessoa("Gunter", 35);
		System.out.println(p.nome);
		
	}

	private static int Soma(int num1, int num2) {
		return num1 + num2;
	}
}
