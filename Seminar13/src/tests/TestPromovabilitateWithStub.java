package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import clase.StudentStub;

public class TestPromovabilitateWithStub {
// stub - returneaza valori hardcodate
	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		IStudent student = new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
		
		
	}

}
