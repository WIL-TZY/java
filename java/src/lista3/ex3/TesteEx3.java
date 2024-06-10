package lista3.ex3;

public class TesteEx3 {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao(900, 10);
		
		System.out.println(aviao1);
		
		aviao1.reduzirAltitude(1);
		aviao1.reduzirVelocidade(100);
		
		System.out.println("\n" + aviao1);
		
		aviao1.reduzirAltitude(10);
		aviao1.reduzirVelocidade(200);
		
		System.out.println("\n" + aviao1);
	}
}
