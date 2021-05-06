package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	private List<Comanda> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda comanda) {
		comenzi.add(comanda); // adauga la sf liste
	}
	
	public void executaComanda() {
		if(!comenzi.isEmpty()) {
			comenzi.get(0).executa(); // o luam pe prima
			comenzi.remove(0);
		}
	}
	
	
}
