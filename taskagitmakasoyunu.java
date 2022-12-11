package vize;

import java.util.Random;
import java.util.Scanner;

public class taskagitmakasoyunu {

	public static void main(String[] args) {
	
		
	   
	    System.out.println("1:TAS,2:KAGIT,3:MAKAS?");
	    int tas = 1;
	    int kagit=2;
	    int makas=3;
	   
		Scanner giris = new Scanner(System.in);
		int sahis = giris.nextInt();
		
		Random r = new Random();
		int pc=r.nextInt(3)+1;
		
		if(pc==sahis)
			System.out.println("Berabere");
		
		if(pc==1 && sahis==2)
			System.out.println("Kazandın_"+"Bilgisayar_"+pc+"_secti.");
		if(pc==1 && sahis==3)
			System.out.println("Kaybettiniz_"+"Bilgisayar_"+pc+"_secti.");
		if(pc==2 && sahis==1)
			System.out.println("Kaybettiniz_"+"Bilgisayar_"+pc+"_secti.");
		if(pc==2 && sahis==3)
			System.out.println("Kazandınız_"+"Bilgisayar_"+pc+"_secti.");
		if(pc==3 && sahis==1)
			System.out.println("Kazandınız_"+"Bilgisayar_"+pc+"_secti.");
		if(pc==3 && sahis==2)
			System.out.println("Kaybettiniz_"+"Bilgisayar_"+pc+"_secti.");
		
				
				
				
		
	}

}
