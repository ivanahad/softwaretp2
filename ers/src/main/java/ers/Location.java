package ers;

public class Location {
	public Coordinate coordinate;
	
	public Location (Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public void updateLocation(Coordinate coordinate){
		this.coordinate=coordinate;
	}
}
