/**
 * Path towards two endpoints.
 */

/**
 * Created by Ivan & Eddy
 * This class represents a Path towards two endpoints.
 */
public class Path {
	
	public Location start;
	public Location end;

	public Path(Location start, Location end) {
		this.start = start;
		this.end=end;
	}
	
	public String givePathInstructions(){
		String path = Language.getString("path_go_to") + " ";
		if (start.getY() < end.getY()){ // North
			path = path + Language.getString("path_north");
		}
		else if (start.getY() > end.getY()){ //South
			path = path + Language.getString("path_south");
		}
		if (start.getX() < end.getX()){ // East
			path = path + Language.getString("path_east");
		}
		else if (start.getX() > end.getX()){ // West
			path = path + Language.getString("path_west");
		}
		if (start.getY() == end.getY() &&
				start.getX() == end.getX()){
			path = Language.getString("path_reached_destination");
		}

		return path;
	}
}
