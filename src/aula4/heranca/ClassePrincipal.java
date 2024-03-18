package aula4.heranca;

public class ClassePrincipal {
	 public static void main(String[] args) {
		Programador programador = new Programador();
	 	String nome = "Agenor de Miranda Araújo Neto";
	 	programador.setNome(nome);
		programador.setCpf("123456789-12");
		programador.setSalario(5000);
		// programador.setLinguagem("Java");
		
		Designer designer = new Designer();
		designer.setNome("Emival Eterno Costa");
		designer.setSalario(5000);
		
		System.out.println(programador.calcularBonificacao());
		System.out.println(designer.calcularBonificacao());
	 }
}
