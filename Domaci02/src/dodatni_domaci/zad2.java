package dodatni_domaci;

public class zad2 {

	public static void main(String[] args) {
		//Program koji na osnovu zadate sekunde u danu(0-86400) prikazuje vreme(hh;mm;ss)
		int sekunda;
		sekunda = 74567;
		
		
		//Definisanje hh:
		int hh = sekunda / 3600;
		int remainder = sekunda % 3600;
		
		//Definisanje mm:
		int mm = remainder / 60;
		int remainder1 = remainder % 60;
		
		//Definisanje ss:
		int ss = remainder1;
		
		System.out.println("Sekunda u danu: " + sekunda + " je u formatu hh-mm-ss");
		System.out.println(hh + ":" + mm + ":" + ss);
	}

}
