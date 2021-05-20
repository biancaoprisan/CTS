package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	
	private List<Memento> mementos= new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	
	public Memento getMemento(int position) {
		if(position>=0 && position<=mementos.size())
			return mementos.get(position);
		else {
			throw new IllegalArgumentException("Incompatibil");
		}
			
	}

}
