package program;



import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo z= new Zoo();
		Giraffe giraffe= new Giraffe("Girafa1");
		Giraffe giraffe1= new Giraffe("Girafa2")	;
		z.addAnimale(giraffe);
		z.addAnimale(giraffe1);
		
		z.feedAllAnimals();
		
		Zebra z1= new Zebra("zebra1");
		Zebra z2= new Zebra("zebra2");
		
		z.addAnimale(z1);
		z.addAnimale(z2);
		z.feedAllAnimals();
		

	}

}
