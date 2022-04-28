package bank;

import java.time.LocalDate;

public class CreditCard extends Card {
	private int hitelkeret;

	public CreditCard(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg) {
		super(nev, ervenyesseg, bank, egyenleg);
		this.hitelkeret = 100000;
	}

	public CreditCard(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg, int hitelkeret) {
		super(nev, ervenyesseg, bank, egyenleg);
		this.hitelkeret = hitelkeret;
	}

	@Override
	public boolean penzFelfevetel(int osszeg) {
		if (super.penzFelfevetel(osszeg) && this.hitelkeret >= osszeg) {
			this.hitelkeret -= osszeg;
			return true;
		} else if (!super.penzFelfevetel(osszeg) && this.hitelkeret < osszeg) {
			return false;
		}

		return false;
	}

	@Override
	public String toString() {
		return "CreditCard [hitelkeret=" + hitelkeret + "]" + super.toString();
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
}