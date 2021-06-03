package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.Student;
import ro.ase.cts.categorie.GetPromovabilitateCategory;

public class TestGrupaCuFixture {

	Grupa grupa;

	@Before
	public void SetUp() {
		

		grupa = new Grupa(1083);
		for(int i=0;i<35;i++) {
			Student stud= new Student();
			for(int j=0;j<7;j++) {
				stud.adaugaNota(8);
			}
			grupa.adaugaStudent(stud);
		}
		
	}
	@Test(timeout=500) 
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}
