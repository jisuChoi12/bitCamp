package kr.co.bit;

public class ArgsException extends Exception {
	private int argsNumber;

	public ArgsException() {
	}
	public ArgsException(String msg) {
		super(msg);
	}
	public int getArgsNumber() {
		return argsNumber;
	}
	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
}
