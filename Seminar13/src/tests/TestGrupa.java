package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import ro.ase.cts.categorie.GetPromovabilitateCategory;
import ro.ase.cts.categorie.TesteNormale;
import ro.ase.cts.categorie.TesteUrgente;

public class TestGrupa {
	
//	private Grupa grupa; // reminder: atribut, parametru e la metode 
//	
//	@Before
//	public void SetUp() {
//		
//		//acest setup va fi apelat de 12 ori, deoarece avem 12 teste dupa
//		grupa = new Grupa(1083);// initializam grupa declarata mai sus cu ajutorul constructorului
//		for(int i=0;i<35;i++) {
//			Student stud= new Student();
//			for(int j=0;j<7;j++) {
//				stud.adaugaNota(8);
//			}
//			grupa.adaugaStudent(stud);
//		}
//		
//	}

	@Test
	public void testConstructorCorect() {
		Grupa grupa= new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInf() {
		Grupa grupa= new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa= new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptieLimInf() {
		Grupa grupa= new Grupa(977);
		assertEquals(977, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(TesteNormale.class)
	public void testConstructorTrebuieSaArunceExceptieLimSup() {
		Grupa grupa= new Grupa(1400);
		assertEquals(1400, grupa.getNrGrupa());
	}
	
	@Test(timeout =500)
	@Category(TesteUrgente.class)
	public void testConstructorPerformant() {
		Grupa grupa= new Grupa(1050);
		
	}
	@Test
	public void testConstructorExistentaListaStudent() {
		Grupa grupa= new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for (int i =0;i<3;i++) {
			Student student= new Student("Ana");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i =0; i <7;i++) {
			Student student= new Student();
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		
		float promovabilitate=0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLowerBoundery() {
		Grupa grupa = new Grupa(1083);
		for (int i =0;i<3;i++) {
			Student student= new Student("Ana");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateUpperBoundery() {
		Grupa grupa= new Grupa(1083);
		for(int i =0; i <7;i++) {
			Student student= new Student();
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		float promovabilitate=1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
		
	}
	
	@Test( expected = IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateErrorCondition() {
		
		Grupa grupa= new Grupa(1083);
		grupa.getPromovabilitate();
	}
	
	@Test(timeout=500) //500 milisecunde
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitatePerformance()
	{
		Grupa grupa = new Grupa(1083);
		for(int i=0;i<35;i++) {
			Student stud= new Student();
			for(int j=0;j<7;j++) {
				stud.adaugaNota(8);
			}
			grupa.adaugaStudent(stud);
		}
		
		grupa.getPromovabilitate();
		
	}
}
