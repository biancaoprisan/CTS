package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Gigel";
		Student student = new Student(nume);	
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		//assertNotEquals(student.getNote(), null); //ce asteptam vs ce primim
	    assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		
		Student student = new Student();	
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
     
     
	@Test
	public void testSetterNume() {
		String nume ="Gigel";
		Student student = new Student();	
		student.setNume(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int nota1=10;
		int nota2=9;
		int nota3=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie= (nota1+nota2+nota3)/3;
		
		assertEquals(medie, student.calculeazaMedie(),0.01f);
		
		
	}
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student = new Student();
		int nota1=10;
	
		student.adaugaNota(nota1);			
		assertEquals(nota1, student.calculeazaMedie(),0.01f);
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNote() {
		Student student = new Student();		
		
		student.calculeazaMedie();
		
		
	}
	@Test
	public void testVerificaRestante() {
		Student student = new Student();
		int nota1 =8;
		int nota2=9;
		int nota3=3;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificaNuAreRestante() {
		Student student = new Student();
		int nota1 =8;
		int nota2=9;
		int nota3=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();
		int nota1=8;
		int nota2=10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		//1
		try {//2
			student.getNota(3);
			fail("metoda nu arunca exceptie");
			//3
		} catch(IndexOutOfBoundsException exceptie) {
			//4
		}
		//5
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		
		Student student = new Student();
		int nota=11;
		student.adaugaNota(11);
	}
	
	
}
