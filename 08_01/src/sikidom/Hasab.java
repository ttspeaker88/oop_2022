package sikidom;

public abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}

	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}

	public abstract double getAlapterulet();

	public double getTerfogat() {
		return this.magassag * getAlapterulet();
	}

	public boolean hasabHasonlit(Hasab masik) {
		if (this.getTerfogat() > masik.getTerfogat())
			return true;

		return false;
	}
}
