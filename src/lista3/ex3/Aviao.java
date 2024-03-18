package lista3.ex3;

public class Aviao {
	public int altitudeKM, velocidadeKMh;
	
	public Aviao(int velocidadeKM, int altitudeKMh) {
		this.altitudeKM = altitudeKMh;
		this.velocidadeKMh = velocidadeKM;
	}
	
	// ------------------------------- Métodos ------------------------------- //
	// Gets
	public int getVelocidadeKMh() {
		return velocidadeKMh;
	}
	
	public int getAltitudeKM() {
		return altitudeKM;
	}
	
	// Sets
	public void setAltitudeKM(int altitudeKM) {
		this.altitudeKM = altitudeKM;
	}
	
	public void setVelocidadeKMh(int velocidadeKMh) {
		this.velocidadeKMh = velocidadeKMh;
	}
	
	public int reduzirAltitude(int reduzirAlt) {
		setAltitudeKM(altitudeKM - reduzirAlt); 
		return getAltitudeKM();
	}
	
	public int reduzirVelocidade(int reduzirVel) {
		setVelocidadeKMh(velocidadeKMh - reduzirVel);
		return getVelocidadeKMh();
	}
	
	public String toString() {
		return  "Dados do avião: " + 
				"\nAltitude: " + altitudeKM + " Km" +
				"\nVelocidade: " + velocidadeKMh + " Km/h";
	}
}
