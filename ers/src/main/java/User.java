package be.ucl.ingi.lingi2252;

import java.util.Objects;

/**
 * Created by Ivan & Eddy
 * This class represents a "Person" object, defined as a name and a number
 */
public class User implements EntityWithLocation{
	private String name;
	private Location location; //un User a une location


	//create an object of SingleObject
	private static User instance = new User();

	//Get the only object available
	public static User getInstance(){
		return instance;
	}

	private User() {
		name = "User";
		location = new Location(0,0,0.0);
	}

	public Location getLocation(){
		return location;
	}

	public static void modifName(String newname){
		instance.name = newname;
	}

	public static void modifLocation(Location location){
		instance.location = location;
	}

	public static Location getUserLocation(){
		return instance.getLocation();
	}

	@Override
	public boolean equals(Object o) {
		if(this==o){
			return true;
		}
		if(o==null){
			return false;
		}
		if(getClass()!=o.getClass()){
			return false;
		}
		User user = (User) o;
		
		return Objects.equals(name, user.name);
	}

	@Override
	public String toString(){
		return this.name + " " + this.location.toString();
	}
}
