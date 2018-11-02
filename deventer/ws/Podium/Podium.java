package deventer.ws.Podium;

abstract class Podium {
	// Artiest artiest;
	String naam;
	final int capaciteit;
	int aantalMensenBinnen;
	boolean heeftLichtshow, isBinnen;

	public void starten() {					
		//onze tijdelijke main.
		
		//Podium podium = new Podium1("Hoofdpodium", 102);
		//Podium podium2 = new Podium1("Hoofdpodium", 3);
	}

	public Podium(String naam, int capaciteit) {
		this.naam = naam;
		this.capaciteit = capaciteit;
		System.out.printf("Podium %s wordt opgebouwd. %nEr kunnen %s mensen binnenkomen.%n", naam, capaciteit);
	}

	public void binnenkomen() {
		if (aantalMensenBinnen >= capaciteit) {
			System.out.println("Helaas, het is vol.");
		} else {
			System.out.printf("Welkom bij %s", naam);
			aantalMensenBinnen++;
		}
	}

	public void verlaten() {
		if (aantalMensenBinnen > 0) {
			System.out.println("Tot ziens!");
			aantalMensenBinnen--;
		}
	}

	public void verwelkomArtiest() {

	}

}
