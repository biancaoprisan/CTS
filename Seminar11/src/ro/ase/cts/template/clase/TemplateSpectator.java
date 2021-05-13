package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {

	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seRealizeazaControlCorporal();	
	public abstract void ocupaLoc();
	
	public final void intrarePeStadion() { // metoda trebuie sa fie finala neaparat!! pentru a nu putea fi modificata
		seAseazaLaCoada();
		prezintaBiletul();
		seRealizeazaControlCorporal();
		ocupaLoc();
	}
}
