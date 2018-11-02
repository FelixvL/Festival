package deventer.ws;
import java.util.ArrayList;

public class Artiest {
	ArrayList<Liedje> setlist = new ArrayList();
	String naam;
	
	void optreden() {
		
	}
	
	void setSetlist (Liedje... liedje) {
		for (Liedje l : liedje) {
			setlist.add(l);
		}
	}
}
