package deventer.ws.Podium;
import deventer.ws.*;

public class Podium {
	public String naam;
	public final int capaciteit;
	public int aantalMensenBinnen;
	public boolean heeftLichtshow, isBinnen;

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

	public void verwelkomArtiest(Artiest artiest, Festival festival) {
		//System.out.printf("Welkom %s op %s! Je staat op het %s.%nDe volgende nummers gaan gespeeld worden:", artiest.naam, festival.naam, naam);
		
		//for(Liedje x: artiest.setlist) {
		//	System.out.print(x + " ");
		//}
		
		System.out.println("*applaus*");
	}
}
