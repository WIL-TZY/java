package exercicio2;

import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;
        
        // Fazendo interface
        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar Livros Disponíveis");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = scanner.next();
                    System.out.print("Autor do livro: ");
                    String autor = scanner.next();
                    System.out.print("Ano de publicação do livro: ");
                    int anoPublicacao = scanner.nextInt();
                    System.out.print("Identificador do livro: ");
                    String identificador = scanner.next();

                    Livro livro = new Livro(titulo, autor, anoPublicacao, identificador);
                    biblioteca.cadastrarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Identificador do livro a ser emprestado: ");
                    String idEmprestimo = scanner.next();
                    biblioteca.emprestarLivro(idEmprestimo);
                    System.out.println("Livro emprestado com sucesso!");
                    break;
                case 3:
                    System.out.print("Identificador do livro a ser devolvido: ");
                    String idDevolucao = scanner.next();
                    biblioteca.devolverLivro(idDevolucao);
                    System.out.println("Livro devolvido com sucesso!");
                    break;
                case 4:
                    System.out.println("===== Livros Disponíveis =====");
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}