
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

	public static String giveSafetyInstructions() {
		return Language.getString("earthquake_safety_instructions");
	}


	@Override
	public String toString(){
		return  super.toString() + Language.getString("magnitude") +": " + magnitude +
				"( " + Language.getString("earthquake") + ")";
	}

}