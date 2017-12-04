package ref.Exceptions;

public class ExplodedException extends DeathException {
	
	static final long serialVersionUID = 1;
	
	public ExplodedException() {
		super("You Exploded and Died!");
	}
}
