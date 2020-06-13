package domaci;

public class zad3 {

	public static void main(String[] args) {
		//Program koji utvrdjuje da li se u datom nizu celih br. nalazi br. 5
		int a[] = { 11, 25, 77, 14, 12, 1, 7, 8, 99, 5};
		
		boolean postoji5 = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 5) {
				postoji5 = true;
				break;
			}
		}
		
		if (postoji5) {
			System.out.println("U nizu postoji broj 5.");
		} else 
			System.out.println("U nizu nema broja 5.");
		
	}
	
}
