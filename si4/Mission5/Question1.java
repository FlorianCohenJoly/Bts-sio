import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String[] tab = new String[5];	
		double[]  tabp= new double[5];
		for(int a=0;a<=4;a++)
		{
			System.out.println("Veuillez saisir produit "+a);
			tab[a]=sc.nextLine();
			System.out.println("Veuillez saisir prix "+a);
			tabp[a]=sc.nextDouble();
			sc.nextLine();
		}
		


		for(int a=0;a<=4;a++)
		{
			System.out.println(tab[a]);
			System.out.println(tabp[a]);
		}


	}




}

