package ers;

public class SafePlace{
	private Location location;
	private String description;

	public SafePlace(Location location, String description) {
		this.location = location;
		this.description = description;
	}

	public SafePlace(Location location) {
		this.location = location;
		this.description = "A safe place";
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
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
		else if (getClass() != o.getClass())
			return false;

		SafePlace other = (SafePlace) o;
		return this.location.equals(other.location) && this.description == other.description;
	}
}
