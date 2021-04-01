package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare rezervare1= new RezervareBuilder().setCodRezervare(1)
				.setAreMuzicaAmbientala(true).build();
		
		Rezervare rezervare2= new RezervareBuilder().setCodRezervare(5)
				.setAreBauturaInclusa(true).build();
		
		Rezervare rezervare3 = new Rezervare(false, true, false, false, null, 10);
		
		RezervareBuilder newBuilder= new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4 = newBuilder.setCodRezervare(80).build();
		Rezervare rezervare5 = newBuilder.setCodRezervare(81).build(); //face shallow copy
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		
		System.out.println(rezervare4);
		System.out.println(rezervare5);
	}

}
