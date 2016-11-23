package ers;


public class Location {
	public Coordinate coordinate;
	public int radius;
	
	public Location (Coordinate coordinate) {
		this.coordinate = coordinate;
		this.radius = 0;
	}

	public Location(Coordinate coordinate, int radius) {
		this.coordinate = coordinate;
		this.radius = radius;
	}

	public void updateLocation(Coordinate coordinate){
		this.coordinate=coordinate;
	}
	
	public double distanceLocations(Location otherLocation)
	{
		double longueur = otherLocation.coordinate.getX()-this.coordinate.getX();
		double largeur = otherLocation.coordinate.getY()-this.coordinate.getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return distance - this.radius - otherLocation.radius;
	}
}
