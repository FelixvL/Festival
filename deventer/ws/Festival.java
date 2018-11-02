package deventer.ws;
import deventer.ws.Podium.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import deventer.ws.KassaSysteem.Kassa;

public class Festival {
	String naam="Het Foute Festival (Ultra Fout)";
	String categorie;
	int aantalBezoekers;
	int maxAantalBezoekers;
	//Kassa hoofdKassa = new Kassa();
	
	ArrayList<Podium> podia = new ArrayList<Podium>();
	ArrayList<Artiest> lineUp = new ArrayList<Artiest>();
	
	/*public Festival organiseren() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoe willen we het festival noemen?");
		String nm = sc.nextLine();
		System.out.println("Tot welke categorie behoort het festival?");
		String cat = sc.nextLine();
		System.out.println("Hoeveel bezoekers mogen er maximaal komen?");
		int max = sc.nextInt();
		Festival fest = new Festival(nm, cat, max);
		return fest;
	}*/
	
	void organiseren() {
		System.out.printf("Welkom bij het %s\n", this.naam);
		Artiest wham = new Artiest("Wham"); wham.setSetlist (new Liedje ("Last Christmas", 223), new Liedje ("Wake me up before you go go", 240), new Liedje ("Club Tropicana", 230));
		Artiest backstreetBoys = new Artiest("Backstreet Boys"); backstreetBoys.setSetlist (new Liedje ("Backstreet's Back", 245), new Liedje ("I want it that way", 190), new Liedje ("Everybody", 200));
		Artiest rammstein = new Artiest("Rammstein"); rammstein.setSetlist (new Liedje ("Du hast", 225), new Liedje ("Ich Will", 225), new Liedje ("Mein Herz Brennt", 225));
		Artiest metallica = new Artiest("Metallica"); metallica.setSetlist (new Liedje ("Master of Puppets", 420), new Liedje ("One", 500), new Liedje ("Nothing Else Matters", 270));
		Artiest eminem = new Artiest("Eminem"); eminem.setSetlist (new Liedje ("Stan", 240), new Liedje ("The real Slim Shady", 135), new Liedje ("America", 204));
		Artiest tiesto = new Artiest("Tïesto"); tiesto.setSetlist (new Liedje ("Traffic", 225), new Liedje ("Strings", 225), new Liedje ("Flight 643", 225));
		Artiest biebster = new Artiest("Justin Bieber"); biebster.setSetlist (new Liedje ("Baby", 210), new Liedje ("Sorry", 210), new Liedje ("Boyfriend", 210));
		Artiest k3 = new Artiest("K3"); k3.setSetlist (new Liedje ("Wie heb ik aan de lijn", 200), new Liedje ("Oma's aan de top", 200), new Liedje ("10000 luchtballonnen", 200));
		Artiest spiceGirls = new Artiest("Spice Girls"); spiceGirls.setSetlist (new Liedje ("Gimme all your loving", 200), new Liedje ("Say you'll be there", 200), new Liedje ("2 become 1", 200));


		
		Collections.addAll(this.podia,new Podium("Fout"), new Podium("Fouter"), new Podium("Foutst"));
		podia.get(0).setArtiesten(wham, backstreetBoys, eminem);
		podia.get(1).setArtiesten(k3, rammstein, biebster );
		podia.get(2).setArtiesten(spiceGirls, metallica, tiesto);
		programmaPrinten();
		Kassa.getInstance().starten(50);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Wil je kaartjes kopen voor %s, tik 'j' om kaartjes te kopen en 'n' om geen kaartjes te kopen\n", this.naam);
		String kaartjeJaNee= sc.nextLine();
		if (kaartjeJaNee.equals("j")){
		Kassa.getInstance().startKaartverkoop();
		System.out.println("Welk podium gaan jullie bezoeken?");
		System.out.println("Kies 1. voor podium Fout, 2. voor podium Fouter, 3. voor podium Foutst");
		String bezoek=sc.nextLine();
		if (bezoek.equals("1")){
			podia.get(0).verwelkomArtiest();
		} else if (bezoek.equals("2")) {
			podia.get(1).verwelkomArtiest();
		} else {
			podia.get(2).verwelkomArtiest();
		}
		
		}
	}
	
	void programmaPrinten() {
		System.out.println("Dit is het programma");
		for (Podium p: podia) {
			for (int x=0; x<3; x++) {
				if (x==0) {
			 System.out.println(p.artiesten.get(x).naam+ " treedt op om 20:00u op podium "+p.naam);
				} else if (x==1) {
					System.out.println(p.artiesten.get(x).naam+ " treedt op om 21:00u op podium "+p.naam);	
				} else {
					System.out.println(p.artiesten.get(x).naam+ " treedt op om 22:00u op podium "+p.naam);
				}
			} System.out.println();
		}
	}
/*	 void maakKeuze() {
		 Kassa.getInstance().starten(50);
			Scanner sc = new Scanner(System.in);
			System.out.printf("Wil je kaartjes kopen voor %s, tik 'j' om kaartjes te kopen en 'n' om geen kaartjes te kopen\n", this.naam);
			String kaartjeJaNee= sc.nextLine();
			if (kaartjeJaNee.equals("j")){
			Kassa.getInstance().startKaartverkoop();
			}
	 }
*/	
	
	Festival(String nm, String cat){
		naam = nm;
		categorie = cat;
	}
	
	Festival(String nm, String cat, int max){
		naam = nm;
		categorie = cat;
		maxAantalBezoekers = max;
	}
	
	Festival(String nm){
		naam = nm;
	}
	
	Festival(){
		
	}
		
}
