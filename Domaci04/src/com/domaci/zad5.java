package com.domaci;

import java.util.ArrayList;

public class zad5 {

	public static void main(String[] args) {
		//Napisati program koji pronalazi najmanji element u listi decimalnih brojeva.
		ArrayList<Double> lista = new ArrayList<Double>();
		lista.add(-0.009);
		lista.add(6.45);
		lista.add(1.45);
		lista.add(-0.98);
		lista.add(7.35);
		lista.add(-1.25);
		lista.add(0.98);
		lista.add(7.36);
		
		
		double najmanji = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < najmanji)
				najmanji = lista.get(i);
		}
		
		System.out.println("Najmanji element u listi je " + najmanji + ".");

	}

}
