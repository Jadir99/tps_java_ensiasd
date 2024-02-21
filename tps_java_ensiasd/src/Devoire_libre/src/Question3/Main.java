package Question3;

public class Main {

	public static void main(String[] args) {
		
		Livre l1=new Livre("titre1","auteur1",21);
		Livre l2=new Livre("titre2","auteur2",65);
		
		// affichage 
		System.out.println("Livre1:");
		System.out.println(l1);
		System.out.println("Livre2:");
		System.out.println(l2);
		
		// l'affichage de somme des pages des deux livres 
		System.out.println("totla des nombres des pages :"+(l1.getNbPages()+l2.getNbPages()));

	}

}
