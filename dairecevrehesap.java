package vize;

import java.util.Scanner;

public class dairecevrehesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI_SAyı = 3.1415;
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Lutfen yari cap degerini gir: ");
		
		double yaricap = giris.nextDouble();
		
		double cevre = 2 * PI_SAyı * yaricap ;
		
		System.out.println(yaricap + " yaricapli dairenin cevresi " + cevre + " dir.");
		
		
		
		
		
	}

}
