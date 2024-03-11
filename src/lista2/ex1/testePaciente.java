package lista2.ex1;

import java.util.Arrays;

public class testePaciente {
	public static void main(String[] args) {
		Paciente pai = new Paciente(
			001, 
			"Jose",
			"25/03/1959", 
			'M',
			Arrays.asList(), 
			"A+"
		);
		
		Paciente mae = new Paciente(
			002,
			"Catarina",
			"26/11/1960",
			'F',
			Arrays.asList("camarao", "coco"),
			"A+"
		);
		
		// Modificando atributos
		pai.tipoSanguineo = "B+";
		mae.tipoSanguineo = "A-";
		
		// Imprimindo atributos
		System.out.println(pai);
		System.out.println(mae);
		
	}
}
