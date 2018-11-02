package deventer.ws.Podium;

abstract class Podium {
	//Artiest artiest;
	String naam;
	int oppervlakte;
	boolean heeftLichtshow, isBinnen;
	
	public Podium() {
	}
	
	public Podium(String naam) {
		this.naam = naam;
		System.out.printf("Podium %s wordt opgebouwd.", naam);
	}
	
	//void binnenkomen();
	//abstract void verlaten();

}
