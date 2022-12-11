package vize;

import java.util.Scanner;

public class switchyapisi {

	public static void main(String[] args) {
		
		
		System.out.println("[1-7] arasında sayı gir ");
		Scanner giris = new Scanner(System.in);
		int gun = giris.nextInt();
		
		
		switch (gun) {
		case 1: System.out.println("Pazartesi");
		break;
		case 2: System.out.println("Sali");
		break;
		case 3: System.out.println("Carsamba");
		break;
		case 4: System.out.println("Persembe");
		break;
		case 5: System.out.println("Cuma");
		break;
		case 6: System.out.println("Cumartesi");
		break;
		case 7: System.out.println("Pazar");
		break;
		default: System.out.println("Lutfen geçerli bir sayi giriniz");
		System.exit(gun);
		
		

		}
	}
}

