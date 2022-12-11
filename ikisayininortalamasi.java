package inspimo;

import java.util.Scanner;

public class ikisayininortalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iki adet sayi giriniz");
		Scanner giris=new Scanner(System.in);
		double a =giris.nextDouble();
		double b =giris.nextDouble();
		double c=(a+b)/2;
		System.out.println(a+"ve"+b+"sayisinin ortalamasi"+c);
		
		
		

	}

}
