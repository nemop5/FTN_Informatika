package com.domaci;

public class Zadatak04 {

	public static void main(String[] args) {
		
		double jedinicnaCena = 3030.3;
		int kolicina = 10;
		boolean akcija = false;
		
		double ukupnaCena = jedinicnaCena * kolicina;
		//ako je akcija umanji cenu
		if(akcija)  
			ukupnaCena *= 0.9; //ukupnaCena = ukupnaCena * 0.9
		
		System.out.println("Ukupna cena je: " + ukupnaCena);
		//ako je akcija ispisi poruku  s
		if(akcija)
			System.out.println("U cenu je uračunat akcijski popust od 10%.");

	}

}
