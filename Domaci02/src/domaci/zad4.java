package domaci;

public class zad4 {

	public static void main(String[] args) {
		//Program koji izracunava ukupnu cenu koju kupac treba da plati
		//Kolicina i cena proizvoda
		int cena;
		cena = 10500;
		int kolicina;
		kolicina = 2;
		int uk_cena = cena * kolicina;
		
		//Da li je proivod na akciji
		boolean akcija = true; 
		
		if (akcija) {
			uk_cena -= uk_cena * 0.1;
			System.out.println("Ukupna cena je: " + uk_cena + ".");
			System.out.println("U cenu je uracunat akcijski popust od 10%.");
		}else
			System.out.println("Ukupna cena je: " + uk_cena + ".");
		
	}

}
