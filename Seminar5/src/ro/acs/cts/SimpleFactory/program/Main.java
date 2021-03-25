package ro.acs.cts.SimpleFactory.program;

import ro.acs.cts.SimpleFactory.clase.FactoryPersonal;
import ro.acs.cts.SimpleFactory.clase.TipPersonal;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factory ne ajuta in procesul de creare obiecte
		
		
		try {
			FactoryPersonal factory= new FactoryPersonal();
			ro.acs.cts.SimpleFactory.clase.PersonalSpital medic=  factory.getPersonal(TipPersonal.MEDIC, "Diana");
			ro.acs.cts.SimpleFactory.clase.PersonalSpital asistent= factory.getPersonal(TipPersonal.ASISTENT, "Andrei");
			System.out.println(medic.toString());
			System.out.println(asistent.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
