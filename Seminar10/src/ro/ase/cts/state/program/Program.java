package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.MasaLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa= new Masa(3);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		//masa.setStareMasa(new MasaLibera());
		masa.ocupaMasa();
		masa.elibereazaMasa();
		
//		The protected keyword is an access modifier used 
//		for attributes, methods and constructors,
//		making them accessible in the same package and subclasses.

	}
}
