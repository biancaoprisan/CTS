package ro.ase.cts.observer.program;

import java.util.Observer;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
// sportiv - ex. 12 - abonarea la un eveniment
public class Program {

	public static void main(String[] args) {
		ManagerSala managerSala= new ManagerSala("Sala nr 3");
		Client client1= new Client("Alin");
		Client client2= new Client("Marius");
		Client client3= new Client("Ionut");
		
		managerSala.adaugareAbonat(client1);
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("Handbal");
			
		
		managerSala.dezabonareAbonat(client3);
		managerSala.trimiteAnuntImportant("Fotbal");
	}
}
