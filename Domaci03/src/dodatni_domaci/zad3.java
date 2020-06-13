package dodatni_domaci;

public class zad3 {

	public static void main(String[] args) {
		//Program koji pronalazi presek dva niza prirodnih brojeva.
		int[] niz1 = { 1, 2, 3, 4, 8, 6, 1000, 25, 125, 16 };
		int[] niz2 = { 8, 1, 3, 7, 1, 16, 9 };
		int brojElemenata = (niz1.length > niz2.length) ? niz2.length : niz1.length;

		int[] presek = new int[brojElemenata];
		int k = 0;

		for (int i = 0; i < niz1.length; i++) {
			for (int j = 0; j < niz2.length; j++) {
				if (niz1[i] == niz2[j]) {
					presek[k++] = niz1[i];
					break;
				}
			}
		}

		System.out.print("Presek niza1 i niza2 je: ");
		for (int i = 0; i < k; i++) {
			System.out.print(presek[i] + " ");
		}
	}

}

