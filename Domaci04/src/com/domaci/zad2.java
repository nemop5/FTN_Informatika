package com.domaci;

import java.util.ArrayList;

public class zad2 {

	public static void main(String[] args) {
		// Napisati program koji utvrdjuje da li se u datoj listi celih brojeva nalazi broj 5.
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(26);
		lista.add(7);
		lista.add(2);
		lista.add(110);
		lista.add(5);
		lista.add(55);
		lista.add(21);
		
		boolean postoji5 = false; 
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == 5) {
				postoji5 = true; 
				break;
			}
		}
		
		if (postoji5)
			System.out.println("Postoji broj 5.");
		else
			System.out.println("U listi nema broja 5.");		

	}

}
