package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {


		  if(masa.getStareMasa() instanceof MasaLibera) {
			  System.out.println("Masa cu nr: " + masa.getNrMasa() + " trece in stare rezervata");
		  }
		  else {
			  masa.setStareMasa(this);
			  System.out.println("Masa cu nr: " + masa.getNrMasa() + " nu se poate rezerva");
		  }
		
	}

}
