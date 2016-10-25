package ers;

public class TextualPath extends Path{
	Language language;
	
	public TextualPath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}

}
