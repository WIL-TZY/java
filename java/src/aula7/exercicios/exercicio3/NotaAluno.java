package aula7.exercicios.exercicio3;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
Faça um programa em Java que leia o CPF e a nota de 5 alunos de uma disciplina e imprima a nota do aluno com CPF "030.111.654-45". 
Utilize Maps e HashMaps.
*/
public class NotaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> notasAlunos = new HashMap<>();

        // Ler o CPF e a nota de 5 alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o CPF do aluno " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
            notasAlunos.put(cpf, nota);
        }

        // Imprimir a nota do aluno com CPF "030.111.654-45"
        String cpfBusca = "030.111.654-45";
        if (notasAlunos.containsKey(cpfBusca)) {
            System.out.println("Nota do aluno com CPF " + cpfBusca + ": " + notasAlunos.get(cpfBusca));
        } else {
            System.out.println("Aluno com CPF " + cpfBusca + " não encontrado.");
        }

        scanner.close();
    }
}
