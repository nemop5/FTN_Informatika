package dodatni_domaci;

public class zad1 {

	public static void main(String[] args) {
		//Program koji na osnovu zadatog meseca vraca broj dana u tom mesecu
		int mesec;
		mesec = 2;
		System.out.println(mesec + " mesec");
		
		switch (mesec) {
			case 1: case 3: case 5: case 7: 
			case 8: case 10: case 12: System.out.println("Ima 31 dan.");
				break;
			case 2: System.out.println("Ima 28 ili 29 dana.");
				break;
			case 4: case 6: case 9: case 11: System.out.println("Ima 30 dana.");
				break;
			default: System.out.println("Nepostojeci mesec!");
		}
	}
}
