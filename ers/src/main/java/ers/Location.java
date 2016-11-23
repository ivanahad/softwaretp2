package ers;


public class Location {
	private Coordinate coordinate;
	private double radius;
	
	public Location (Coordinate coordinate) {
		this.coordinate = coordinate;
		this.radius = 0;
	}

	public Location(Coordinate coordinate, double radius) {
		this.coordinate = coordinate;
		this.radius = radius;
	}
	
	public double distanceLocations(Location otherLocation)
	{
		double longueur = otherLocation.coordinate.getX()-this.coordinate.getX();
		double largeur = otherLocation.coordinate.getY()-this.coordinate.getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return distance - this.radius - otherLocation.radius;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
