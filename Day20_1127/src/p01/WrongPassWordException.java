package p01;

public class WrongPassWordException extends Exception {
	
	public WrongPassWordException() {
		
	}
	public WrongPassWordException(String msg) {
		super(msg);
	}
}
