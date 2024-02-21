package Question2;

public class Personne {
	
	String nom,prenom;
	int age;
	
	//constricteur de nom et prenom
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	// constricteur de age en plus le nom et prenom 
	public Personne(String nom, String prenom, int age) {
		this(nom,prenom);
		this.age = age;
	}
	
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
	
	// l'affichage :
	public void afficher() {
		System.out.println("Personne : Nome: "+nom+" Prenom "+prenom+" l'age: "+age);
	}
	// to string
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
