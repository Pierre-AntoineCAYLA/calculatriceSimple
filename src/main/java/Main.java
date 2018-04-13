import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		
		Calculatrice calculatrice = new Calculatrice();
		//l'utilisateur indique l'operation qu'il veut avec les nombres qu'il souhaite
		sc = new Scanner(System.in);
		float resultat=0;
		System.out.println("Indiquer qu'elle operation vous voulez faire \n 1. + \n 2. - \n 3. * \n 4. /");
		int operateur = sc.nextInt();
		System.out.println("Indiquer 1er nombre");
		float nb1 = sc.nextFloat();
		System.out.println("Indiquer 2eme nombre");
		float nb2 = sc.nextFloat();
		
		//on envoie les paramètres à la calculatrice pour qu'il fasse l'opération
		switch(operateur)
		{
		case 1 : resultat=calculatrice.additionner(nb1,nb2);
			break;
		
		case 2 :resultat=calculatrice.soustraire(nb1,nb2);
			break ;
			
		case 3 :resultat=calculatrice.multiplier(nb1,nb2);
			break ;
			
		case 4 :resultat=calculatrice.diviser(nb1,nb2);
			break ;
		}
		
		//on affiche le resultat à l'operateur
		System.out.println(resultat);

	}

	

}
