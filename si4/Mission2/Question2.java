import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le nom du produit ?"); // afficher "quel est le nom du produit"
		String nom= sc.next(); // nom est une variable string c'est une chaine de caractère
		System.out.println("veuillez saisir la quantite achetée:" ); // affficher "veuillez saisir la quantitée achetée"
		long quantite = sc.nextLong(); //quantite est une variable long c'est un entier relatif long
		System.out.println("veuillez saisir le prixHT:" ); // afficher "veuillez saisir le prixHT"
		double prixHT= sc.nextDouble(); // prixHT est une variable double c'est un nombre décimal
		int tauxTVA=15; // tauxTVA est une variable int c'est un entier relatif on lui attribue la valeur 15
		double prixTTC; // prixTTC est une variable double c'est un nombre décimal
		prixTTC=prixHT*(1+(tauxTVA/100)) *quantite; // prixTTC aura la valeur du résultat du calcul
		if(quantite>100) { // si la quantite est supérieur a 100 
		System.out.println("La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%");	// afficher "La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%"
		prixTTC=prixTTC*0.90; // on retire 10% a prixTTC
	} else { // Sinon
		System.out.println("La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%");	// afficher "La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%"
		
	}
		System.out.println("Le prixTTC est de:"+prixTTC); // afficher le prixTTC
		

	}

}


Question1:
variables: quantite, pht, ttva,nomproduit,pttc
DEBUT
    Saisir nomproduit
    Saisir pht
    Saisir quantite
    ttva=15
    pttc ← pht*(1+(ttva/100)) *quantite
    Si la quantite est > 100 pttc=pttc*0.90
    Afficher "La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%",
    Sinon Afficher "La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%",
FIN SI
    Afficher "Le prixttc est de : ", pttc
FIN
