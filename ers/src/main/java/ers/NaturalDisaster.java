package ers;

/*
 * Represents a natural disaster that is described as an epicentre and its radius. 
 */
public class NaturalDisaster {
	public Location epicentre;
	public double radius;
	
	public NaturalDisaster(Location epicentre, double radius) {
		this.epicentre=epicentre;
		this.radius=radius;
	}
	
	public String GiveSafetyInstructions() {
		return "Keep your calm, and put yourself in a safe place";
	}

	/*
	 * Allows to know if a certain location is in the surface of the disaster that is currently occuring
	 */
	public boolean isInDisaster(Location location){
		double distance;
		double longueur = location.coordinate.getX()-epicentre.coordinate.getX();
		double largeur = location.coordinate.getY()-epicentre.coordinate.getY();
		distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return (distance<radius);
	}
}
