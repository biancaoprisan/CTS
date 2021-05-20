package ro.ase.cts.memento.clase;

public class Memento {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspete;
	
	public Memento(int nrSpectatori, String echipaGazda, String echipaOaspete) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public String getEchipaGazda() {
		return echipaGazda;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public String getEchipaOaspete() {
		return echipaOaspete;
	}

	public void setEchipaOaspete(String echipaOaspete) {
		this.echipaOaspete = echipaOaspete;
	}
	
	
	
	
}
