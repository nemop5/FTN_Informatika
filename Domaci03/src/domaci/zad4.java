package domaci;

public class zad4 {

	public static void main(String[] args) {
		//Program koji utvrdjuje da li je niz simetrican
		int a [] = {98, 9, 8, 7, 6, 7, 6, 7, 8, 9, 98};
		
		
		boolean simetrican = false; 
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] == a[a.length - i - 1]) 
				simetrican = true;
		}
		
		if (simetrican) {
			System.out.println("Niz je simetrican.");
		} else
			System.out.println("Niz nije simetrican.");
	}
}
