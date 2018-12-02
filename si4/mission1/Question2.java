question 2



import java.util.Scanner;
public class Question2 {
		public static void main (String [] args) {
			double prixTTC; // réél double
			double prixHT;  //  réél double
			prixHT=7;       // j'affecte la valeur 7 au prixHT
			double tauxTVA; // réél double 
			tauxTVA=5;      // j'affecte la valeur 5 au tauxTVA
			double quantite; //  réél double 
			quantite=675;    // j'affecte la valeur 675 a quantite
 prixTTC=prixHT*tauxTVA*quantite; 
 System.out.println("Le prixTTC est de:"+prixTTC); 
			
		    
	}
		
	}


variables: quantite, pht, ttva, pttc
Début
    Saisir pht
    Saisir quantite
    Saisir ttva
    pttc ← (pht*ttva)*quantite
    Afficher "Le prixTTC est de : ", pttc
Fin
