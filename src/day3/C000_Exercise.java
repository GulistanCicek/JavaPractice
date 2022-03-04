package day3;

import java.util.Scanner;

public class C000_Exercise {

	public static void main(String[] args) {
		
		//1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
		// Orn : sayi1=10 ve sayi2=20;
	  	// kod calistiktan sonra
	 	 // sayi1=20 ve sayi2=10
		
		// sonucta sayi1 : 20 ve sayi2 : 10
		
		int sayi1=10;
		
		int sayi2=20;
		
		int bos;
		
		bos=sayi2;
		
		sayi2=sayi1;
		
		sayi1=bos;
		
		System.out.println("sonucta sayi1 : "+bos+ " " + "sayi2 : " +sayi2);
		
		int sayi3=15;
		
		int sayi4=25;
		
		sayi3= sayi3-sayi4;
		
		sayi4= sayi4+sayi3;
		
		sayi3=sayi4+10;
		
		System.out.println("sonucta sayi3 : "+ sayi3 + " " + "sayi4 :" + sayi4 );
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		String isim= scan.next();
		
		System.out.println("isminiz : " + isim);
		
		scan.close();
		
				
				
		
				
				
				
				
				
				
				
		
		

	}

}
