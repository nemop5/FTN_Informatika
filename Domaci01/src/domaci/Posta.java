package domaci;

public class Posta {

	public static void main(String[] args) {
		// tezina postanskog paketa
		double weight;
		weight = 1.50;
		
		//ime, prezime i adresa primaoca
		String name;
		name = "Nikola Nikolic ";
		String adress;
		adress = "Laze Nancica 5 ";
		
		//ime, prezime i adresa posiljaoca
		String name1; 
		name1 = "Petar Petrovic ";
		String adress1;
		adress1 = "Futoski put 117";
		
		// Da li se posiljka salje preporuceno		
		boolean preporuceno = true;
		
		System.out.println("Posiljaoc: " + name + adress + "salje paket primaocu: " + 
							name1 + adress1 + ".");
		System.out.println("\tTezina paketa je " + weight + ".");
		System.out.println("\tPoslati preporuceno?: " + preporuceno);
	}

}
