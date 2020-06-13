package domaci;

public class zad2 {

	public static void main(String[] args) {
		//Program koji racuna srednju vrednost niza celih brojeva
		int a[] = { 5, 25, 77, 14, 12, 1, 7, 8, 99, 34};
		
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		sum = sum / a.length;
		System.out.println("Srednja vrednost niza je: " + sum + ".");
		
	}

}
