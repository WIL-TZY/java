package aulaArquivos;

import java.util.ArrayList;
import java.util.List;

public class QuestaoDadosList implements QuestaoDados {
	private List<Questao> questoes;

	public QuestaoDadosList() {
		this.questoes = new ArrayList<Questao>();
	}

	@Override
	public void salvar(Questao questao) {
		questoes.add(questao);
	}

	@Override
	public List<Questao> getQuestoes() {
		return questoes;
	}
}
