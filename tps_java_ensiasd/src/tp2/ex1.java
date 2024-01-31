package tp2;

public class ex1 {
	
	// methode de cube volume 
	int Volume(int a) {
		return a*a*a;
	}
	
	int factoriel(int n) {
		int f=1;
		for (int i= 1;i<n;i++) {
			f*=i;
		}
		return f;
	}
	
	boolean bisexel(int annee) {
		
		if(annee % 4==0) 
			if(annee %100 != 0)
				return true;
		return false;
	}
	
	void changer(int a, int b) {
		System.out.println("avant la valeur de a est "+a+" et b est : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("apres la valeur de a est "+a+" et b est : "+b);
	}


}
