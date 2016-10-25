package ers;

/*
 * Represents a path given by a picture instructions
 */
public class ImagePath extends Path{
	Language language;
	
	public ImagePath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}
}
