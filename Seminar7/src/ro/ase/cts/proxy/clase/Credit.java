package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract  {

	@Override
	public void oferaCredit(TipMoneda tipMoneda, float suma) {
	System.out.println("S-a realizat un credit in " +tipMoneda+ " suma de " +suma);
		
	}

}
