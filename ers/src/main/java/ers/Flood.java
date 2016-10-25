package ers;

public class Flood extends NaturalDisaster{
	
	public Flood(Location epicentre, double radius) {
		super(epicentre, radius);
	}

	@Override
	public String GiveSafetyInstructions() { 
		//source : https://www.getprepared.gc.ca/cnt/rsrcs/pblctns/flds-wtd/index-en.aspx#s4
		return "Vacate your home when you are advised to do so by local emergency authorities. Take your emergency kit with you. Never cross a flooded area";
	}
}
