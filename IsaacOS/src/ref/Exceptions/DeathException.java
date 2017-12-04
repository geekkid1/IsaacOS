package ref.Exceptions;

public class DeathException extends java.lang.Exception {
	static final long serialVersionUID = 1;
	
	public DeathException(String msg) {
		super(msg);
	}
	public DeathException() {
		super("You died!");
	}
	public DeathException(int num) {
		super("With Code: " + num);
	}
}
