package aulaArquivos;

import java.util.List;

public interface QuestaoDados {
	public void salvar(Questao questao);

	public List<Questao> getQuestoes();
}
