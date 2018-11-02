package deventer.ws;

import java.util.ArrayList;

public class Festival {
	String naam;
	String categorie;
	int aantalBezoekers;
	int maxAantalBezoekers;
	//Kassa hoofdKassa = new Kassa();
	
	ArrayList podia = new ArrayList();
	ArrayList lineUp = new ArrayList();
	
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
