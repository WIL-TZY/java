package aula7.exercicios.exercicio1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/*
Faça um programa em Java para ler o preço de um produto em cada um dos meses 
do ano e depois imprimir a média do valor do produto no ano. 
Utilize List e ArrayList.
*/
public class MediaProduto {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Double> precos = new ArrayList<>();

	        // Ler os preços do produto em cada mês do ano
	        for (int i = 1; i <= 12; i++) {
	            System.out.print("Digite o preço do produto no mês " + i + ": ");
	            double preco = scanner.nextDouble();
	            precos.add(preco);
	        }

	        // Calcular a média dos preços
	        double soma = 0;
	        for (double preco : precos) {
	            soma += preco;
	        }
	        double media = soma / precos.size();

	        // Imprimir a média dos preços
	        System.out.println("A média do preço do produto no ano é: " + media);

	        scanner.close();
	    }
}
