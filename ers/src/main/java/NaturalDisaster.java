/**
 * Created by Ivan & Eddy
 */

public class NaturalDisaster extends Location{
	public NaturalDisaster(int x, int y, double radius) {
		super(x, y, radius);
	}
	
	public String GiveSafetyInstructions() {
		return Language.getString("natural_disaster_safety_instructions");
	}

	public boolean isInDisaster(Location location){
		double longueur = location.getX()-this.getX();
		double largeur = location.getY()-this.getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return (distance<this.getRadius());
	}

	@Override
	public String toString(){
		return Language.getString("natural_disaster") + ": " + super.toString();
	}
}
