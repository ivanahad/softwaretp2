package ers;

public class Flood extends NaturalDisaster{
	
	public Flood(Location location) {
		super(location);
	}

	@Override
	public String GiveSafetyInstructions() { 
		//source : https://www.getprepared.gc.ca/cnt/rsrcs/pblctns/flds-wtd/index-en.aspx#s4
		return Language.getString("flood_safety_instructions");
	}

	@Override
	public String toString(){
		return location.toString() + "( "+ Language.getString("flood") + ")";
	}
}
