package deventer.ws.KassaSysteem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kassa {
	private int prijsKaart, totaleOmzet, aantalKaartenVerkocht, jajusPot;
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
		this.totaleOmzet += totaalPrijsKaart;
		System.out.println("\nHartelijk dank voor het aankoop van " + aantalKaartjes + 
				(aantalKaartjes <= 1 ? " kaart voor Javiel&Jus Festival. Totaal is: €"
						+ totaalPrijsKaart + "\n" : " kaarten voor Javiel&Jus Festival. Totaal is: €" 
						+ totaalPrijsKaart + "\n"));
	}

	public void starten(int prijsKaart) {
		this.prijsKaart = prijsKaart;
	}
	
	public int startKaartverkoop() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Hoeveel kaartjes wilt u kopen?");
			try {
				int inputAantal = scanner.nextInt();
				if(inputAantal == 0) {
					System.out.println("U kunt alleen 1 of meer kaartjes kopen");
					continue;
				}
				kaartKopen(inputAantal);
				return inputAantal;
			}catch(InputMismatchException ime) {
				System.out.println("Geef een getal door");
				scanner = new Scanner(System.in);
				continue;
			}
		}
	}
	
	public int totaleBezoeker() {
		return aantalKaartenVerkocht;
	}
	
}
