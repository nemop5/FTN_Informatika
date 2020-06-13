package com.domaci;

public class Zadatak02 {
	
	
	public static void main(String[] args) {
		//definisemo pi
		double pi = 3.14;
		//ostale variajble
		double poluprecnik = 4;
		double obim;
		double povrsina;
		
		//racuna se obim i povrsina
		obim = 2 * poluprecnik * pi;
		povrsina = poluprecnik * poluprecnik * pi;
		
		System.out.println("r=" + poluprecnik + " O=" + obim + " P=" + povrsina);

	}

}
