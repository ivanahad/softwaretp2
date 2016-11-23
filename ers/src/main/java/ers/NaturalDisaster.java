package ers;

public class NaturalDisaster {
	public Location location;
	
	public NaturalDisaster(Location location) {
		this.location = location;
	}
	
	public String GiveSafetyInstructions() {
		return "Keep your calm, and put yourself in a safe place";
	}

	public boolean isInDisaster(Location location){
		double longueur = location.getCoordinate().getX()-this.location.getCoordinate().getX();
		double largeur = location.getCoordinate().getY()-this.location.getCoordinate().getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return (distance<this.location.getRadius());
	}

	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		else if (getClass() != o.getClass())
			return false;

		NaturalDisaster other = (NaturalDisaster) o;
		return this.location.equals(other.location);
	}

	@Override
	public String toString(){
		return location.toString() + " (natural disaster)";
	}
}
