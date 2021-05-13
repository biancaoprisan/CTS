package ro.ase.cts.observer.clase;

public interface Subject {

	void adaugareAbonat(Observer observer);
	void dezabonareAbonat(Observer observer);
	void trimiteMesaj(String mesaj);
}
