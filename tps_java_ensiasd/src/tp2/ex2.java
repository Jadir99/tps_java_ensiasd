package tp2;
import java.util.Scanner;
public class ex2 {
	int dim;
	int tab[ ] = new int[dim];
	
	public void saisie() {
		System.out.println("donner la demension de cette tableau :");
		Scanner scan =new Scanner(System.in);
		this.dim=scan.nextInt();
        this.tab = new int[dim];
		
		for(int i=0;i<dim;i++) {
			System.out.println("donner la vaeleur nombre "+i);
			tab [i]=scan.nextInt();
		}
	}
	
	public void afficher() {
		for(int i=0;i<dim;i++) {
			System.out.println("tab ["+i+1+"]= "+tab[i]);			
		}
	}
	
	public void afficher_nbr_repetetion(int a) {
		int rep=0;
		for(int i=0;i<dim;i++) {
			if(tab[i]==a)rep++;
		}
		System.out.println("la valeur "+a+" repeter "+rep+" fois");
	}
	
	public void inverser() {
		int  tmp,b=dim-1;
		for (int i=0;i<dim/2;i++) {
			tmp=tab[i];
			tab[i]=tab[b];
			tab[b]=tmp;
			b--;
		}
		afficher();
	}
	public int Somme() {
		int s=0;
		for(int i=0;i<dim;i++) {
			s+=tab[i];
		}
		return s;
	}
	int nbr_sup_a20() {
		int s=0;
		for(int i=0;i<dim;i++) {
			if(tab[i]>=20)s++;
		}
		return s;
	}
	int somme_sup_a20() {
		int s=0;
		for(int i=0;i<dim;i++) {
			if(tab[i]>=20)s+=tab[i];
		}
		return s;
	}
	float moyenne_sup20() {
		return somme_sup_a20()/dim;
	}
	
	public int plusgrandvaleur() {
		int pg=tab[0];
		for(int i=1;i<dim;i++) {
			if(tab[i]>pg)pg=tab[i];
		}
		return pg;
	}
	public int indice_plusgrandValeur() {
		int pg=tab[0];
		int indice=-1;
		for(int i=1;i<dim;i++) {
			if(tab[i]>pg) {
				pg=tab[i];
				indice=i;
			}
		}
		return indice;
	}
	
	public int plusfaiblevaleur() {
		int pf=tab[0];
		for(int i=1;i<dim;i++) {
			if(tab[i]<pf)pf=tab[i];
		}
		return pf;
	}
	
	

}
