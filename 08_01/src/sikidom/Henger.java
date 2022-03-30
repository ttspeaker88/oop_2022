package sikidom;

public class Henger extends Hasab {
	private double sugar;

	public Henger(int magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	public double getAlapterulet() {
		return Math.pow(sugar, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Henger: sugar:" + this.sugar + " magassag:" + super.getMagassag() + " terfogat:" + super.getTerfogat();
	}

}