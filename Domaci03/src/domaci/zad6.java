package domaci;

public class zad6 {

	public static void main(String[] args) {
		//Program koji pronalazi najmanji element u nizu
		double a [] = {10.87, 2.54, 3.75, 0.9, 7.2, 95.34, 13.25, -0.009};
		
		double minbroj = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minbroj)
				minbroj = a[i];
		}
		System.out.println("Najmanji element u nizu je " + minbroj + ".");

	}

}
