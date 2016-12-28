/**
 * Created by Ivan & Eddy
 */

public class NaturalDisaster{
	public Location location;
	private int id;

	public static int count=0;

	public NaturalDisaster(int x, int y, double radius) {
		this.location = new Location(x, y, radius);
		id = count++;
	}

	public NaturalDisaster(Location location) {
		this.location = location;
		id = count++;
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

	public int getId() {
		return id;
	}

	@Override
	public String toString(){
		return Language.getString("natural_disaster") + ": " + location.toString();
	}
}
