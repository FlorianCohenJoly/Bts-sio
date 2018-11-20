import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int choix=1; // On définit la variable choix comme étant int c'est un entier relatif
		while(choix==1) { // Tant que choix est 1 
			Scanner sc = new Scanner(System.in);
			System.out.println("Quel est le nom du produit ?"); // afficher "quel est le nom du produit"
			String nom= sc.next(); // nom est une variable string c'est une chaine de caractère
			System.out.println("veuillez saisir la quantite achetée:" ); // afficher "veuillez saisir la quantite achetée"
			long quantite = sc.nextLong(); //quantite est une variable long c'est un entier relatif long
			System.out.println("veuillez saisir le prixHT:" ); // afficher "veuillez saisir le prixHT"
			double prixHT= sc.nextDouble();  // prixHT est une variable double c'est un nombre décimal
			int tauxTVA=15; // tauxTVA est une variable int c'est un entier relatif on lui attribue la valeur 15
			double prixTTC;  // prixTTC est une variable double c'est un nombre décimal
			prixTTC=prixHT*(1+(tauxTVA/100)) *quantite;  // prixTTC aura la valeur du résultat du calcul
			if(quantite>100) { // si la quantite est supérieur a 100 
				System.out.println("La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%");		// afficher "La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%"
				prixTTC=prixTTC*0.90; // on retire 10% a prixTTC
			} else {  // Sinon
				System.out.println("La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%"); // afficher "La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%"
		
	

			}
			
			System.out.println("Le prixTTC est de:"+prixTTC); // afficher le prixTTC
			System.out.println("Veuillez saisir 1 pour continuer ou 0 pour arreter"); 
			choix=sc.nextInt(); // nom est une variable int c'est un entier relatif
		}
		System.out.println("Aurevoir, a plus tard"); // afficher "Aurevoir, a plus tard"

	}
	
}


Question1:
variables: quantite, pht, ttva,nomproduit,pttc,choix
DEBUT
    choix=1
    tant que choix==1
    Saisir nomproduit
    Saisir pht
    Saisir quantite
    ttva=15
    pttc ← pht*(1+(ttva/100)) *quantite
    Si la quantite est > 100 pttc=pttc*0.90
    Afficher "La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%",
FIN SI
    Sinon Afficher "La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%",
FIN SINON
    Afficher "Le prixttc est de : ", pttc
    Afficher ("Veuillez saisir 1 pour continuer ou 0 pour arreter")
    Afficher ("Aurevoir, a plus tard")
    
FIN
