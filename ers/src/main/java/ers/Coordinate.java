package ers;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		else if (getClass() != o.getClass())
			return false;

		Coordinate other = (Coordinate) o;
		return this.y == other.y && this.x == other.x;
	}

	@Override
	public String toString(){
		return "x: " + x + " y: " + y;
	}
}
