package aula7;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {
	
	public static void main(String[] args) {
		List<String> listaDeFrutas = new ArrayList<String>();
		listaDeFrutas.add("jabuticaba");
		listaDeFrutas.add("jerimum");
		listaDeFrutas.add("maçã");
		
		System.out.println(listaDeFrutas);
		System.out.println(listaDeFrutas.size());
		
		listaDeFrutas.add("carambola");
		listaDeFrutas.add("jerimum");
		
		System.out.println(listaDeFrutas.size());
		
		System.out.println(listaDeFrutas.indexOf("jerimum"));
		
		// For Each
		for (String fruta: listaDeFrutas) {
			System.out.println(fruta);
		}
		
		listaDeFrutas.remove("jerimum");
		
		System.out.println("\n");
		
		// For Each (method)
		// -> é a notação para lambda (as "arrow functions" do Javascript)
		listaDeFrutas.forEach(fruta -> {
			System.out.println("Índice de " + fruta + " é " + listaDeFrutas.indexOf(fruta));
		});		
	}
}
