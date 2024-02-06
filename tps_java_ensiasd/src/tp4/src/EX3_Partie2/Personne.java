package EX3_Partie2;

public class Personne {
	
	private String nom , prenom;
	private int age ;
	// constucteur pour initialiser le nom et prenom
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	// constucteur pour initialiser le nom et prenom et l'age 
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	// methoe anniversaire
	
	public void anniversaire() {
		age++;
	}
	
	
	// les getters et setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void affichepers() {
		System.out.println("le nom est : "+nom+" prenom : "+prenom+" age: "+age);
	}
	

}
