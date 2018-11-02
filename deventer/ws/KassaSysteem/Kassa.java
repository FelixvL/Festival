package deventer.ws.KassaSysteem;

public class Kassa {
	private int prijsKaart, totaleOmzet, aantalKaartenVerkocht;
	private static Kassa kassa;

	private Kassa() {

	}

	public static Kassa getInstance() {
		if (kassa == null) {
			kassa = new Kassa();
			return kassa;
		}
		return kassa;
	}

	public int omzetLatenZien() {
		return totaleOmzet;
	}

	public int kaartKopen(int aantalKaartjes) {
		aantalKaartenVerkocht += aantalKaartjes;
		printBon(aantalKaartjes);
		return prijsKaart * aantalKaartjes;
	}
	public void printBon(int aantalKaartjes) {
		int totaalPrijsKaart = aantalKaartjes * prijsKaart;
		System.out.println("Hartelijk dank voor het aankoop van " + aantalKaartjes + 
				(aantalKaartjes <= 1 ? " kaart. Totaal is: €"+ totaalPrijsKaart : " kaarten. Totaal is: €" + totaalPrijsKaart));
	}

	public void starten(int prijsKaart) {
		this.prijsKaart = prijsKaart;
		kaartKopen(6);
	}
	public int totaleBezoeker() {
		return aantalKaartenVerkocht;
	}
	
}
