package ro.ase.cts.Flyweight.clase;

public class Rezervare {
	
	private int nrMasa;
	private int nrPers;
	private String oraRezervare;
	
	public Rezervare(int nrMasa, int nrPers, String oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPers=");
		builder.append(nrPers);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	

}
