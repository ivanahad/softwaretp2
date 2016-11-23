package ers;

/**
 * Path towards two endpoints.
 */
public class Path {
	
	public Location start;
	public Location end;
	Language language;

	public Path(Location start, Location end) {
		this.start = start;
		this.end=end;
	}
	
	public String givePathInstructions(){
		String path = "Go in direction of ";
		if (start.getCoordinate().getY() < end.getCoordinate().getY()){ // North
			path = path + "N";
		}
		else if (start.getCoordinate().getY() > end.getCoordinate().getY()){ //South
			path = path + "S";
		}
		if (start.getCoordinate().getX() < end.getCoordinate().getX()){ // East
			path = path + "E";
		}
		else if (start.getCoordinate().getX() > end.getCoordinate().getX()){ // West
			path = path + "W";
		}
		if (start.getCoordinate().getY() == end.getCoordinate().getY() &&
				start.getCoordinate().getX() == end.getCoordinate().getX()){
			path = "You've arrived";
		}

		return path;
	}
}
