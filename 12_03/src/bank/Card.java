package bank;

import java.time.LocalDate;

public class Card {
	private String nev;
	private LocalDate ervenyessegiDatum;
	private Bank bank;
	private int egyenleg;

	public Card(String nev, LocalDate ervenyesseg, Bank bank, int egyenleg) {
		this.nev = nev;
		this.bank = bank;
		this.ervenyessegiDatum = ervenyesseg;
		this.egyenleg = egyenleg;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public LocalDate getErvenyesseg() {
		return ervenyessegiDatum;
	}

	public void setErvenyesseg(LocalDate ervenyesseg) {
		this.ervenyessegiDatum = ervenyesseg;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	@Override
	public String toString() {
		return "Card [bank=" + bank + ", ervenyesseg=" + ervenyessegiDatum + ", egyenleg=" + egyenleg + "]";
	}
	
	public boolean ervenyesE() {
		LocalDate jelenlegiDatum = LocalDate.now();

		return this.ervenyessegiDatum.isBefore(jelenlegiDatum);
	}

	public boolean penzFelfevetel(int osszeg) {
		if (ervenyesE() || egyenleg < osszeg) {
			return false;
		}

		egyenleg -= osszeg;

		return true;
	}
}