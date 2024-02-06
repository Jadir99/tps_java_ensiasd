package EX1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tester la classe 
		
		Account cmp1=new Account(1,12000,0606060606,"jadir mohammed","Mohamad.jadi2018@gmail.com");
		
		System.out.println("le solde actuel est : "+ cmp1.getBalance());
		System.out.println("on va changer le solde avec 9000 dhs ");
		cmp1.setBalance(9000);
		System.out.println("apres l'utilisation de setter le solde actuel est : "+ cmp1.getBalance());
		System.out.println("on depose 3600 dhs ...");
		cmp1.deposit(3600);
		System.out.println("voila le solde apres le depose "+cmp1.getBalance());
		System.out.println("on prent 5000 dhs et afficher le Solde ...");
		cmp1.withdrawal(5000);
		System.out.println("voila le solde apres le depose "+cmp1.getBalance());
		
		
		
		

	}

}
