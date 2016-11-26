
/**
 * Created by Ivan & Eddy
 */
public class Location {
	int x;
	int y;
	double radius;

	public Location(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Location(int x, int y) {
		this(x, y, 0);
	}

	public double distanceLocations(Location otherLocation)
	{
		double longueur = otherLocation.getX()-this.getX();
		double largeur = otherLocation.getY()-this.getY();
		double distance = Math.sqrt(Math.pow(longueur, 2) + Math.pow(largeur, 2));
		return distance - this.radius - otherLocation.radius;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		else if (getClass() != o.getClass())
			return false;

		Location other = (Location) o;
		return this.radius == other.radius && this.x == other.getX() && this.y == other.getY();
	}

	@Override
	public String toString(){
		return "x: " + x + " y: " + y + " " + Language.getString("radius") + ": " + radius;
	}
}
