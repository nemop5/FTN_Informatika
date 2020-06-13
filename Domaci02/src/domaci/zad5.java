package domaci;

public class zad5 {

	public static void main(String[] args) {
		//Program koji proverava da li je godina prestupna 
		int godina; 
		godina = 2014;
		System.out.println("Da li je " + godina + " godina prestupna?");
		
		if (godina % 400 == 0) {
			System.out.println("Godina je prestupna.");
		}else if (godina % 100 == 0) {
			System.out.println("Godina nije prestupna.");
		}else if (godina % 4 == 0) {
			System.out.println("Goidna je prestupna.");
		}else if (godina % 4 != 0) {
			System.out.println("Godina nije prestupna.");
		}
	}
}