package ro.ase.cts.program;

import ro.ase.cts.clase.Abonat;
import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrokerTranzactie broker1 =  BrokerTranzactie.getInstance();
		BrokerTranzactie broker2= BrokerTranzactie.getInstance();
		
//		System.out.println(broker1.toString());
//		System.out.println(broker2.toString());
		
//		broker1.setName("Alina");
//		broker2.setNrTranzactiiEfectuate(9);
//		
//    	System.out.println(broker1.toString());
//		System.out.println(broker2.toString());
//		
//		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana", 7, 30);
//		BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstance("Bib", 4, 50);
//		
//		System.out.println(lazy1.toString());
//		System.out.println(lazy2.toString());
		
		Abonat abonat1 = Abonat.getInstance("Andrei", 6, 125.8);
		Abonat abonat2 = Abonat.getInstance("Andra", 12, 220);
		
		System.out.println(abonat1.toString());
		System.out.println(abonat2.toString());
		
		
	}

}
