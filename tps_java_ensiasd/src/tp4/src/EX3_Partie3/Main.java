package EX3_Partie3;

public class Main {

	public static void main(String[] args) {
		
		// creation les 2 livres :
		
		Livre L1=new Livre("titre1","auteur1",128);
		Livre L2=new Livre("titre2","auteur2",678);
		
		//affichage 
		
		System.out.println("le livre 1 : "+L1);
		System.out.println("le livre 2 : "+L2);
		
		// afficher le nombre totale de deux livres 
		System.out.println("totale de nombre des pages est : "+(L1.getNbPages()+L2.getNbPages()));

	}

}
