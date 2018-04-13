	import junit.framework.TestCase;
	import junit.framework.TestSuite;
	
public class Test extends TestCase {
	
	public static TestSuite suite() {
	return new TestSuite(Test.class);
	}
	
	//test 2 sommes dont une a resultat negatif
	public void somme13ShouldBeOk()
	{
	assertTrue( Calculatrice.additionner(1,3)==4 );
	}
	
	public void somme4Moins8ShouldBeOk()
	{
	assertTrue( Calculatrice.additionner(4,-8)==-4 );
	}
	
	
	//test 2 soustractions dont un a resultat negatif 
	public void soustraction43ShouldBeOk()
	{
	assertTrue( Calculatrice.soustraire(4,3)==1 );
	}
	
	public void soustractionMoin8Moins4ShouldBeOk()
	{
	assertTrue( Calculatrice.soustraire(-8,-4)==-4 );
	}
	
	
	//test 2 produits dont un a resultat negatif 
	public void produit43ShouldBeOk()
	{
	assertTrue( Calculatrice.multiplier(4,3)==12 );
	}
	
	public void sommeMoins47ShouldBeOk()
	{
	assertTrue( Calculatrice.multiplier(-4,3)==-21 );
	}
	
	
	//test 2 divisions dont un a resultat negatif 
	public void divise48ShouldBeOk()
	{
	assertTrue( Calculatrice.diviser(4,8)==0.5 );
	}
	
	public void diviseMoins124ShouldBeOk()
	{
	assertTrue( Calculatrice.diviser(-12,4)==-3 );
	}

}

