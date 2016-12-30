package be.ucl.ingi.lingi2252;

/**
 * Created by Ivan & Eddy
 * This class represents the location of safe places. It is defined with a Location object and a description
 */
public class SafePlace{
	private String description;
	public Location location;

	public SafePlace(int x, int y, double radius, String description) {
		this.location = new Location(x, y, radius);
		this.description = description;
	}

	public SafePlace(Location location, String description){
		this.location=location;
		this.description=description;
	}

	public Location getLocation() {
		return location;
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
		if(o == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		SafePlace other = (SafePlace) o;
		if(this.location.equals(this.location))
			return true;
		return false;
	}

	@Override
	public String toString(){
		return Language.getString("safe_place") + ": " + super.toString() + "("  + description + ")";
	}

}
