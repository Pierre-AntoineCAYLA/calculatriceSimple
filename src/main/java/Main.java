import java.util.Scanner;
import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		double resultat;
		System.out.println("Indiquer qu'elle operation vous voulez faire \n 1. + \n2. - \n 3. * \n 4. /");
		int operateur = sc.nextInt();
		System.out.println("Indiquer 1er nombre");
		float nb1 = sc.nextFloat();
		System.out.println("Indiquer 2eme nombre");
		float nb2 = sc.nextFloat();
		
		switch(operateur)
		{
		case 1 : resultat=Calculatrice.additionner(nb1,nb2);
			break;
		
		case 2 :resultat=Calculatrice.soustraire(nb1,nb2);
			break ;
			
		case 3 :resultat=Calculatrice.multiplier(nb1,nb2);
			break ;
			
		case 4 :resultat=Calculatrice.diviser(nb1,nb2);
			break ;
		}
		System.out.println(resultat);

	}

	

}
