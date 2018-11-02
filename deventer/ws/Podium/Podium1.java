package deventer.ws.Podium;

public class Podium1 extends Podium{
	public boolean heeftCameras = true;
	
	
	public Podium1(String naam, int capaciteit) {
		super(naam, capaciteit);	
	}
	
	public String schietVuurwerk() {
		return "VUURWERK! KNAL PANG BOEM!";
	}
}
