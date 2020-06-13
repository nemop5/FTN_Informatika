package domaci;

public class zad1 {

	public static void main(String[] args) {
		// Program koji preracunava iz Celzijusa u Farenhajte.
		double temperatura_celzijus;
		temperatura_celzijus = 28.7;
		
		double temperatura_farenhajt;
		temperatura_farenhajt = temperatura_celzijus * 1.80 + 32;
		
		System.out.println("Temperatura je " + temperatura_celzijus + " celzijusa.");
		System.out.println("Temperatura je " + temperatura_farenhajt + " farenhajta.");	
	}

}
