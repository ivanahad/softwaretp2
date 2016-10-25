package ers;

public class NaturalDisasterLocation extends Location{
	public double radius;
	
	public NaturalDisasterLocation(double radius, Coordinate coordinate){
		super(coordinate);
		this.radius=radius;
	}
}
