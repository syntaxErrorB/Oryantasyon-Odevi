package vize;

import java.util.Scanner;

public class cikarmaislembulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1 = (int)(Math.random() *10 );
		int sayi2 = (int)(Math.random() *10 );
		
		if (sayi1<sayi2) {
			int temp =sayi1;
			sayi1=sayi2;
			sayi2=temp;
			
					
		}

		System.out.println(sayi1+"-"+sayi2+"nedir? ");
		Scanner giris = new Scanner(System.in);
		int cevap = giris.nextInt();
		
		if(sayi1-sayi2==cevap) {
			System.out.println("Dogru");
			
			}
		else {
			System.out.println("yanlis");
			
		}
		
	}

}
