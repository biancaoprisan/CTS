package ro.ase.cts.clase;

public class BrokerTranzactieLazy {

	   private String name;
	   private int vechime;
	   private int nrTranzactiiEfectuate;   
	   
	   
	private static BrokerTranzactieLazy broker = null;
	private BrokerTranzactieLazy(String name, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.name = name;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setVechime(int vechime) {
		this.vechime = vechime;
	}



	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactieLazy [name=");
		builder.append(name);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	
	public static BrokerTranzactieLazy getInstance(String name, int vechime, int nrTranzactiiEfectuate) {
		if(broker == null) { // daca nu am verifica, ar apela de fiecare data constructorul
			broker = new BrokerTranzactieLazy(name, vechime, nrTranzactiiEfectuate);
		}
		return broker;
	}
	
	
}
