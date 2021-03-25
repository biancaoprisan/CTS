package ro.acs.cts.SimpleFactory.clase;

public class FactoryPersonal {

	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) throws Exception {

		switch (tipPersonal) {
		case MEDIC: {
			Medic medic = new Medic(nume);
			return medic;
		}
		case ASISTENT: {
			return new Asistent(nume);
		}
		case BRANCARDIER: {
			return new Brancardier(nume);
		}
		default:
			throw new Exception();

		}
	}
}
