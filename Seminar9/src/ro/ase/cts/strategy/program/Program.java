package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Portofel portofel1 = new Portofel(500);
		Client client1= new Client(portofel1, "George");
		
		client1.platesteNota(200);
	client1.setStrategy(new Card());
	
	client1.platesteNota(350);
	client1.setStrategy(portofel1);
	
	client1.platesteNota(589);

	}

}
