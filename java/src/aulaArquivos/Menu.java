package aulaArquivos;

import java.util.Scanner;

// Responsável por acessar os dados, criar questões, etc.
public class Menu {
	private Scanner leitor;
	Quiz quiz;
	
	// Construtor
	public Menu() {
		this.leitor = new Scanner(System.in);
		this.quiz = new Quiz();
	}
	
	public void jogar() {
		int opcao = -1;
		
		while (opcao != 3) {

			System.out.println(
				"""
				Menu
				----------------
				1 - Cadastrar pergunta
				2 - Iniciar quiz
				3 - Sair
				"""
			);
			
			opcao = leitor.nextInt();
			leitor.nextLine();
			
			switch (opcao) {
				case 1 -> cadastrarQuestao();
				case 2 -> iniciarQuiz();
				case 3 -> {}
				default -> System.out.println("Opção inválida");
			}
		} // Fim do while
	}
	
	// Métodos
	private void cadastrarQuestao() {
		System.out.println("Qual a pergunta?");
		String pergunta = leitor.nextLine();
		System.out.println("Qual a resposta?");
		String resposta = leitor.nextLine();
		quiz.cadastrarQuestao(pergunta, resposta);
	}
	
	private void iniciarQuiz() {
		quiz.resetarJogo();
		var questoes = quiz.getQuestoes();
		for (Questao questao : questoes) {
			System.out.println(questao.pergunta());
			System.out.println("Resposta: ");
			String resposta = leitor.nextLine();
			if (quiz.verificarResposta(questao, resposta)) {
				System.out.println("Resposta certa, parabéns!");
			}
			else {
				System.out.println("Errou, anta!");
			}
		}
		System.out.println("Você acertou " + quiz.getPontos() + " de " + questoes.size());
	}
}
