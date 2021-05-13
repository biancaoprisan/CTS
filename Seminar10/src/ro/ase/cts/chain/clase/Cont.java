package ro.ase.cts.chain.clase;
//clasa abstracta deoarece avem relatie de has a cu ea insasi
public abstract class Cont {

	private Cont succesor;
	private float sold;
	
	public Cont(float sold) {
		super();
		this.sold = sold;
		this.succesor=null;
	}
//getter pt a putea apela in clasele concrete
	public Cont getSuccesor() {
		return succesor;
	}
//obligatoriu setter pentru succesor
	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}
	
	
	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public abstract void plateste(float suma);
	
}
