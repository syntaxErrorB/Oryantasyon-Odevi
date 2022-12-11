package inspimo;

import java.util.Scanner;

public class ikisayikistasi {

	public static void main(String[] args) {
	

		System.out.println("iki sayi giriniz");
		Scanner giris=new Scanner(System.in);
		double sayi1,sayi2;
		sayi1=giris.nextDouble();
		sayi2=giris.nextDouble();
		if(sayi1==sayi2) {
			System.out.println("sayilar esit");
		}
		
		else if(sayi1<sayi2) {
			System.out.println(sayi2+" daha buyuk");
		}
	
		else  {
				System.out.println(sayi1+" daha buyuk");
		}
		
	
	}
		


}
