package Question3;

public class Livre {
	
	private String titre, auteur;
	private int nbPages;
	
	// constricteur 
	public Livre(String titre, String auteur, int nbPages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
	}

	// les getters et les setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		if(nbPages>0)
		this.nbPages = nbPages;
		else System.out.println("le nombre dpit etre positif");
	}
	
	// la methode d'affichage 
	public String toString() {
		return "Livre de auteur:"+auteur+" Titre: "+titre+" nombre de pages :"+nbPages ;
	}

}
