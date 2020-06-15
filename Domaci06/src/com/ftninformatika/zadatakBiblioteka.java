package com.ftninformatika;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatakBiblioteka {

	public static void main(String[] args) {
		// TODO Implementirati konzolnu aplikaciju za vodjenje poslovanja u informacionom sistemu biblioteke. 
		ArrayList<String> clanskibrojevi = new ArrayList<String>();
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		
		ArrayList<String> sifreknjiga = new ArrayList<String>();
		ArrayList<String> naslovi = new ArrayList<String>();
		ArrayList<String> autori = new ArrayList<String>();
		
		clanskibrojevi.add("C1");
		imena.add("Marko");
		prezimena.add("Markovic");
		
		clanskibrojevi.add("C2");
		imena.add("Petar");
		prezimena.add("Petkovic");
		
		clanskibrojevi.add("C3");
		imena.add("Miroslav");
		prezimena.add("Peric");
		
		clanskibrojevi.add("C4");
		imena.add("Mateja");
		prezimena.add("Maric");
		
		sifreknjiga.add("S1");
		naslovi.add("Uvod u Ekonomiju");
		autori.add("Karl Marks");
		
		sifreknjiga.add("S2");
		naslovi.add("Politicka ekonomija");
		autori.add("Karl Marks");
		
		sifreknjiga.add("S3");
		naslovi.add("Uvod u Istoriju");
		autori.add("Isidora Sekulic");
		
		sifreknjiga.add("S4");
		naslovi.add("Uvod u Ekonomiju");
		autori.add("Fridrih Marks");
		
		
		
		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
			System.out.println("*********** MENI **********");
			System.out.println("1. Unos clana");
			System.out.println("2. Prikaz svih clanova");
			System.out.println("3. Brisanje clana");
			System.out.println("4. Izmena clana");
			System.out.println("5. Pretraga clanova po clanskom broju");
			System.out.println("6. Unos knjige");
			System.out.println("7. Prikaz svih knjiga");
			System.out.println("8. Brisanje knjige");
			System.out.println("9. Izmena knjige");
			System.out.println("10. Pretraga knjiga po autoru");
			System.out.println("11. Pretraga knjiga po naslovu");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");

			opcija = sc.nextLine();

			switch (opcija) {
				
				case "1":
					System.out.print("Unesite clanski broj: ");
					String clanskibr = sc.nextLine();
					System.out.print("Unesite ime clana: ");
					String ime = sc.nextLine();
					System.out.print("Unesite prezime clana: ");
					String prezime = sc.nextLine();
					
				
					clanskibrojevi.add(clanskibr); 
					imena.add(ime);
					prezimena.add(prezime);
					
					System.out.println("Clan je uspesno dodat!");
					break;
					
				
				case "2":
					for (int i = 0; i < imena.size(); i++) {
					
						System.out.printf("%5s %10s %15s \n", clanskibrojevi.get(i), imena.get(i), prezimena.get(i));
					}
					break;
				
				
				case "3":
					System.out.print("Unesite clanski broj: ");
					clanskibr = sc.nextLine();
					
					
					int pozicija = clanskibrojevi.indexOf(clanskibr);
					
					if(pozicija != -1) {
						clanskibrojevi.remove(pozicija);
						imena.remove(pozicija);
						prezimena.remove(pozicija);
						
						System.out.println("Clan je uspesno obrisan!");
					}
					else
						System.out.println("Ne postoji clan sa takvim clanskim brojem!");
					
					break;
				
			
				case "4":
					System.out.print("Unesite clanski broj: ");
					clanskibr = sc.nextLine();
					
					
					pozicija = clanskibrojevi.indexOf(clanskibr);
				
					
					if(pozicija != -1) {
						System.out.print("Unesite novo ime clana: ");
						ime = sc.nextLine();
						System.out.print("Unesite novo prezime clana: ");
						prezime = sc.nextLine();
						
					
						imena.set(pozicija, ime);
						prezimena.set(pozicija, prezime);
						
						System.out.println("Clan je uspesno promenjen.");
					}
					else
						System.out.println("Ne postoji clan sa takvim clanskim brojem!");
					
					break;
				
				
				case "5":
					System.out.print("Unesite clanski broj: ");
					clanskibr = sc.nextLine();
					pozicija = clanskibrojevi.indexOf(clanskibr);
					
					if(pozicija != -1)  {
						System.out.printf("%5s %10s %15s \n", clanskibrojevi.get(pozicija), imena.get(pozicija), prezimena.get(pozicija));
					}
					else
						System.out.println("Student sa unesenim brojem indeksa ne postoji.");
						
					break;
				
				
				case "6":
					
					System.out.print("Unesite sifru knjige: ");
					String sifraknjige = sc.nextLine();
					System.out.print("Unesite naslov knjige: ");
					String naslov = sc.nextLine();
					System.out.print("Unesite naziv autora: ");
					String autor = sc.nextLine();
					
				
					sifreknjiga.add(sifraknjige); 
					naslovi.add(naslov);
					autori.add(autor);
				
					System.out.println("Knjiga je uspesno dodata!");
					break;
				
				
				case "7":
					for (int i = 0; i < naslovi.size(); i++) {
					
						System.out.printf("%5s %15s %10s \n", sifreknjiga.get(i), naslovi.get(i), autori.get(i));
					}
					break;
				
				
				case "8":
					System.out.print("Unesite sifru knjige: ");
					sifraknjige = sc.nextLine();
					
					
					pozicija = sifreknjiga.indexOf(sifraknjige);
					
					if(pozicija != -1) {
						sifreknjiga.remove(pozicija);
						naslovi.remove(pozicija);
						autori.remove(pozicija);
						
						System.out.println("Clan je uspesno obrisan!");
					}
					else
						System.out.println("Ne postoji clan sa takvim clanskim brojem!");
					
					break;
					
				case "9":
					System.out.print("Unesite sifru knjige: ");
					sifraknjige = sc.nextLine();
					
					
					pozicija = sifreknjiga.indexOf(sifraknjige);
					
					if(pozicija != -1) {
						System.out.print("Unesite novi naslov knjige: ");
						naslov = sc.nextLine();
						System.out.print("Unesite novog autora knjige: ");
						autor = sc.nextLine();
						
						
						naslovi.set(pozicija, naslov);
						autori.set(pozicija, autor);
						
						System.out.println("Knjiga je uspesno izmenjena!");
					}
					else
						System.out.println("Ne postoji knjiga sa takvom sifrom!");
					
					break;
					
				case "10":
					System.out.print("Unesite autora knjige: ");
					autor = sc.nextLine();
					boolean pronadjen = false;
					
					for(int i = 1; i < autori.size(); i++) {
						
						if(autor.equalsIgnoreCase(autori.get(i)))
							autor = autori.get(i);
					}
					
					for(int i = 0; i < autori.size(); i++) {
						if(autor.equalsIgnoreCase(autori.get(i))) {
							System.out.printf("%5s %15s %10s \n", sifreknjiga.get(i), naslovi.get(i), autori.get(i));
							pronadjen = true;
						}
					}
					
					if (!pronadjen)
						System.out.println("Autor nije pronadjen!");
					
					break;
					
				case "11":
					System.out.print("Unesite naslov knjige: ");
					naslov = sc.nextLine();
					pronadjen = false;
					
					for(int i = 1; i < naslovi.size(); i++) {
						
						if(naslov.equalsIgnoreCase(naslovi.get(i)))
							naslov = naslovi.get(i);
					}
					
					for(int i = 0; i < naslovi.size(); i++) {
						if(naslov.equalsIgnoreCase(naslovi.get(i))) {
							System.out.printf("%5s %15s %10s \n", sifreknjiga.get(i), naslovi.get(i), autori.get(i));
							pronadjen = true;
						}
					}
				
					if (!pronadjen)
						System.out.println("Autor nije pronadjen!");
					
					break;
					
			}


		} while (!opcija.equals("x"));

		sc.close();
	}

}
