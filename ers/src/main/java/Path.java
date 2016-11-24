/**
 * Path towards two endpoints.
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
		if (start.getCoordinate().getY() < end.getCoordinate().getY()){ // North
			path = path + Language.getString("path_north");
		}
		else if (start.getCoordinate().getY() > end.getCoordinate().getY()){ //South
			path = path + Language.getString("path_south");
		}
		if (start.getCoordinate().getX() < end.getCoordinate().getX()){ // East
			path = path + Language.getString("path_east");
		}
		else if (start.getCoordinate().getX() > end.getCoordinate().getX()){ // West
			path = path + Language.getString("path_west");
		}
		if (start.getCoordinate().getY() == end.getCoordinate().getY() &&
				start.getCoordinate().getX() == end.getCoordinate().getX()){
			path = Language.getString("path_reached_destination");
		}

		return path;
	}
}
