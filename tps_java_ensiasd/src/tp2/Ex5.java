package tp2;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {

		
		
		// declare l'objet 
		ex2 obj=new ex2();
		Scanner scan=new Scanner(System.in);
		int choix;
		do {
			
			System.out.println("**********************************Menu*********************************");
			System.out.println("Donner un valeur pour les choses ici :");
			System.out.println("1-siasier le tableau ");
			System.out.println("2-Afficher la moyenne :");
			System.out.println("3-calculer le plus grand valeur et s'indice ");
			System.out.println("4-pour afficher le tableau");
			System.out.println("0-pour quitter");
			System.out.println("**********************************Menu*********************************");
			
			 choix=scan.nextInt();
			switch(choix) {
				  case 1: obj.saisie();
				    break;
				  case 2:
					// afficher moyenne uspp a20 
					System.out.println("la moyenne des nombres sup de 20 sont : "+obj.moyenne_sup20());
				    break;
				  case 3:
					// afficher plus grand valeur et s'indice 
						System.out.println("le plus grand valeur : "+obj.plusgrandvaleur()+" et s'indice egale : "+obj.indice_plusgrandValeur());
					    break;
				  case 4: System.out.println("***************affichage de tableau *********");
				  			obj.afficher();
				  			break;
				  
				  case 0:
					  System.out.println("thanks and good bye :)");
					    break;
				    
				  default:
					  System.out.println("veuillez essayer et tapper un nombre valable");
			}
		}while(choix!=0);
		
	}

}
