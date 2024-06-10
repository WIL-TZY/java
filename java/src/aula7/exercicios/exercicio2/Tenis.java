package aula7.exercicios.exercicio2;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

/*
Faça um programa em Java que leia 10 nomes de marcas de tênis e imprima cada uma delas. 
Utilize Set e HashSet. 
*/
public class Tenis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> marcas = new HashSet<>();

        // Ler os 10 nomes de marcas de tênis
        System.out.println("Digite 5 nomes de marcas de tênis:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Marca " + (i + 1) + ": ");
            String marca = scanner.nextLine();
            marcas.add(marca);
        }

        // Imprimir as marcas de tênis
        System.out.println("\nMarcas de tênis inseridas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        scanner.close();
    }
}
