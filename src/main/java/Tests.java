import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
	
public class Tests extends TestCase {
	
	public static TestSuite suite() {
	return new TestSuite(Test.class);
	}
	
	//test 2 sommes dont une a resultat negatif
	public void somme13ShouldBeOk()
	{
		Calculatrice somme1 = new Calculatrice();
		assertTrue( somme1.additionner(1,3)==4 );
	}
	
	public void somme4Moins8ShouldBeOk()
	{
		Calculatrice somme2 = new Calculatrice();
		assertTrue( somme2.additionner(4,-8)==-4 );
	}
	
	
	//test 2 soustractions dont un a resultat negatif 
	public void soustraction43ShouldBeOk()
	{
		Calculatrice soustraction1 = new Calculatrice();
		assertTrue( soustraction1.soustraire(4,3)==1 );
	}
	
	public void soustractionMoin8Moins4ShouldBeOk()
	{
		Calculatrice soustraction2 = new Calculatrice();
		assertTrue( soustraction2.soustraire(-8,-4)==-4 );
	}
	
	
	//test 2 produits dont un a resultat negatif 
	public void produit43ShouldBeOk()
	{
		Calculatrice produit1 = new Calculatrice();
		assertTrue( produit1.multiplier(4,3)==12 );
	}
	
	public void produitMoins47ShouldBeOk()
	{
		Calculatrice produit2 = new Calculatrice();
		assertTrue( produit2.multiplier(-4,3)==-21 );
	}
	
	
	//test 3 divisions dont un a resultat negatif et une division par 0
	public void divise48ShouldBeOk()
	{
		Calculatrice divise1 = new Calculatrice();
		assertTrue( divise1.diviser(4,8)==0.5 );
	}
	
	public void diviseMoins124ShouldBeOk()
	{
		Calculatrice divise2 = new Calculatrice();
		assertTrue( divise2.diviser(-12,4)==-3 );
	}

	public void divise120ShouldBeNonOk()
	{
		Calculatrice divise2 = new Calculatrice();
		assertTrue( divise2.diviser(12,0)==0 );
	}
}

