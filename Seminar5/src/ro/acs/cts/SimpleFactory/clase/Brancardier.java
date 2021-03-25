package ro.acs.cts.SimpleFactory.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancadier [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}

	
}
