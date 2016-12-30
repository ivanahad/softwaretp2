package be.ucl.ingi.lingi2252;

/**
 * Created by Ivan & Eddy
 */

public class NaturalDisaster{
	public Location location;


	public NaturalDisaster(int x, int y, double radius) {
		this.location = new Location(x, y, radius);
	}

	public NaturalDisaster(Location location) {
		this.location = location;
	}

	public static String giveSafetyInstructions() {
		return Language.getString("natural_disaster_safety_instructions");
	}

	public boolean isInDisaster(Location location){
		double longueur = this.location.getX()-location.getX();
		double largeur = this.location.getY()-location.getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return (distance<location.getRadius());
	}

	public Location getLocation() {
		return location;
	}

	@Override
	public String toString(){
		return Language.getString("natural_disaster") + ": " + location.toString();
	}

	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		NaturalDisaster other = (NaturalDisaster) o;
		if(this.location.equals(other.location))
			return true;
		return false;
	}
}
