package com.domaci.dodatno;

public class Zadatak01 {

	public static void main(String[] args) {
		int mesec = 10; 
		
		if(mesec < 1 || mesec > 12) {
			System.out.println("Nepostojeci mesec");
		} else if(mesec == 2) {
			System.out.println("Zadati mesec je februar i u zavisnosti od godine moze da ima 28, 29 kada je prestupna godina ili 30 samo jednom.");
		} else if(mesec % 2 == 0 && mesec < 8) {
			System.out.println("Zadati mesec ima 30 dana");
		} else if(mesec % 2 == 0 && mesec > 8) {
			System.out.println("Zadati mesec ima 31 dana");
		} else if (mesec <= 8) {
			System.out.println("Zadati mesec ima 31 dana");
		} else {
			System.out.println("Zadati mesec ima 30 dana");
		}

	}

}
