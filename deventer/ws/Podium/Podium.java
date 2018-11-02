package deventer.ws.Podium;
import java.util.ArrayList;

import deventer.ws.*;

public class Podium {
	public ArrayList<Artiest> artiesten = new ArrayList<>();
	public String naam;
	public int aantalMensenBinnen;
	public boolean heeftLichtshow, isBinnen;

	public void starten() {	
		
//		verwelkomArtiest();
		toonArtiesten();
	}

	public Podium(String naam) {
		this.naam = naam;
		System.out.printf("Podium %s wordt opgebouwd. %n", naam);
	}
	
	public Podium(String naam, int capaciteit) {
		this.naam = naam;
		System.out.printf("Podium %s wordt opgebouwd. %nEr kunnen %s mensen binnenkomen.%n", naam, capaciteit);
	}

	public void binnenkomen() {
		if (aantalMensenBinnen >= 3) {
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
//		System.out.printf("Welkom %s op %s! Je staat op het %s.", artiest.naam, festival.naam, naam);
//	
//		artiest.optreden();

		System.out.println("*applaus*");
	}
	
	public void setArtiesten(Artiest artiest1, Artiest artiest2, Artiest artiest3) {
			artiesten.add(artiest1);
			artiesten.add(artiest2);
			artiesten.add(artiest3);
	}
	
	public void toonArtiesten() {
		for(int i = 0; i < artiesten.size(); i++) {
//			System.out.println("Op " + naam + " speelt " + artiesten.get(i).naam);
		}
	}
}
