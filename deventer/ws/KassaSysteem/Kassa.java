package deventer.ws.KassaSysteem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kassa {
	private int prijsKaart, totaleOmzet, aantalKaartenVerkocht, jajusPot, wsPot;
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

	private int kaartKopen(int aantalKaartjes) {
		aantalKaartenVerkocht += aantalKaartjes;
		printBon(aantalKaartjes);
		return prijsKaart * aantalKaartjes;
	}

	private void printBon(int aantalKaartjes) {
		int totaalPrijsKaart = aantalKaartjes * prijsKaart;
		System.out.println("\nHartelijk dank voor het aankoop van " + aantalKaartjes + (aantalKaartjes <= 1
				? " kaart voor Javiel&Jus Festival. Totaal is: €" + totaalPrijsKaart + "\n"
				: " kaarten voor Javiel&Jus Festival.\n" + "U heeft totaal: €" + totaalPrijsKaart + " betaald\n"));
		this.jajusPot += totaalPrijsKaart * 0.75;
		this.wsPot += totaalPrijsKaart * 0.05;
		this.totaleOmzet += totaalPrijsKaart * 0.2;
		System.out.println("Factuurspecificatie:");
		System.out.println("75% - €" + jajusPot + " gaat naar JavJus BV.\n5% - €" + wsPot
				+ " gaat naar de Trainees van WS\n20% - €" + totaleOmzet + " gaat naar het festival");
		totaalOverzicht();

	}

	public void starten(int prijsKaart) {
		this.prijsKaart = prijsKaart;
	}

	public int startKaartverkoop() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Hoeveel kaartjes wilt u kopen?");
			try {
				int inputAantal = scanner.nextInt();
				if (inputAantal == 0) {
					System.out.println("U kunt alleen 1 of meer kaartjes kopen");
					continue;
				}
				kaartKopen(inputAantal);
				return inputAantal;
			} catch (InputMismatchException ime) {
				System.out.println("Geef een getal door");
				scanner = new Scanner(System.in);
				continue;
			}
		}
	}

	public int totaleBezoeker() {
		return aantalKaartenVerkocht;
	}

	public void totaalOverzicht() {
		System.out.println("\nTotaal overzicht:" + "\nAantal verkochte kaartjes: " + aantalKaartenVerkocht
				+ "\nTotale kaarten omzet: €" + (totaleOmzet + wsPot + jajusPot)
				+ "\n\nOmzet JavJus BV is 75% van totale omzet: €" + jajusPot
				+ "\nOmzet trainees WS is 5% van totale omzet: €" + wsPot
				+ "\nOmzet organisatie is 20% van totale omzet: €" + totaleOmzet);
	}

}
