package deventer.ws;

import deventer.ws.KassaSysteem.Kassa;
import deventer.ws.Podium.Podium1;

public class FestivalApplicatie{
	public static void main(String[] args) {
/*		System.out.println("gaaf");
		new Podium1("Podium",500).starten();
		new Artiest("Eminem").starten();*/
		Kassa.getInstance().starten(50);
		//new Festival().organiseren();
		Kassa.getInstance().startKaartverkoop();
	}
}
