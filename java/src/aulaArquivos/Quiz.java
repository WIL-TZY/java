package aulaArquivos;

// Classe do usuário
import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private Integer pontos;
	private QuestaoDados questaoDados;
	
	// Construtor
	public Quiz() {
		super();
		// Reiniciar pontos quando o quiz começa
		this.pontos = 0;
		this.questaoDados = new QuestaoDadosArquivo();
	}

	public void cadastrarQuestao(String pergunta, String resposta) {
		Questao questao = new Questao(pergunta, resposta);
		questaoDados.salvar(questao);
	}
	
	public void resetarJogo() {
		this.pontos = 0;
	}
	
	// Getters & Setters
	public Integer getPontos() {
		return this.pontos;
	}
	
	public List<Questao> getQuestoes() {
		return questaoDados.getQuestoes();
	}

	public boolean verificarResposta(Questao questao, String resposta) {
		boolean isRespostaCerta = questao.verificarResposta(resposta);
		if (isRespostaCerta) {
			this.pontos++;
		}
		return isRespostaCerta;
	}
}
