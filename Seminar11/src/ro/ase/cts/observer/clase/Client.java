package ro.ase.cts.observer.clase;

public class Client implements Observer{

	private String nume;
	
	public Client(String nume) {
		this.nume=nume;
	}
	
	@Override
	public void receptioneazaMesaj(String mesaj) {
		
		System.out.println(nume+ " ai primit mesajul: " + mesaj);
		
	}
	
}
