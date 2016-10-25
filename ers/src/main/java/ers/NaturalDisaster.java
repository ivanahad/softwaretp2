package ers;

public class NaturalDisaster {
	public Location epicentre;
	public double radius;
	
	public NaturalDisaster(Location epicentre, double radius) {
		this.epicentre=epicentre;
		this.radius=radius;
	}
	public void GiveSafetyInstructions() {
		
	}

	public boolean isInDisaster(Location location){
		double distance;
		double longueur = location.coordinate.getX()-epicentre.coordinate.getX();
		double largeur = location.coordinate.getY()-epicentre.coordinate.getY();
		distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return (distance<radius);
	}
}
