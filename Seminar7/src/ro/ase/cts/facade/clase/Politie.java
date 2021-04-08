package ro.ase.cts.facade.clase;

public class Politie {

	public boolean esteUrmarit(Persoana persoana) { 
		if (Integer.parseInt("" + persoana.getCNP().charAt(11)) % 2 == 0) {
			return false;

		}
		return true;
	}
	
	// e metoda (nu e static), pentru a accesa metoda trebuie sa ne cream un obiect de tip politie (
}
