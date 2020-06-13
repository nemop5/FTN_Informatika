package domaci;

public class zad3 {

	public static void main(String[] args) {
		//Program koji izracunava obim i povrsinu pravougaonika.
		double a;
		double b;
		a = 7;
		b = 8.2;
		
		double obim = 2 * a + 2 * b;
		double povrsina = a * b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Obim pravougaonika iznosi " + (int)obim 
							+ ", dok je njegova povrsina " + (int)povrsina + ".");
	}

}
