package aula7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Demonstrando os diferentes tipos de coleções em Java.
/*
	OBS:
	Lists, Sets e Maps não precisam definir tamanho quando são instanciados.
	Podemos acrescentar quantos elementos quisermos, que o Set cresce conforme for necessário.
*/

/* Para saber mais 
	Type Wrappers e Autoboxing (e unboxing)
	Link: https://www.baeldung.com/java-wrapper-classes
*/
public class Colecoes {
	
	public static void main(String[] args) {
		// ------------------------------- LISTAS ------------------------------- //
		/* 
		Até o momento, arrays são o único tipo de estrutura que permite armazenar vários dados em em conjunto.
		Mas arrays tem algumas limitações:
			- Não podemos redimensioná-los;
			- Impossível buscar diretamente por um elemento cujo índice não se sabe;
			- Não conseguimos saber quantas posições do array já foram populadas.
		
		Por isso o Java possui uma API com vários tipos de estruturas de dados focados em resolver problemas distintos.
		A API de Collections traz a interface java.util.List, que especifica o que uma classe deve ser capaz de fazer para ser uma lista.

 		Uma lista é uma coleção que permite elementos duplicados e mantém uma ordenação específica entre os elementos.

		A implementação mais utilizada da interface List é a ArrayList, que trabalha como um array interno para gerar uma lista. 
		Outra implementação é a LinkedList.

		As listas são melhores do que arrays por dois fatores principais:
			- Listas não precisam ter um tamanho especificado ao serem invocadas
			- Listas tem vários métodos nativos que podem ser utilizados
		*/
		List<String> listaDeFrutas = new ArrayList<String>();
		listaDeFrutas.add("Jabuticaba");
		listaDeFrutas.add("Jerimum");
		listaDeFrutas.add("Maçã");
		
		System.out.println(listaDeFrutas);
		System.out.println(listaDeFrutas.size());
			
		listaDeFrutas.add("Carambola");
		listaDeFrutas.add("Jerimum");
		
		System.out.println(listaDeFrutas.size());
		
		System.out.println(listaDeFrutas.indexOf("Jerimum"));
		
		// ------------------------------------------------------------------------------------- //
		System.out.println("\n");
		// ------------------------------------------------------------------------------------- //
		
		imprimirColecao(listaDeFrutas);
		
		// Para remover itens da lista
		// listaDeFrutas.remove("Jerimum");
		
		// Para obter um item da lista armazenado na posição i da lista.
		String frutinha = listaDeFrutas.get(3); 
		System.out.println("A fruta no índice 3 é: " + frutinha);
		
		// ------------------------------------------------------------------------------------- //
		System.out.println("\n");
		// ------------------------------------------------------------------------------------- //
		
		// For Each (method)
		// -> é a notação para lambda (as "arrow functions" do Javascript)
		listaDeFrutas.forEach(fruta -> {
			System.out.println("Índice de " + fruta + " é " + listaDeFrutas.indexOf(fruta));
		});
		
		// ------------------------------------------------------------------------------------- //
		System.out.println("\n");
		// ------------------------------- HASH SETS (Conjuntos) ------------------------------- //
		/*
		Um Set funciona de forma análoga aos conjuntos da matemática, ele é uma coleção que não permite elementos duplicados.
		Outra característica é que Sets não garantem uma ordenação específica, ao contrário das listas.
		
		Um conjunto é representado pela interface Set e tem como suas principais implementações as classes:
			- HashSet
			- LinkedHashSet
			- TreeSet
		*/
	
		// Conjuntos são úteis para remover as duplicações de uma lista, ao transformá-la em um conjunto.
		
		// Para criar um HashSet, basta chamar o construtor: 
		// HashSet<Integer> numeros = new HashSet<Integer>(); 
		
		// É possível abstrair o set a partir da interface Set: 
		Set<String> conjuntoFrutas = new HashSet<String>(listaDeFrutas);
		
		for (String fruta : conjuntoFrutas) {
			System.out.println(fruta);
		}
		
		System.out.println("^--- Dá pra notar que a ordem está totalmente aleatória.");
		
		// Limpar a listaDeFrutas
		listaDeFrutas.clear();

		// Adicionar os elementos do conjunto de volta ao listaDeFrutas
		listaDeFrutas.addAll(conjuntoFrutas);
		
		listaDeFrutas.sort(null);
		
		imprimirColecao(listaDeFrutas);
		
		System.out.println("^--- Depois de usar o método .sort(), agora a lista está em ordem alfabética.");
		
		// ------------------------------------------------------------------------------------- //
		System.out.println("\n");
		// ------------------------------- HASH SETS (Conjuntos) ------------------------------- //
		
		// HASH MAPS
		// Um mapa é um tipo específico de coleção que armazena chaves e valores associados.
		
		/*
		Muitas vezes queremos buscar rapidamente um objeto dado alguma informação sobre ele. 
		Um exemplo seria, dada a placa do carro, obter todos os dados do carro. 
		Poderíamos utilizar uma lista para isso e percorrer todos os seus elementos, 
		mas isso pode ser péssimo para a performance, mesmo para listas não muito grandes.
		
		Um mapa é composto por um conjunto de associações entre um objeto chave a um objeto valor.
		
		java.util.Map é um mapa, pois é possível usá-lo para mapear uma chave a um valor
		
		Suas principais implementações são: 
			- HashMap 
			- TreeMap 
			- Hashtable
		*/
	
		// Para criar e instanciar um HashMap basta chamar o construtor:
		// HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		List<Premio> listaDePremios = List.of(new Premio("Oscar"), new Premio("Grammy"));
		
		listaDePremios.hashCode();
		
		List<Premio> premiosEntretenimento = new ArrayList<Premio>(List.of(new Premio("Oscar")));
		List<Premio> premiosCiencia = new ArrayList<Premio>(List.of(new Premio("Fields"), new Premio("Fields")));
		
		Map<Integer, List<Premio>> mapa = new HashMap<Integer, List<Premio>>();

		mapa.put(1, premiosEntretenimento);
		mapa.put(2, premiosCiencia);
		
		System.out.println(mapa.containsValue(listaDePremios));			// false
		System.out.println(mapa.containsValue(premiosEntretenimento));	// true
		System.out.println(mapa.containsValue(premiosCiencia));			// true
		
		// O método put(Object, Object) da interface Map recebe a chave e o valor de uma nova associação. 
		// Para saber o que está associado a um determinado objeto-chave, passa-se esse objeto no método get(Object). 
		HashMap<String, Double> salarios = new HashMap<String, Double>(); 
		salarios.put("diretor", 10000.0); 
		salarios.put("gerente", 5000.0); 
		double salarioDiretor = salarios.get("diretor");
		System.out.println("Salario do diretor: " + salarioDiretor);
	}
	
	// Método para varrer coleções e imprimí-las usando notação 'For Each'
	private static void imprimirColecao(Collection<String> frutas) {
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
	}
}
