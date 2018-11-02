package deventer.ws;

import deventer.ws.KassaSysteem.Kassa;
import deventer.ws.Podium.Podium1;

public class FestivalApplicatie{
	public static void main(String[] args) {
		Kassa.getInstance().starten(50);
		Kassa.getInstance().startKaartverkoop();
//		Festival festival = new Festival();
//		festival.organiseren();
	}
}
