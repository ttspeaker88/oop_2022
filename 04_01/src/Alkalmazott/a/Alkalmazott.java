package Alkalmazott.a;

public class Alkalmazott {
	String nev;
	int fizetes;

	public void fizNovel(int novekmeny) {
		this.fizetes = this.fizetes + novekmeny;
	}

	public String getAdatok() {
		return "Nev: " + this.nev + " Fizetes: " + this.fizetes;
	}

}