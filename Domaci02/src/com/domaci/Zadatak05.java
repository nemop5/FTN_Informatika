package com.domaci;

public class Zadatak05 {
	
	public static void main(String[] args) {
		
		int godina = 2015;
		
		if(godina % 400 == 0)
			System.out.println("Godina " + godina + ". je prestupna jer je deljiva sa 400");
		else if(godina % 100 == 0)
			System.out.println("Godina " + godina + ". nije prestupna jer je deljiva sa 100 i nije deljiva sa 400");
		else if(godina % 4 == 0)
			System.out.println("Godina " + godina + ". je prestupna jer je deljiva sa 4 i nije deljiva sa 100 i nije deljiva sa 400");
		else
			System.out.println("Godina " + godina + ". nije prestupna jer je nije deljiva sa 4 i nije deljiva sa 100 i nije deljiva sa 400");

	}

}
