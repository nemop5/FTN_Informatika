package com.domaci;

import java.util.ArrayList;

public class zad1 {

	public static void main(String[] args) {
		//Napisati program koji racuna srednju vrednost liste celih brojeva
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(26);
		lista.add(7);
		lista.add(2);
		lista.add(110);
		lista.add(55);
		lista.add(21);
		
		
		// Racunanje srednje vrednosti liste
		double sum = 0;
		for (int i = 0; i < lista.size(); i++) 
			sum += lista.get(i);
		
		double srVrednost = sum / lista.size();
		
		//Povratna informacija o srednjoj vrednosti
		System.out.println("Srednja vrednost liste iznosi " + srVrednost + ".");
		
	}

}
