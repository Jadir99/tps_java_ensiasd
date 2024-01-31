package tp3;

public class Ex1 {
	
	public static String inverser(String str) {
		char[] strr = str.toCharArray();
		char tmp;
		int fin=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			tmp=strr[i];
			strr[i]=strr[fin];
			strr[fin]=tmp;
			fin--;
		}
		
		return new String(strr);
	}
	public  static boolean is_palindrome(String str) {
		
		char[] strr = str.toCharArray();
		int fin=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			
			if(strr[i]!=strr[fin]) return false;
			fin--;
		}
		return true;
	}
	// exercice2
	
	public static void afficher_en_colone(String str) {
		char[] strr = str.toCharArray();
		for (int i=0;i<str.length();i++) {
			if(strr[i] ==' ') {
				i++;
				System.out.println("\n");
			}
			System.out.print(strr[i]);
		}
	}
	//exercice 3 
	public static int nbr_occ(String str, char c) {
		char[] strr = str.toCharArray();
		int nbr_occ=0;
		for (int i=0;i<str.length();i++) {
			if(strr[i] ==c) {
				nbr_occ++;
			}
		}
		return nbr_occ;
	}
	//exercice 4
	public static boolean is_html(String str) {
		if (str.indexOf(".html") != -1 || str.indexOf(".html*") != -1 || str.indexOf(".htm") != -1 ) 
		return true;
		return false;
	}
	//exercice 5 
	public static int Length(String str) {
		int length=0;
		for (int i=0;i<str.length();i++) {
				length++;
		}
		return length;
	}
	
	// exercice 6
	
	public static String miniscul(String str) {
		return str.toLowerCase();
	}
	public static boolean equals(String str1, String str2) {
		
		char[] strr1 = str1.toCharArray();
		char[] strr2 = str2.toCharArray();
		
		for (int i=0;i<str1.length();i++) {
			if(strr1[i] !=strr2[i]) {
				return false ;
			}
			
		}return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("****************************tp3*************************************");
		System.out.println(Ex1.inverser("jadir"));
		System.out.println(Ex1.is_palindrome("ana"));
		Ex1.afficher_en_colone("hello every body");
		System.out.println("le nombre d'occurance de 'a' par exemple est : "+Ex1.nbr_occ("ana ghadi l dar",'a'));
		System.out.println("est ce que le file est un file html htm ou html* "+Ex1.is_html("test.html"));
		System.out.println("la longeur de cette string ('im jadir mohammed' est : "+Ex1.Length("im jadir mohammed"));
		System.out.println("on va transformer ajiscule en miniscule de 'JAVA IS THE BEST LANGUAGE'"+Ex1.miniscul("JAVA IS THE BEST LANGUAGE"));
		System.out.println("tester les deux strings est quelle sont egaux "+Ex1.equals("jadir", "jadir"));
		
	}

}
