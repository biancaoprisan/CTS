package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import clase.StudentDummy;

public class TestGrupaWithDummy {
	//Avantaje:
// mock pentru atunci cand nu am clasa student
// nu ocupa spatiu, reduc memoria utilizata
	@Test
	public void testAdaugaStudent() {
		IStudent student= new StudentDummy();
		Grupa grupa = new Grupa(1083);
		grupa.adaugaStudent(student);
		assertEquals(1,  grupa.getStudenti().size());
		
	}

}
