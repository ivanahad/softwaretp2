
/**
 * Created by Ivan & Eddy
 */
public class Earthquake extends NaturalDisaster {
	public double magnitude;

	public Earthquake(int x, int y, double radius, double magnitude) {
		super(x, y, radius);
		this.magnitude = magnitude;
	}	

	public Earthquake(int x, int y, double radius){
		this(x, y, radius, 3.0);
	}

	@Override
	public String GiveSafetyInstructions() {
		return Language.getString("earthquake_safety_instructions");
	}


	@Override
	public String toString(){
		return  super.toString() + Language.getString("magnitude") +": " + magnitude +
				"( " + Language.getString("earthquake") + ")";
	}

	@Override
	public boolean equals(Object o){
		if (!super.equals(o))
			return false;
		Earthquake other = (Earthquake) o;
		return this.magnitude == other.magnitude;
	}
}