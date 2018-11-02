package deventer.ws;
import deventer.ws.Podium.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Festival {
	String naam;
	String categorie;
	int aantalBezoekers;
	int maxAantalBezoekers;
	//Kassa hoofdKassa = new Kassa();
	
//	ArrayList<Podium> podia = new ArrayList<Podium>();
	ArrayList<Artiest> lineUp = new ArrayList<Artiest>();
	
	public Festival organiseren() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoe willen we het festival noemen?");
		String nm = sc.nextLine();
		System.out.println("Tot welke categorie behoort het festival?");
		String cat = sc.nextLine();
		System.out.println("Hoeveel bezoekers mogen er maximaal komen?");
		int max = sc.nextInt();
		Festival fest = new Festival(nm, cat, max);
		return fest;
	}
	
	
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
