package ers;

public class SafePlaceLocation extends Location{
	public double radius;
	
	public SafePlaceLocation(double radius, Coordinate coordinate){
		super(coordinate);
		this.radius=radius;
	}

}
