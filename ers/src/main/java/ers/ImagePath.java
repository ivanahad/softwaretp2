package ers;

public class ImagePath extends Path{
	Language language;
	
	public ImagePath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}
}
