package domaci;

public class zad5 {

	public static void main(String[] args) {
		//Program koji pronalazi najveci element u nizu decimalnih brojeva
		double a [] = {10.87, 2.54, 3.75, 0.9, 7.2, 95.34, 13.25, -0.009};
		
		double maxbroj = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxbroj) {
				maxbroj = a[i];
			}
		}
		System.out.println("Najveci element u nizu je " + maxbroj + ".");
	}

}
