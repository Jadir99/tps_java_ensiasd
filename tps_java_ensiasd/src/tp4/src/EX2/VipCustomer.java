package EX2;

public class VipCustomer {
	
	private String name,Email;
	private int credit;
	
	// Constructor parametrie de 3 valeurs en parametres 
	public VipCustomer(String name, String email, int credit) {
		super();
		this.name = name;
		Email = email;
		this.credit = credit;
	}
	// Constructor par defaut 
	public VipCustomer() {
		name="user";Email="user@gamil.com";credit = 1230;
	}
	//constructeur pour de valeurs et l'autre valeur par defaut 
	public VipCustomer(String name, String email) {
		this.name = name;
		Email = email;
		credit=4560;
	}
	// getters et setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	// to string pour afficher les attributs de classes
	@Override 
	public String toString() {
		return "le nom est "+name+" l'email est : "+Email+" le credit est : "+credit;
	}
	
}
