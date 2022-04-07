package myproducts;

public class Product {
	private String nev;
	private int nettoAr;
	private int afaKulcs;

	public Product(String nev, int nettoAr, int afaKulcs) {
		super();
		this.nev = nev;
		this.nettoAr = nettoAr;
		this.afaKulcs = afaKulcs;
	}

	public int getBruttoAr() {
		return this.nettoAr + (this.nettoAr * this.afaKulcs / 100);
	}

	@Override
	public String toString() {
		return "Nev: " + this.nev + " Brutto ar:" + getBruttoAr();
	}

	public int nettoArNovel(int szazalek) {
		return this.nettoAr + (this.nettoAr * szazalek / 100);
	}

	public int bruttoArHasonlit(Product masik) {
		if (this.getBruttoAr() > masik.getBruttoAr()) {
			return 1;
		} else if (this.getBruttoAr() < masik.getBruttoAr()) {
			return -1;
		}

		return 0;
	}
}