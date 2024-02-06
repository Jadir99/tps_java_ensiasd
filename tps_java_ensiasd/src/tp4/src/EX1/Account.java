package EX1;

public class Account {
	
	private int number,balance,num_phone ;
	private String name,Email;
	
	// le constricutre parametrie 
	public Account(int number, int balance, int num_phone, String name, String email) {
		super();
		this.number = number;
		this.balance = balance;
		this.num_phone = num_phone;
		this.name = name;
		Email = email;
	}
	// les getters et les setters 
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getNum_phone() {
		return num_phone;
	}
	public void setNum_phone(int num_phone) {
		this.num_phone = num_phone;
	}
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
	
	public void deposit(int  depositAmount) {
		balance+=depositAmount;
	}
	
	public void withdrawal(int withdrawalAmount) {
		if (balance>=withdrawalAmount)balance-=withdrawalAmount;
		else System.out.println("Solde insufusion");
	}
	

}
