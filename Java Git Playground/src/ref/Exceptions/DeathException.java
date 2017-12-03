package ref.Exceptions;

public class DeathException extends java.lang.Exception {
	public DeathException(String msg) {
		super(msg);
	}
	public DeathException() {
		
	}
	public DeathException(int num) {
		super("With Code: " + num);
	}
}
