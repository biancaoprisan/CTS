package ro.ase.cts.clase;

public class Abonat {

	private String nume;
	private int perioadaAbonare;
	private double costTotal;
	
	private static Abonat abonat = null; // instanta care trebuie sa fie initializata cu null pentru a fi initializata cu valori doar atunci cand e nevoie

	private Abonat(String nume, int perioadaAbonare, double costTotal) {
		super();
		this.nume = nume;
		this.perioadaAbonare = perioadaAbonare;
		this.costTotal = costTotal;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPerioadaAbonare(int perioadaAbonare) {
		this.perioadaAbonare = perioadaAbonare;
	}

	public void setCostTotal(double costTotal) {
		this.costTotal = costTotal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Abonat [nume=");
		builder.append(nume);
		builder.append(", perioadaAbonare=");
		builder.append(perioadaAbonare);
		builder.append(", costTotal=");
		builder.append(costTotal);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized Abonat getInstance(String nume, int perioadaAbonare, double costTotal)
	{
		if(abonat == null) 
		{
			abonat = new Abonat(nume, perioadaAbonare, costTotal);
		}
		return abonat;
	}
	
	
}
