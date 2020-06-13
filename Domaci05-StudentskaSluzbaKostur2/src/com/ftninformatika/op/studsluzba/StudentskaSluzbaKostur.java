package com.ftninformatika.op.studsluzba;

import java.util.ArrayList;

import java.util.Scanner;

//Kostur zadatka koji treba da se nadogradi
public class StudentskaSluzbaKostur {

	public static void main(String[] args) {
		//Pravimo liste za brojeve indeksa i za imena
		ArrayList<String> indeksi = new ArrayList<String>();
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		ArrayList<Double> proseci = new ArrayList<Double>();
		
		//Dodaje se 5 studenata, cisto radi testiranja
		//U pravoj aplikaciji nikad ne bi trebali imati "zabetonirano" dodavanje studenata
		
		//indeksi
		indeksi.add("I1");
		indeksi.add("I2");
		indeksi.add("I3");
		indeksi.add("I4");
		indeksi.add("I5");		
		//imena
		imena.add("Marko");
		imena.add("Milan");
		imena.add("Petar");
		imena.add("Dejan");
		imena.add("Zoran");
		//prezimena
		prezimena.add("Markovic");
		prezimena.add("Milanovic");
		prezimena.add("Petrovic");
		prezimena.add("Dejanovic");
		prezimena.add("Atanasijevic");
		//proseci
		proseci.add(9.33);
		proseci.add(9.01);
		proseci.add(9.33);
		proseci.add(8.79);
		proseci.add(7.53);

		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
			System.out.println("*********** MENI **********");
			System.out.println("1. Spisak studenata");
			System.out.println("2. Pronalazenje studenta na osnovu indeksa");
			System.out.println("3. Spisak studenata koji imaju vecu prosecnu ocenu od datog praga");
			System.out.println("4. Prikaz studenta sa najvecom prosecnom ocenom");
			System.out.println("5. Unos novog studenta");
			System.out.println("6. Brisanje studenta");
			System.out.println("7. Izmena podataka o studentu");
			System.out.println("8. Izmena prosecne ocene odredjenog studenta");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");

			opcija = sc.nextLine();

			switch (opcija) {
			
			//spisak studenata
			case "1":
				for (int i = 0; i < indeksi.size(); i++) {
					//10 mesta za imena i 5 mesta prosek odvojimo da bi podaci bili poravnati
					System.out.printf("%5s %10s %15s %5s \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
				}
				break;
				
		
			//Pronalazenje studenta na osnovu indeksa
			case "2": 
				System.out.print("Unesite broj indeksa studenta: ");
				String brIndeksa = sc.nextLine();

				int index = -1;
				for (int i = 0; i < indeksi.size(); i++) {
					if (indeksi.get(i).equals(brIndeksa)) {
						index = i;
						break;
					}
				}
				
				if (index > -1) 
					System.out.printf("%5s %10s %15s %5s \n", indeksi.get(index), imena.get(index), prezimena.get(index), proseci.get(index));
				else
					System.out.println("Nepostojeci broj indeksa!");
						
				break;
				
				
			//Spisak studenata koji imaju vecu prosecnu ocenu od datog praga	
			case "3" : 
				System.out.print("Unesite zadati prag: ");
				double prosek = Double.parseDouble(sc.nextLine());
				
				
				for (int i = 0; i < indeksi.size(); i++) {
					if (proseci.get(i) > prosek) 
						System.out.printf("%5s %10s %15s %5s \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
				}
				break;
			
				
			//Prikaz studenta sa najvecom prosecnom ocenom
			case "4":
				
				double NajveciProsek = 0;
				for (int i = 0; i < indeksi.size(); i++) {
					if (proseci.get(i) > NajveciProsek) {
						NajveciProsek = proseci.get(i);
					}	
				}
				
				for (int i = 0; i < indeksi.size(); i++) {
					if (NajveciProsek == proseci.get(i))
						System.out.printf("%5s %10s %15s %5s \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
				}
				
				break;
		
				
			// Unos novog studenta
			case "5":
				//prvo od korisnika trazimo da unese podatke
				System.out.print("Unesite broj indeksa studenta: ");
				brIndeksa = sc.nextLine();
				System.out.print("Unesite ime studenta: ");
				String ime = sc.nextLine();
				System.out.print("Unesite prezime studenta: ");
				String prezime = sc.nextLine();
				System.out.print("Unesite prosecnu ocenu studenta: ");
				prosek = Double.parseDouble(sc.nextLine());
				//unete podetke dodajemo u odgovarajuce liste (na kraj liste)
				indeksi.add(brIndeksa); 
				imena.add(ime);
				prezimena.add(prezime);
				proseci.add(prosek);
				System.out.println("Student je uspesno dodat u listu!");
				break;
				
				
			// Brisanje studenta	
			case "6":
				System.out.print("Unesite broj indeksa studenta: ");
				brIndeksa = sc.nextLine();

				index = -1;
				for (int i = 0; i < indeksi.size(); i++) {
					if (indeksi.get(i).equals(brIndeksa)) {
						index = i;
						break;
					}
				}
				
				if (index > -1) {
					indeksi.remove(index);
					imena.remove(index);
					prezimena.remove(index);
					proseci.remove(index);
					System.out.println("Student obrisan!");
				}else
					System.out.println("Nepostojeci broj indeksa!");
				
				break;
				
				
			//Izmena podataka o studentu
			case "7":
				System.out.print("Unesite broj indeksa studenta: ");
				brIndeksa = sc.nextLine();
				
				index = -1;
				for (int i = 0; i < indeksi.size(); i++) {
					if (indeksi.get(i).equals(brIndeksa)) {
						index = i;
						break;
					}
				}
				
				if (index > -1) {
					System.out.print("Unesite novo ime studenta: ");
					String NovoIme = sc.nextLine();
					System.out.print("Unesite novo prezime studenta: ");
					String NovoPrezime = sc.nextLine();
					imena.set(index, NovoIme);
					prezimena.set(index, NovoPrezime);
					System.out.println("Student uspesno izmenjen!");
				}else {
					System.out.println("Nepostojeci broj indeksa!");
					break;
				}
					
				break;
				
				
			//Izmena prosecne ocene studenta
			case "8":
				System.out.print("Unesite broj indeksa studenta: ");
				brIndeksa = sc.nextLine();
				
				index = -1;
				for (int i = 0; i < indeksi.size(); i++) {
					if (indeksi.get(i).equals(brIndeksa)) {
						index = i;
						break;
					}
				}
				
				if (index > -1) {
					System.out.print("Unesite prosecnu ocenu: ");
					prosek = Double.parseDouble(sc.nextLine());
					proseci.set(index, prosek);
					System.out.println("Student uspesno izmenjen!");
				}else {
					System.out.println("Nepostojeci broj indeksa!");
					break;
				}
						
				break;
				
			}

		} while (!opcija.equals("x"));

		sc.close();

	}

}
