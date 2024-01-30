package tp2;

public class MAIN {

	public static void main(String[] args) {
		
		ex1 exercice=new ex1();
		
		System.out.println("********************l'affichage de exercice 1******************************");
		System.out.println("la volume par exemple de 5 est :"+exercice.Volume(5));
		System.out.println("le fctoriel de nombre 5 est "+exercice.factoriel(5));
		System.out.println("l'annee 2024 EST : "+exercice.bisexel(2024));
		System.out.println("pour la methode chnager on a :");
		// l'appel de fonction changer 
		exercice.changer(5, 6);
		
		
		System.out.println("********************l'affichage de exercice 2 et 3******************************");
		//creation de l'objet d 'exercice 2
		ex2 ex2=new ex2();
		// saiser les donnees
		ex2.saisie();
		//afficher le tableau avant d'inverse
		ex2.afficher();
		/// tester le nombre d repetition de nombre 4 par exemple:
		ex2.afficher_nbr_repetetion(4);
		// l'inverse de tableau 
		ex2.inverser();
		// affichage de sommes des valeurs de tableau :
		
		System.out.println("la somme des elements de tableau sont : "+ex2.Somme());
		// afficher les nombres uspp a20 
		System.out.println("les valeurs des nombres sup de 20 sont : "+ex2.nbr_sup_a20());
		// afficher la somme des nombres uspp a20 
		System.out.println("la somme  des nombres sup de 20 est  : "+ex2.somme_sup_a20());
		// afficher moyenne uspp a20 
		System.out.println("la moyenne des nombres sup de 20 sont : "+ex2.moyenne_sup20());
		// afficher plus grand valeur 
		System.out.println("le plus grand valeur : "+ex2.plusgrandvaleur());
		// afficher plus petit valeur 
		System.out.println("le petit valeur  : "+ex2.plusfaiblevaleur());
		
		
		
		
		
		
		System.out.println("");

	}

}
