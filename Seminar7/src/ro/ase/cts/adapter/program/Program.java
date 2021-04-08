package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdaptorCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Program {

	public static void afiseazaInformatiiCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}
	
	public static void main(String[] args) {
  
		Leasing leasing = new Leasing(100, "Ionut");
		//afiseazaInformatiiCredit(leasing, leasing1.getSuma()); nu putem accesa leasing
		AdaptorCreditObiecte adaptor= new AdaptorCreditObiecte(leasing);
		afiseazaInformatiiCredit(adaptor, leasing.getSuma());


	}

}
