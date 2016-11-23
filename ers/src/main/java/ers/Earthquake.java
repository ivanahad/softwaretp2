package ers;

public class Earthquake extends NaturalDisaster {
	public double magnitude;
	
	public Earthquake(Location location, double magnitude) {
		super(location);
		this.magnitude = magnitude;
	}	
	
	@Override
	public String GiveSafetyInstructions() {
		//source : http://www.conservation.ca.gov/index/Earthquakes/Pages/qh_earthquakes_what.aspx
		return Language.getString("earthquake_safety_instructions");
	}

	@Override
	public String toString(){
		return location.toString() + Language.getString("magnitude") +": " + magnitude + "( " + Language.getString("earthquake") + ")";
	}
}