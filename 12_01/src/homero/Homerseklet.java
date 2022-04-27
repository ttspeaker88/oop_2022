package homero;

public class Homerseklet {
	private double homerseklet;
	private Mertekegyseg mertekEgyseg;

	public Homerseklet(double homerseklet, Mertekegyseg mertekE) {
		this.homerseklet = homerseklet;
		this.mertekEgyseg = mertekE;
	}

	public Homerseklet(double homerseklet) {
		this(homerseklet, Mertekegyseg.CELSIUS);
	}

	@Override
	public String toString() {
		return "Homerseklet [homerseklet=" + homerseklet + ", mertekEgyseg=" + mertekEgyseg + "]";
	}

	public double getHomerseklet() {
		return homerseklet;
	}

	public void setHomerseklet(double homerseklet) {
		this.homerseklet = homerseklet;
	}

	public Mertekegyseg getMertekE() {
		return mertekEgyseg;
	}

	public void setMertekE(Mertekegyseg mertekE) {
		this.mertekEgyseg = mertekE;
	}

	public static double konvHomerseklet(double homerseklet, Mertekegyseg mertekE) {
		if (mertekE == Mertekegyseg.CELSIUS) {
			return homerseklet - 273.15;
		}
		return homerseklet + 273.15;
	}
}
