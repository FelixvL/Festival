package deventer.ws;
import java.util.ArrayList;
import java.util.Random;

import deventer.ws.Podium.Podium1;

public class Artiest {
	ArrayList<Liedje> setlist = new ArrayList();
	ArrayList<String> gebeurtenissen = new ArrayList();
	Random random = new Random();
	String naam;
	
	String m1 = "\u266B";
	String m2 = "\u266A";
	
	Artiest(String n){
		naam = n;
	}
	
	public void starten () {
		gebeurtenissen.add("Een meisje op de eerste rij valt flauw.");
		gebeurtenissen.add(naam + " krijgt een bierdouche.");
		gebeurtenissen.add("Er ontstaat een dikke moshpit voor het podium!!!");
		gebeurtenissen.add(naam + " duikt het publiek in en crowdsurft de tent door!");
//		gebeurtenissen.add(Podium1.schietVuurwerk());
		gebeurtenissen.add(naam + " is zo stoned als een garnaal.");
		setSetlist (new Liedje ("Intro", 35), new Liedje ("The real Slim Shady", 135), new Liedje ("Mama", 204));
		optreden();
	}
	
	public void optreden() {
		int duur = 0;
		System.out.println(naam + " komt op en het dak gaat eraf!");
		for (Liedje L : setlist) {
			System.out.println(m1 + " " + naam + " speelt " + L.titel + " " + m2);
			System.out.println(gebeurtenissen.get(random.nextInt(gebeurtenissen.size())));
			duur += L.lengteInSeconden;
		}
		int m = duur/60;
		int s = duur%60;
		System.out.println("Het optreden is afgelopen en duurde " + m + " minuten en " + s + " seconden.");
	}
	
	public void setSetlist (Liedje... liedje) {
		for (Liedje l : liedje) {
			setlist.add(l);
		}
	}
}