package exception;

public class InsufficientFundsException extends Exception {
	private int hianyzoOsszeg;

	public InsufficientFundsException(int hianyzoOsszeg) {
		super();
		this.hianyzoOsszeg = hianyzoOsszeg;
	}

	public int getHianyzoOsszeg() {
		return hianyzoOsszeg;
	}

	public void setHianyzoOsszeg(int hianyzoOsszeg) {
		this.hianyzoOsszeg = hianyzoOsszeg;
	}

	@Override
	public String toString() {
		return "InsufficientFundsException [hianyzoOsszeg=" + hianyzoOsszeg + "]";
	}
	
	

}
