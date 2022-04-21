package bank;

import exception.InsufficientFundsException;

public class Bankszamla {
	private String szamlaSzam;
	private int egyenleg;

	public Bankszamla(String szamlaSzam) {
		super();
		this.szamlaSzam = szamlaSzam;
		this.egyenleg = 0;
	}

	public String getSzamlaSzam() {
		return szamlaSzam;
	}

	public void setSzamlaSzam(String szamlaSzam) {
		this.szamlaSzam = szamlaSzam;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	public void penzBerak(int osszeg) {
		this.egyenleg += osszeg;
	}

	public void penzKivesz(int osszeg) throws InsufficientFundsException {
		if (this.egyenleg < osszeg) {
			int hianyzoOsszeg = Math.abs(osszeg - this.egyenleg);

			throw new InsufficientFundsException(hianyzoOsszeg);
		} else {
			this.egyenleg -= osszeg;
		}
	}

	@Override
	public String toString() {
		return "SzamlaSzam: " + szamlaSzam + " Egyenleg: " + egyenleg;
	}

}