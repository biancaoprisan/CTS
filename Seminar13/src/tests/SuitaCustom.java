package tests;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorie.GetPromovabilitateCategory;
import ro.ase.cts.categorie.TesteNormale;
import ro.ase.cts.categorie.TesteUrgente;

@RunWith(Suite.class)
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteUrgente.class, TesteNormale.class})
public class SuitaCustom {
	

	
	
}
