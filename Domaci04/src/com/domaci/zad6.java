package com.domaci;

import java.util.ArrayList;

public class zad6 {

	public static void main(String[] args) {
		//Program za evidenciju polaznika kursa iz osnova programiranja.
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		ArrayList<Integer> prisustvo = new ArrayList<Integer>();
		
		//Dodavanje 1 polaznika:
		imena.add("Nikola");
		prezimena.add("Nikolic");
		prisustvo.add(0);
		
		//Dodavanje 2 polaznika:
		imena.add("Marko");
		prezimena.add("Markovic");
		prisustvo.add(0);
		
		//Dodavanje 3 polaznika:
		imena.add("Petar");
		prezimena.add("Petrovic");
		prisustvo.add(0);
		
		//Dodavanje 4 polaznika:
		imena.add("Dusan");
		prezimena.add("Nikolic");
		prisustvo.add(0);
		
		//Dodavanje 5 polaznika:
		imena.add("Marko");
		prezimena.add("Petrovic");
		prisustvo.add(0);
		
		//6.1 Prikaz svih polaznika kursa
		System.out.println("----------------------- PRIKAZ SVIH POLAZNIKA KURSA --------------------------");
		for (int i = 0; i < imena.size(); i++) 
				System.out.println(imena.get(i) + " " + prezimena.get(i) + " " + prisustvo.get(i));
		
		
		//6.2 Prikaz svih polaznika pre i posle brisanja (osnova za brisanje: index)
		//Polaznik koji se brise
		int index = 0;
		
		imena.remove(index);
		prezimena.remove(index); 
		prisustvo.remove(index);

		
		
		//Ponovni prikaz posle brisanja polaznika
		System.out.println("----------------------- PRIKAZ SVIH POLAZNIKA KURSA --------------------------");
		for (int i = 0; i < imena.size(); i++) 
				System.out.println(imena.get(i) + " " + prezimena.get(i) + " " + prisustvo.get(i));
		
		
		//6.3 Prikaz svih polaznika pre i posle birsanja(osnova za brisanje: ime i prezime)
		//Polaznik koji se brise
		String ime = "Petar";
		String prezime = "Petrovic";
		
		index = -1;
		for (int i = 0; i < imena.size(); i++) {
			if (imena.get(i).equals(ime) && prezimena.get(i).equals(prezime)) {
				index = i; 
				break;
			}
		}
		if (index > -1) {
			imena.remove(index);
			prezimena.remove(index); 
			prisustvo.remove(index);
		}
		
		
		//Ponovni prikaz posle brisanja polaznika
		System.out.println("----------------------- PRIKAZ SVIH POLAZNIKA KURSA --------------------------");
		for (int i = 0; i < imena.size(); i++) 
				System.out.println(imena.get(i) + " " + prezimena.get(i) + " " + prisustvo.get(i));
		
		
		//6.4 Uvecanje broja prisustva na casovima za 1
		//Polaznik kome se uvecava prisustvo:
		ime = "Dusan";
		prezime = "Nikolic";
		
		int brojprisustva = 0;
		index = -1;
		for (int i = 0; i < imena.size(); i++) {
			if (imena.get(i).equals(ime) && prezimena.get(i).equals(prezime)) {
				index = i;
				brojprisustva++;
				break;
			}
		}
		if (index > -1)
			prisustvo.set(index, brojprisustva);
		
		//Ponovni prikaz polaznika
		System.out.println("----------------------- PRIKAZ SVIH POLAZNIKA KURSA --------------------------");
		for (int i = 0; i < imena.size(); i++) 
				System.out.println(imena.get(i) + " " + prezimena.get(i) + " " + prisustvo.get(i));
		
	
		
	}
		
}

