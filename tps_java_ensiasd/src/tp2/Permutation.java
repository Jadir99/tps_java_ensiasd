package tp2;

public class Permutation {
	
	public int a ,b;

	public void permuter() {
		int tmp=a;
		this.a=this.b;
		this.b=tmp;
	}
	public static void main(String[] args) {
		
		Permutation obj=new Permutation();
		
		obj.a=5;
		obj.b=6;
		System.out.println("la valeur de a est "+obj.a+" la valeur de b est "+obj.b);
		obj.permuter();
		System.out.println("la valeur de a est "+obj.a+" la valeur de b est "+obj.b);
		
		

	}

}
