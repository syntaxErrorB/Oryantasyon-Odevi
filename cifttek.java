package vize;

import java.util.Scanner;

public class cifttek {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
	
		System.out.println("Bir tam sayı giriniz: ");
		
		int a = giris.nextInt();
		
		
		if(a % 2 == 0) {
			System.out.println(a + "Tam sayisi cift sayidir.");
			
		}
		else {
			System.out.println(a + "Tam sayisi tek sayidir.");
		}
		

	}

}
