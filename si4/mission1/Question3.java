import java.util.Scanner;
public class Question3 {
		
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("veuillez saisir la quantite achetée:" );
		long quantite = sc.nextLong();
		System.out.println("veuillez saisir le prixHT:" );
		double prixHT= sc.nextDouble();
		int tauxTVA=15;
		double prixTTC;
prixTTC=prixHT*(1+(tauxTVA/100)) *quantite; 
		
		System.out.println("Le prixTTC est de:"+prixTTC);
			
		    
	}
		
	}