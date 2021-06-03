package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.StudentFake;

public class TestPromovabilitateWithFake {

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		
		for(int i=0;i<8;i++) {
			StudentFake stud= new StudentFake();
			stud.setValoareAreRestante(false);
			grupa.adaugaStudent(stud);
		}
		for(int i=0;i<2;i++) {
			StudentFake stud= new StudentFake();
			stud.setValoareAreRestante(true);
			grupa.adaugaStudent(stud);
		}
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}

}
