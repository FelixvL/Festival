package deventer.ws;
import java.util.ArrayList;

public class Artiest {
	ArrayList<Liedje> setlist = new ArrayList();
	String naam;
	
	String m1 = "\u266B";
	String m2 = "\u266A";
	
	Artiest(String n){
		naam = n;
	}
	
	void starten () {
		setSetlist (new Liedje ("Intro", 35), new Liedje ("The real Slim Shady", 135), new Liedje ("Mama", 204));
		optreden();
	}
	
	void optreden() {
		int duur = 0;
		for (Liedje L : setlist) {
			System.out.println(m1 + naam + " speelt " + L.titel + m2);
			duur += L.lengteInSeconden;
		}
		System.out.println("Het optreden is afgelopen en duurde " + duur + " seconden");
	}
	
	void setSetlist (Liedje... liedje) {
		for (Liedje l : liedje) {
			setlist.add(l);
		}
	}
}
