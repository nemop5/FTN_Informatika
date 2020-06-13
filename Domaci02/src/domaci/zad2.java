package domaci;

public class zad2 {

	public static void main(String[] args) {
		//Program koji ispisuje obim i povrsinu kruga.
		double pi = 3.14159265359;
		
		double poluprecnik;
		poluprecnik = 4.5;
		
		double obim = 2 * poluprecnik * pi;
		double povrsina = poluprecnik * poluprecnik * pi;
		
		System.out.println("Ako je poluprecnik " + poluprecnik + ".");
		System.out.println("Obim kruga je " + (int)obim + ", dok je njegova povrsina " 
							+ (int)povrsina + ".");	
	}

}
