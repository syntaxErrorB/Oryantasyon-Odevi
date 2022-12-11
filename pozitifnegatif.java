package inspimo;

import java.util.Scanner;

public class pozitifnegatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("bir sayi giriniz");
		Scanner giris=new Scanner(System.in);
		double a=giris.nextDouble();
	
		
		if(a==0) {
			System.out.println("Sayiniz 0");
		}
		if(a>0) {
			System.out.println("pozitif");
		}
			else {
				System.out.println("negatif");
			
		}
		
	}
}
		
	


