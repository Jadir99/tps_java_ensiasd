package EX3_Partie3;

public class Livre {
	
	private String titre, auteur;
	private int nbPages;
	
	
	//Constructeur parametrie 
	public Livre(String titre, String auteur, int nbPages) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	// les getters et setters 
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
		else System.out.println("veuiller saisie un nombre Positif");
	}
	
	// methode tostring
	@Override
	public String toString() {
		return "le livre de l'auteur "+auteur+" de titre "+titre+" le nombre des pages sont "+nbPages;
	}
	

}
