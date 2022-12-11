package inspimo;

import java.util.Scanner;

public class mod {

	public static void main(String[] args) {
		
		System.out.println("iki sayi giriniz");
		Scanner giris=new Scanner(System.in);
		int sayi1=giris.nextInt();
		int sayi2=giris.nextInt();
		int bolum=sayi1/sayi2;
		int kalan=sayi1-(bolum*sayi2);
		
		if(sayi1<sayi2) {
			System.out.println(sayi1);
		}
		else {
		
		System.out.println(kalan);
		}
		
		
		

	}

}
