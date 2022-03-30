package sikidom;

public class Teglatest extends Hasab {
	private int a;
	private int b;

	public Teglatest(int a, int b, int magassag) {
		super(magassag);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getAlapterulet() {
		return this.a * this.b;
	}

	@Override
	public String toString() {
		return "Teglatest: a:" + this.a + " b:" + this.b + " magassag:" + super.getMagassag() + " terfogat:"
				+ super.getTerfogat();
	}

}
