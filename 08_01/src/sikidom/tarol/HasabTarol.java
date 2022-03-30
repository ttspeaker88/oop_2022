package sikidom.tarol;

import sikidom.Hasab;
import sikidom.Henger;

public class HasabTarol {
	private Hasab[] hasabok;

	public HasabTarol(int meret) {
		this.hasabok = new Hasab[meret];
	}

	public void hasabHozzaAd(int index, Hasab hasab) {
		this.hasabok[index] = hasab;
	}

	public int getMeret() {
		return this.hasabok.length;
	}

	public Hasab getIndexElem(int index) {
		return this.hasabok[index];
	}

	public int getNemNullElemekSzama() {
		int db = 0;

		for (Hasab hasab : hasabok) {
			if (hasab != null)
				db++;
		}

		return db;
	}

	public double getAtlagosTerfogat() {
		double sum = 0;

		for (Hasab hasab : hasabok) {
			if (hasab != null)
				sum += hasab.getTerfogat();
		}

		return sum / getNemNullElemekSzama();
	}

	public int getHengerHasabokSzama() {
		int db = 0;

		for (Hasab hasab : hasabok) {
			if (hasab instanceof Henger)
				db++;
		}

		return db;
	}
}