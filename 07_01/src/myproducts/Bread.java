package myproducts;

public class Bread extends Product {
	private double mennyiseg;

	public Bread(String nev, int nettoAr, int afaKulcs, double mennyiseg) {
		super(nev, nettoAr, afaKulcs);
		this.mennyiseg = mennyiseg;
	}

	public double getEgysegar() {
		return super.getBruttoAr() / this.mennyiseg;
	}

	@Override
	public String toString() {
		return super.toString() + " egysegar:" + getEgysegar();
	}
	
	public double getMennyiseg() {
		return this.mennyiseg;
	}

	public static boolean getEgysegarNagyobb(Bread b1, Bread b2) {
		if (b1.getEgysegar() > b2.getEgysegar())
			return true;
		
		return false;
	}	
}