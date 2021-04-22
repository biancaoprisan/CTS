package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Program {
  //Exercitiu B-10
	public static void main(String[] args) {
		Rezervare r1= new Rezervare(5,3,"17:00");
		Rezervare r2= new Rezervare(7,12,"20:00");
		Rezervare r3= new Rezervare(3,3,"18:00");
		
		FlyweightFactory fabrica= new FlyweightFactory();
		
		fabrica.getClient("0785588989").printeazaRezervare(r1);
		fabrica.getClient("072222").printeazaRezervare(r2);
		fabrica.getClient("0785588989").printeazaRezervare(r3);
	}
}
