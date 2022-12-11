package inspimo;

import java.util.Scanner;

public class ucgenalanhesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kenar uzunluğu?");
		Scanner giris=new Scanner(System.in);
		double kenar,yukseklik,alan;
		kenar=giris.nextDouble();
		System.out.println("Yukseklik giriniz");
		yukseklik=giris.nextDouble();
		
	
		alan=kenar*yukseklik/2;
		System.out.println("ucgenin alanı"+alan+"'dır");
		
	
		
	}

}
