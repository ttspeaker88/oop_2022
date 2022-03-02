package Alkalmazott.b;

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

}