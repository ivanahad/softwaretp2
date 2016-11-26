
/**
 * Created by Ivan & Eddy
 * This class represents the location of safe places. It is defined with a Location object and a description
 */
public class SafePlace extends Location{
	private String description;

	public SafePlace(int x, int y, double radius, String description) {
		super(x, y, radius);
		this.description = description;
	}

	public SafePlace(int x, int y, double radius) {
		this(x, y, radius, Language.getString("safe_place_default_description"));
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o){
		if (!super.equals(o))
			return false;
		SafePlace other = (SafePlace) o;
		return this.description == other.description;
	}

	@Override
	public String toString(){
		return Language.getString("safe_place") + ": " + super.toString() + "("  + description + ")";
	}
}
