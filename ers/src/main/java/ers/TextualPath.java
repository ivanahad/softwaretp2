package ers;

public class TextualPath extends Path{
	Language language;
	
	public TextualPath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}

	public String getPath(){
		String path = "Go in direction of ";
		if (start.coordinate.getY() < end.coordinate.getY()){ // North
			path = path + "N";
		}
		else if (start.coordinate.getY() > end.coordinate.getY()){ //South
			path = path + "S";
		}
		if (start.coordinate.getX() < end.coordinate.getX()){ // East
			path = path + "E";
		}
		else if (start.coordinate.getX() > end.coordinate.getX()){ // West
			path = path + "W";
		}
		if (start.coordinate.getY() == end.coordinate.getY() &&
				start.coordinate.getX() == end.coordinate.getX()){
			path = "You've arrived";
		}

		return path;
	}

}
