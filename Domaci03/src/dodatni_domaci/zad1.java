package dodatni_domaci;

public class zad1 {

	public static void main(String[] args) {
		//Izracunati faktorijel proizvoljno zadatog prirodnog broja.
		int n = 5;
		
		int faktorijel = 1;
		for (int i = 1; i <= n; i++) {
			faktorijel *= i;
		}
		System.out.println("Faktorijel broja " + n + " je " + faktorijel + ".");
		
	}

}
