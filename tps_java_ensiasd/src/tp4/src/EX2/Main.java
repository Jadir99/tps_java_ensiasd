package EX2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation d'instance VipCustomer avec constructeur par defaut 
		VipCustomer cust1=new VipCustomer();
		// creation d'instance VipCustomer avec constructeur parametrie 
		VipCustomer cust2=new VipCustomer("jadir","jadir@gmail.com",0);
		// creation d'instance VipCustomer avec constructeur parametrie de 2 valeurs
		VipCustomer cust3=new VipCustomer("jadir2","jadir2@gamil.com");
		
		// affichage 
		System.out.println(cust1);
		System.out.println(cust2);
		System.out.println(cust3);
		
		

	}

}
