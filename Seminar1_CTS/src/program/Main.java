package program;



import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo z= new Zoo();
		Giraffe giraffe= new Giraffe("Girafa1");
		Giraffe giraffe1= new Giraffe("Girafa2")	;
		z.addAnimale(giraffe);
		z.addAnimale(giraffe1);
		
		z.feedAllAnimals();
		

	}

}
