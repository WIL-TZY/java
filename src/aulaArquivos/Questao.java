package aulaArquivos;

// Para transformar objetos em binários
import java.io.Serializable;

public record Questao(String pergunta, String resposta) implements Serializable {
	public boolean verificarResposta(String resposta) {
		return this.resposta.equals(resposta); // <--- parâmetro
			// ^--- objeto
	}
}
