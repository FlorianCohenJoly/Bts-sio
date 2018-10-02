import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le nom du produit ?");
		String nom= sc.next();
		System.out.println("veuillez saisir la quantite achetée:" );
		long quantite = sc.nextLong();
		System.out.println("veuillez saisir le prixHT:" );
		double prixHT= sc.nextDouble();
		int tauxTVA=15;
		double prixTTC;
		prixTTC=prixHT*(1+(tauxTVA/100)) *quantite;
		if(quantite>100) {
		System.out.println("La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%");	
		prixTTC=prixTTC*0.90;
	} else {
		System.out.println("La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%");	
		
	}
		System.out.println("Le prixTTC est de:"+prixTTC);
		

	}

}
