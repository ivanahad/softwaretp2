package ers;

public class Earthquake extends NaturalDisaster {
	public double magnitude;
	
	public Earthquake(Location epicentre, double radius, double magnitude) {
		super(epicentre, radius);
		this.magnitude = magnitude;
	}	
}