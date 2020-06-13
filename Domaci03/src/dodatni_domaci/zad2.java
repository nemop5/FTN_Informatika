package dodatni_domaci;

public class zad2 {

	public static void main(String[] args) {
		//Implementirati program koji odredjuje da li je zadati niz karaktera palindrom.
		char a [] = {'a', 'n', 'a', 'n', 'a'};
		
		boolean palindrom = false; 
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[a.length - 1 - i]) 
				palindrom = true;
				break;
		}
		
		if (palindrom) {
			System.out.println("Niz karaktera je palindrom.");
		} else
			System.out.println("Niz karaktera nije palindrom.");
	}
}
