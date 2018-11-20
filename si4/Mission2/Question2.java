import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le nom du produit ?");
		String nom= sc.next();
		System.out.println("veuillez saisir la quantite achetée:" );
		long quantite = sc.nextLong();
		System.out.println("veuillez saisir le prixHT:" );
		double prixHT= sc.nextDouble();
		double prixTTC;
		System.out.println("Si c'est un objet de première nécessité,veuillez écrire un nombre positif sinon veuillez ecrire un nombre négatif");
		int objet=sc.nextInt();
		if(objet>0) {
			System.out.println("L'objet est de première nécessité la TVA appliquer sera de 5%");
			prixTTC=prixHT*1.05*quantite;
		}else {
			System.out.println("L'objet n'est pas de première nécessité la TVA appliquée sera de 20%");
			prixTTC=prixHT*1.20*quantite;
		}
		if(quantite>100) {
			System.out.println("La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%");	
			prixTTC=prixTTC*0.90;
		} else {
			System.out.println("La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%");	

		}
		System.out.println("Le prixTTC est de:"+prixTTC);


	}

}


Question2:
variables: quantite,pht,nomproduit,pttc,objet
DEBUT
    Saisir nomproduit
    Saisir pht
    Saisir quantite
    Afficher("Si c'est un objet de première nécessité,veuillez écrire un nombre positif sinon veuillez ecrire un nombre négatif")
    Saisir objet
    Si(objet>0)
    Afficher("L'objet est de première nécessité la TVA appliquer sera de 5%")
    pttc ← pht*1.05*quantite
    Sinon
    Afficher("L'objet n'est pas de première nécessité la TVA appliquée sera de 20%")
    pttc ← pht*1.20*quantite
    Si la quantite est > 100 pttc=pttc*0.90
    Afficher "La quantite achetée est supérieur a 100,vous bénéficier donc d'une remise de 10%",
    Sinon Afficher "La quantite achetée est inférieur à 100,vous ne bénéficier donc pas d'une remise de 10%",
FIN SI
    Afficher "Le prixttc est de : ", pttc
FIN
