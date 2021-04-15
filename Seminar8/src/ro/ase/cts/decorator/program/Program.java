package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLMA;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		// B Resturant - exercitiu 7
		NotaAbstracta nota = new NotaDePlata(100);
		nota.printeaza();
		System.out.println();
		DecoratorAbstract decorator= new DecoratorNotaPasteFericit(nota);
		decorator.printeaza();
		System.out.println();
		DecoratorAbstract decorator1 = new DecoratorNotaLMA(nota);
		
		decorator1.printeaza();
		
		NotaAbstracta notaNoua= new NotaDePlata(8);
		DecoratorAbstract decoratorNou= new DecoratorNotaLMA(notaNoua);
		DecoratorAbstract decoratorNou1 = new DecoratorNotaPasteFericit(decoratorNou);
		System.out.println();
		decoratorNou1.printeaza();
		System.out.println();
		decoratorNou1.printeazaFelicitare();
	}

}
