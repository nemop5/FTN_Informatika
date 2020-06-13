package com.domaci;

import java.util.ArrayList;

public class zad3 {

	public static void main(String[] args) {
		//Napisati program koji utvrdjuje koliko puta se datoj listi celih brojeva nalazi broj 5.
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(26);
		lista.add(7);
		lista.add(2);
		lista.add(5);
		lista.add(110);
		lista.add(55);
		lista.add(21);
		lista.add(1);
		lista.add(5);
		lista.add(5);
		
		boolean postoji5 = false;
		int broj5 = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == 5) {
				postoji5 = true; 
				broj5++;
			}
		}
		
		if (postoji5)
			System.out.println("Broj 5 se nalazi u listi " + broj5 + " puta.");
		else 
			System.out.println("U listi nema broja 5.");

	}

}
