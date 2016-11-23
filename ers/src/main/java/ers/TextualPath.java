package ers;

/**
 * Path towards two locations. Indicates the path via text.
 */
public class TextualPath extends Path{
	Language language;
	
	public TextualPath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}

	public String getPath(){
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
