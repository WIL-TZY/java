package lista2.ex2;

/*
private -> Apenas o objeto pode acessar
public -> Qualquer um pode acessar
protected -> 
*/

public class TesteEx2 {
	public static void main(String[] args) {
		// Medico dadosMedico; ----> Isso resultaria em um ponteiro nulo 
		
		// Criando objetos
		Endereco dadosEndereco = new Endereco(
				"Rua Moacir", 
				"45", 
				"Apto", 
				"Jardins", 
				"Guarulhos", 
				"7890-653"
		);
		
		Medico dadosMedico = new Medico(
				"209", 
				"Ricardo", 
				"Masculino", 
				"Neuro Cirurgião", 
				dadosEndereco
		);
		
		String resultado = dadosMedico.toString();
		System.out.println("Resultado: " + resultado);
		dadosEndereco.cidade = "Florianopolis";
		dadosMedico.nome = "Jurandir";
		System.out.println(dadosMedico); // Mesma coisa de colocar dadosMedico.toString() dentro do println()
	}
}
