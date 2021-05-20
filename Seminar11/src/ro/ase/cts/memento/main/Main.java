package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		
		
		MeciJucat meci= new MeciJucat("CSM Bucuresti","Baia Mare",1000,1200,25);
		
		ManagerMemento manager= new ManagerMemento();
		manager.adaugaMemento(meci.creareMemento());
		
		meci.setEchipaGazda("Rapid");
		meci.setEchipaOaspete("FCSB");
		meci.setNrSpectatori(3000);
		meci.setNrSticle(10);
		
		manager.adaugaMemento(meci.creareMemento());
		System.out.println(meci.toString());
		
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());
		
		

	}

}
