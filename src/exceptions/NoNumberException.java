package exceptions;

public class NoNumberException extends Exception {

	public NoNumberException() {
	}

	public NoNumberException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public NoNumberException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public NoNumberException(String arg0) {
		super(arg0);
	}

	public NoNumberException(Throwable arg0) {
		super(arg0);
	}

}
