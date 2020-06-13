package domaci;

public class zad1 {

	public static void main(String[] args) {
	//Program koji ispisuje one brojeve izmedju 1 i 20 koji su deljivi sa 3.
		
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.println("Broj " + i + " je deljiv sa 3.");
			}
		}
	}

}