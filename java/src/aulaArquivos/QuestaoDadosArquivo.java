package aulaArquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
	Java IO vs NIO:
	https://www.baeldung.com/java-io-vs-nio 
*/
public class QuestaoDadosArquivo implements QuestaoDados {
	
	@Override
	public void salvar(Questao questao) {
		var questoes = getQuestoes();
		questoes.add(questao);
		
		try {
			// Escrita
			var FOS = new FileOutputStream("dados.txt"); // segundo argumento é append
			var OOS = new ObjectOutputStream(FOS);
			OOS.writeObject(questoes);
		}
		catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public List<Questao> getQuestoes() {
		var questoes = new ArrayList<Questao>();
		try {
			// Leitura
			var FIS = new FileInputStream("dados.txt");
			var OIS = new ObjectInputStream(FIS);
			questoes = (ArrayList<Questao>) OIS.readObject();
		
		// Prevenir a leitura pós EOF
		} catch (FileNotFoundException e) {
			return new ArrayList<Questao>();
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return questoes;
	}
}
