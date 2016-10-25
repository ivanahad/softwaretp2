package ers;

/*
 * Represents a path given by auditive instructions
 */
public class AudioPath extends Path{
	
	Language language;
	
	public AudioPath(Language language, Location start, Location end){
		super(start, end);
		this.language=language;
	}
}
