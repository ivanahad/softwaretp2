package ers;

/*
 * This class is for a specific disaster that is an earthquake. In case of an earthquake, specific instructions will be given.
 */
public class Earthquake extends NaturalDisaster {
	public double magnitude;
	
	public Earthquake(Location epicentre, double radius, double magnitude) {
		super(epicentre, radius);
		this.magnitude = magnitude;
	}	
	
	@Override
	public String GiveSafetyInstructions() { 
		//source : http://www.conservation.ca.gov/index/Earthquakes/Pages/qh_earthquakes_what.aspx
		return "Keep your calm, and put yourself in a safe place. If you are in a building, hide under a table and hold it, or stand to an interior wall"
				+ "Stay clear of exterior walls, glass, heavy furniture, fireplaces and appliances."
				+ "If you're outside, get into the open. Stay clear of buildings, power lines or anything else that could fall on you. "
				+ "If you're driving, move the car out of traffic and stop. Avoid parking under or on bridges or overpasses. "
				+ "Try to get clear of trees, light posts, signs and power lines. When you resume driving, watch out for road hazards.";
	}
}