package deventer.ws;

public class Kassa {
	private int prijsKaart, totaleOmzet, aantalBezoekers;
	private Kassa kassa ;
	
	
	private Kassa() {
		
	}
	
	public Kassa getInstance() {
		if (kassa == null) {
			kassa = new Kassa();
			return kassa;
		}
		return kassa;
	}
}
