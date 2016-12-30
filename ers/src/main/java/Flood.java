package be.ucl.ingi.lingi2252;

/**
 * Created by Ivan & Eddy
 */
public class Flood extends NaturalDisaster{
	public Flood(int x, int y, double radius) {
		super(x, y, radius);
	}

	public Flood(Location location){
		super(location);
	}

	public static String giveSafetyInstructions() {
		return Language.getString("flood_safety_instructions");
	}


	@Override
	public String toString(){
		return super.toString() + "( "+ Language.getString("flood") + ")";
	}
}
