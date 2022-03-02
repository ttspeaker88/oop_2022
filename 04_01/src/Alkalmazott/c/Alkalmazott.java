package Alkalmazott.c;

public class Alkalmazott {
	private String nev;
	private int fizetes;

	public void fizNovel(int novekmeny) {
		this.fizetes = this.fizetes + novekmeny;
	}

	public String getAdatok() {
		return "Nev: " + this.nev + " Fizetes: " + this.fizetes;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	public boolean getFizHatarok(int alsoHatar, int felsoHatar) {
		if (this.fizetes > alsoHatar && this.fizetes < felsoHatar)
			return true;

		return false;
	}

	public double getAdo() {
		return this.fizetes * 0.16;
	}

	public boolean getFizNagyobbMasikAlk(Alkalmazott masikAlk) {
		if (this.fizetes > masikAlk.fizetes) {
			return true;
		}

		return false;
	}

}