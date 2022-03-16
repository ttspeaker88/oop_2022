package alkalmazott.b;

import java.time.LocalDate;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	private LocalDate szuletesiIdo;
	private static final int NYUGDIJKORHATAR = 65;

	private static String[] honapNevek;
	static {
		honapNevek = new String[13];
		honapNevek[0] = " ";
		honapNevek[1] = "januar";
		honapNevek[2] = "februar";
		honapNevek[3] = "marcius";
		honapNevek[4] = "aprilis";
		honapNevek[5] = "majus";
		honapNevek[6] = "junius";
		honapNevek[7] = "julius";
		honapNevek[8] = "augusztus";
		honapNevek[9] = "szeptember";
		honapNevek[10] = "oktober";
		honapNevek[11] = "november";
		honapNevek[12] = "december";
	}

	public Alkalmazott(String nev, int ev, int honap, int nap) {
		this.nev = nev;
		this.szuletesiIdo = LocalDate.of(ev, honap, nap);
		this.fizetes = getKor() * 10000;
	}

	public int getEvekSzamaNyugdijig() {
		return NYUGDIJKORHATAR - getKor();
	}

	@Override
	public String toString() {
		return "Nev:" + this.nev + " kor:" + getKor() + " fizetes:" + this.fizetes + " nyugdijig hatraleveo evek szama:"
				+ getEvekSzamaNyugdijig() + " szuletesi datum:" + this.szuletesiIdo;
	}

	public Alkalmazott getTobbEvVanHatraAlk(Alkalmazott a1, Alkalmazott a2) {
		if (a1.getEvekSzamaNyugdijig() > a2.getEvekSzamaNyugdijig()) {
			return a1;
		}

		return a2;
	}

	public String szulInfoKiir(String str) {
		String adatok = " ";

		switch (str) {
		case "kor":
			adatok = this.nev + ", kora: " + getKor() + " év";
			break;
		case "szulinap":
			adatok = this.nev + ", szülinapja.: " + getSzulinapMagyarul();
		}

		return adatok;
	}

	public String getSzulinapMagyarul() {
		int ev = szuletesiIdo.getYear();
		int honap = szuletesiIdo.getMonthValue();
		String honapNev = getHonapNev(honap);
		int nap = szuletesiIdo.getDayOfMonth();

		return ev + ". " + honapNev + " " + nap + ".";
	}

	public String getHonapNev(int honapIndex) {
		return honapNevek[honapIndex];
	}

	public int getHonapIndex(String honapnev) {
		for (int i = 1; i < honapNevek.length; i++) {
			if (honapNevek[i].equalsIgnoreCase(honapnev))
				return i;
		}
		return 0;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getKor() {
		return LocalDate.now().getYear() - this.szuletesiIdo.getYear();
	}

	public int getFizetes() {
		return fizetes;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	public LocalDate getSzuletesiIdo() {
		return szuletesiIdo;
	}

	public void setSzuletesiIdo(LocalDate szuletesiIdo) {
		this.szuletesiIdo = szuletesiIdo;
	}

}