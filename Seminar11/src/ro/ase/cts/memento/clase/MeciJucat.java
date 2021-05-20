package ro.ase.cts.memento.clase;

public class MeciJucat {

	private String echipaGazda;
	private String echipaOaspete;
	private int nrSpectatori;
	private int nrBilete;
	private int nrSticle;
	
	
	public MeciJucat(String echipaGazda, String echipaOaspete, int nrSpectatori, int nrBilete, int nrSticle) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrSpectatori = nrSpectatori;
		this.nrBilete = nrBilete;
		this.nrSticle = nrSticle;
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
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getNrBilete() {
		return nrBilete;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public int getNrSticle() {
		return nrSticle;
	}
	public void setNrSticle(int nrSticle) {
		this.nrSticle = nrSticle;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspete=");
		builder.append(echipaOaspete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSticle=");
		builder.append(nrSticle);
		builder.append("]");
		return builder.toString();
	}
	
	public Memento creareMemento() {
		
		Memento memento= new Memento(nrSpectatori, echipaGazda, echipaOaspete);
	return memento;
	}
	
	public void setMemento(Memento memento)
	{
	   nrSpectatori= memento.getNrSpectatori();
	   echipaGazda= memento.getEchipaGazda();
	   echipaOaspete= memento.getEchipaOaspete();
	}
	
}
