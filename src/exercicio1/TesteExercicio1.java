package exercicio1;

import java.util.Scanner;

public class TesteExercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variáveis temporárias
		int tipo = 0;
		String newName = null;
		String newCPF = null;
		double newSalario = 0;
		
		Funcionario[] listaFuncionarios = new Funcionario[10];
		
		while (true) {
			System.out.println("Insira o número equivalente ao tipo do funcionário (1- Programador, 2- Designer ou 3- Gerente):\n");
			tipo = sc.nextInt();
			
			if (tipo == 1) {
				listaFuncionarios[0] = new Programador(newName, newCPF, newSalario);
				
				break;
			}
			else if (tipo == 2) {
				listaFuncionarios[0] = new Designer(newName, newCPF, newSalario); 
				break;
			}
			else if (tipo == 3) {
				listaFuncionarios[0] = new Gerente(newName, newCPF, newSalario); 
				break;
			}
			else {
				System.out.println("Inválido.\n");
				continue;
			}
		}
		
		// Novos dados (informados pelo usuário)
		System.out.println("Insira o nome do funcionário:\n");
		newName = sc.next();
		System.out.println("Insira o CPF do funcionário:\n");
		newCPF = sc.next();
		System.out.println("Insira o salário do funcionário:\n");
		newSalario = sc.nextDouble();
		
		// Bonificação do programador
		//programador.salario += programador.calcularBonificacao();
		
		
		// Bonificação do designer
		
		
		// Bonificação do gerente
		
		
		// Imprimindo na tela
		System.out.println(listaFuncionarios[0]);
				
		sc.close();
	}
}
