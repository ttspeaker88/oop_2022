package alkalmazott.a;

public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	private static int nyugdijKorhatar = 65;

	public Alkalmazott(String nev, int kor, int fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev, int kor) {
		this(nev, kor, 10000 * kor);
	}

	public int getEvekSzamaNyugdijig() {
		return nyugdijKorhatar - this.kor;
	}

	@Override
	public String toString() {
		return "Nev:" + this.nev + " kor:" + this.kor + " fizetes:" + this.fizetes + " nyugdijig hatraleveo evek szama:"
				+ getEvekSzamaNyugdijig();
	}

	public Alkalmazott getTobbEvVanHatraAlk(Alkalmazott a1, Alkalmazott a2) {
		if (a1.getEvekSzamaNyugdijig() > a2.getEvekSzamaNyugdijig()) {
			return a1;
		}

		return a2;
	}

	public static void setNyugdijKorHatar(int nyugdijKorHatar) {
		Alkalmazott.nyugdijKorhatar = nyugdijKorHatar;
	}
}